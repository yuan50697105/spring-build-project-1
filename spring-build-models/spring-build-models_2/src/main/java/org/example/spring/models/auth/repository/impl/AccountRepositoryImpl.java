package org.example.spring.models.auth.repository.impl;

import cn.hutool.core.exceptions.ValidateException;
import cn.hutool.core.util.ObjectUtil;
import lombok.AllArgsConstructor;
import org.example.spring.models.auth.builder.AuthModelBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TRoleDao;
import org.example.spring.infrastructures.mysql.auth.dao.TUserDao;
import org.example.spring.infrastructures.mysql.auth.dao.TUserRoleDao;
import org.example.spring.models.auth.entity.query.AccountQuery;
import org.example.spring.models.auth.entity.result.Account;
import org.example.spring.models.auth.entity.result.AccountDetails;
import org.example.spring.models.auth.entity.vo.AccountFormVo;
import org.example.spring.models.auth.entity.vo.AccountVo;
import org.example.spring.models.auth.repository.AccountRepository;
import org.example.spring.infrastructures.mysql.auth.table.po.TUser;
import org.example.spring.infrastructures.mysql.auth.table.query.TUserQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
@Transactional
public class AccountRepositoryImpl extends IBaseRepositoryImpl<Account,AccountFormVo,AccountDetails,AccountQuery> implements AccountRepository {
    private final TUserDao userDao;
    private final TRoleDao roleDao;
    private final TUserRoleDao userRoleDao;
    private final AuthModelBuilder authModelBuilder;
    @Override
    public void save(AccountFormVo accountFormVo) {
        saveWithId(accountFormVo);
    }

    @Override
    public Long saveWithId(AccountFormVo accountFormVo) {
        AccountVo account = accountFormVo.getAccount();
        List<Long> roleIds = accountFormVo.getRoleIds();
        List<String> roleName = accountFormVo.getRoleName();
        String username = accountFormVo.getUsername();
        validateUsername(username);
        TUser entity = authModelBuilder.buildUser(account);
        userDao.save(entity);
        List<Long> existRoleIds = roleDao.listRoleIdsByRoleIdsOrRoleName(roleIds, roleName);
        Long userId = entity.getId();
        userRoleDao.saveBatch(authModelBuilder.buildRoles(userId, existRoleIds));
        return userId;
    }

    @Override
    public void update(AccountFormVo accountFormVo) {
        Long id = accountFormVo.getId();
        AccountVo account = accountFormVo.getAccount();
        List<Long> roleIds = accountFormVo.getRoleIds();
        List<String> roleName = accountFormVo.getRoleName();
        Optional<TUser> optional = userDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TUser tUser = optional.get();
            authModelBuilder.copyUser(account, tUser);
            userDao.updateById(tUser);
            if (!ObjectUtil.isAllEmpty(roleIds, roleName)) {
                List<Long> existRoleIds = roleDao.listRoleIdsByRoleIdsOrRoleName(roleIds, roleName);
                if (ObjectUtil.isNotEmpty(existRoleIds)) {
                    userRoleDao.saveUpdate(id, existRoleIds);
                }
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

    private void validateUsername(String username) {
        if (userDao.existByUsername(username)) {
            throw new ValidateException(username + "已存在");
        }
    }
}