package org.example.spring.infrastructures.mysql.auth.repository.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.exceptions.ValidateException;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.builder.AccountBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TRoleDao;
import org.example.spring.infrastructures.mysql.auth.dao.TUserDao;
import org.example.spring.infrastructures.mysql.auth.dao.TUserRoleDao;
import org.example.spring.infrastructures.mysql.auth.entity.query.AccountQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Account;
import org.example.spring.infrastructures.mysql.auth.entity.result.AccountDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.AccountFormVo;
import org.example.spring.infrastructures.mysql.auth.entity.vo.AccountVo;
import org.example.spring.infrastructures.mysql.auth.repository.AccountRepository;
import org.example.spring.infrastructures.mysql.auth.table.po.TUser;
import org.example.spring.infrastructures.mysql.auth.table.query.TUserQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
@Transactional
public class AccountRepositoryImpl implements AccountRepository {
    private final TUserDao userDao;
    private final TRoleDao roleDao;
    private final TUserRoleDao userRoleDao;
    private final AccountBuilder accountBuilder;
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
        TUser entity = accountBuilder.buildUser(account);
        userDao.save(entity);
        List<Long> existRoleIds = roleDao.listRoleIdsByRoleIdsOrRoleName(roleIds, roleName);
        Long userId = entity.getId();
        userRoleDao.saveBatch(accountBuilder.buildRoles(userId, existRoleIds));
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
            accountBuilder.copyUser(account, tUser);
            List<Long> existRoleIds = roleDao.listRoleIdsByRoleIdsOrRoleName(roleIds, roleName);
            userRoleDao.saveUpdate(id,existRoleIds);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        userDao.removeByIds(ids);
        userRoleDao.removeByUserIds(ids);
    }

    @Override
    public AccountDetails getById(Long id) {
        AccountDetails accountDetails = new AccountDetails();
        accountDetails.setAccount(accountBuilder.buildAccount(userDao.getById(id)));
        accountDetails.setRoles(accountBuilder.buildRoleResult(userRoleDao.listByUserId(id)));
        return accountDetails;
    }

    @Override
    public IPageData<Account> queryPage(AccountQuery accountQuery) {
        TUserQuery query = accountBuilder.buildQuery(accountQuery);
        IPageData<TUser> data = userDao.queryPage(query);
        return accountBuilder.buildAccounts(data);
    }

    @Override
    public List<Account> queryList(AccountQuery accountQuery) {
        TUserQuery query = accountBuilder.buildQuery(accountQuery);
        List<TUser> data = userDao.queryList(query);
        return accountBuilder.buildAccounts(data);
    }

    @Override
    public Account queryOne(AccountQuery accountQuery) {
        TUserQuery query = accountBuilder.buildQuery(accountQuery);
        TUser data = userDao.queryOne(query);
        return accountBuilder.buildAccount(data);
    }

    private void validateUsername(String username) {
        if (userDao.existByUsername(username)) {
            throw new ValidateException(username + "已存在");
        }
    }
}