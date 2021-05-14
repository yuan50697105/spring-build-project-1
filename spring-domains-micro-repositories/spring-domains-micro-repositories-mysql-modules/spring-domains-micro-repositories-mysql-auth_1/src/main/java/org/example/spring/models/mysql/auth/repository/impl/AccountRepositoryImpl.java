package org.example.spring.models.mysql.auth.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.dao.TRoleDao;
import org.example.spring.daos.mysql.auth.dao.TUserDao;
import org.example.spring.daos.mysql.auth.dao.TUserRoleDao;
import org.example.spring.daos.mysql.auth.table.po.TUser;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.models.commons.enumerate.UserStatus;
import org.example.spring.models.commons.repository.impl.IBaseRepositoryImpl;
import org.example.spring.models.mysql.auth.builder.AuthModelBuilder;
import org.example.spring.models.mysql.auth.entity.query.AccountQuery;
import org.example.spring.models.mysql.auth.entity.result.Account;
import org.example.spring.models.mysql.auth.entity.result.AccountDetails;
import org.example.spring.models.mysql.auth.entity.vo.AccountModelVo;
import org.example.spring.models.mysql.auth.repository.AccountRepository;
import org.example.spring.models.mysql.auth.repository.ResourceRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadPoolExecutor;

@Repository
@AllArgsConstructor
@Transactional
public class AccountRepositoryImpl extends IBaseRepositoryImpl<Account, AccountModelVo, AccountDetails, AccountQuery> implements AccountRepository {
    private final ResourceRepository resourceRepository;
    private final TUserDao userDao;
    private final TRoleDao roleDao;
    private final TUserRoleDao userRoleDao;
    private final AuthModelBuilder authModelBuilder;
    private final ThreadPoolExecutor executor;

    @Override
    @Transactional
    public Long saveWithId(final AccountModelVo accountModelVo) {
        accountModelVo.saveValidate();
        accountModelVo.setSaveDefault();
        TUser account = accountModelVo.getUserForSave();
        userDao.save(account);
        final Long userId = account.getId();
        if (ObjectUtil.isNotEmpty(accountModelVo.getRoleIds())) {
            executor.execute(() -> saveUserRole(userId, accountModelVo.getRoleIds()));
        }
        return userId;
    }

    private void saveUserRole(Long userId, List<Long> roleIds) {
        List<Long> existRoleIds = roleDao.listRoleIdsByRoleIds(roleIds);
        userRoleDao.updateUserRole(userId, existRoleIds);
    }

    @Override
    @Transactional
    public void update(AccountModelVo accountModelVo) {
        Long id = accountModelVo.getId();
        TUser account = accountModelVo.getUserForUpdate();
        List<Long> roleIds = accountModelVo.getRoleIds();
        Optional<TUser> optional = userDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TUser tUser = optional.get();
            authModelBuilder.copyUser(account, tUser);
            userDao.updateById(tUser);
            if (!ObjectUtil.isAllEmpty(roleIds)) {
                executor.execute(() -> saveUserRole(tUser.getId(), roleIds));
            }
        }
    }

    @Override
    public void delete(List<Long> ids) {
        userDao.removeByIds(ids);
        userRoleDao.removeByUserIds(ids);
    }

    @Override
    public Account getById(Long id) {
        return authModelBuilder.buildAccount(userDao.getById(id));
    }

    @Override
    public AccountDetails getDetailsById(Long id) {
        AccountDetails accountDetails = new AccountDetails();
        accountDetails.setAccount(authModelBuilder.buildAccount(userDao.getById(id)));
        accountDetails.setRoles(authModelBuilder.buildRoleResult(userRoleDao.listByUserId(id)));
        accountDetails.setResources(resourceRepository.listAllResourceByUserId(id));
        return accountDetails;
    }

    @Override
    public IPageData<Account> queryPage(AccountQuery accountQuery) {
        TUserQuery query = authModelBuilder.buildAccountQuery(accountQuery);
        IPageData<TUser> data = userDao.queryPage(query);
        return authModelBuilder.buildAccounts(data);
    }

    @Override
    public List<Account> queryList(AccountQuery accountQuery) {
        TUserQuery query = authModelBuilder.buildAccountQuery(accountQuery);
        List<TUser> data = userDao.queryList(query);
        return authModelBuilder.buildAccounts(data);
    }

    @Override
    public Account queryOne(AccountQuery accountQuery) {
        TUserQuery query = authModelBuilder.buildAccountQuery(accountQuery);
        TUser data = userDao.queryOne(query);
        return authModelBuilder.buildAccount(data);
    }

    @Override
    public void updateStatus(UserStatus status, List<Long> ids) {
        userDao.updateStatusByIds(status.getValue(), ids);
    }

}