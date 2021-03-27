package org.example.modules.repository.mysql.repository.impl;

import cn.hutool.core.collection.CollUtil;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.builder.AccountBuilder;
import org.example.modules.repository.mysql.dao.*;
import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.modules.repository.mysql.entity.query.AccountQuery;
import org.example.modules.repository.mysql.entity.query.TUserQuery;
import org.example.modules.repository.mysql.entity.result.AccountDetailResult;
import org.example.modules.repository.mysql.entity.result.AccountResult;
import org.example.modules.repository.mysql.entity.result.RoleInfoResult;
import org.example.modules.repository.mysql.entity.result.UserInfoResult;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.example.modules.repository.mysql.helper.AccountHelper;
import org.example.modules.repository.mysql.repository.AccountRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.example.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
@Transactional
@AllArgsConstructor
@CacheConfig(cacheNames = {"accounts", "users"})
public class AccountRepositoryImpl extends IBaseRepositoryImpl<AccountResult, AccountFormVo, AccountDetailResult, AccountQuery> implements AccountRepository {
    private final AccountBuilder accountBuilder;
    private final AccountHelper accountHelper;
    private final TUserDao userDao;
    private final TRoleDao roleDao;
    private final TUserRoleDao userRoleDao;
    private final TRolePermissionDao rolePermissionDao;
    private final TUserPermissionDao userPermissionDao;

    @Override
    @Transactional
    public void save(@Validated AccountFormVo accountFormVo) {
        saveWithId(accountFormVo);
    }

    @Override
    @Transactional
    public Long saveWithId(AccountFormVo accountFormVo) {
        accountHelper.validate(accountFormVo);
        TUser user = accountBuilder.generateUser(accountFormVo.getUser());
        userDao.save(user);
        List<Long> roleIds = roleDao.getRoleIdListByIdsOrNames(accountFormVo.getRoleIds(), accountFormVo.getRoleNames());
        userRoleDao.saveBatch(accountBuilder.generateUserRoles(user.getId(), roleIds));
        return user.getId();
    }

    @Override
    @Transactional
    public void update(@Validated AccountFormVo accountFormVo) {
        update(accountFormVo.getId(),accountFormVo);
    }

    @Override
    public void update(@NotEmpty Long id, @Validated AccountFormVo formVo) {
        Optional<TUser> optional = userDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TUser tUser = optional.get();
            accountBuilder.copyUser(formVo.getUser(), tUser);
            userDao.updateById(tUser);
            accountHelper.handleUserRoleUpdate(id, formVo.getRoleIds(), formVo.getRoleNames());
        }
    }

    @Override
    @Transactional
    @CacheEvict(key = "#ids")
    public void delete(List<Long> ids) {
        ids = CollUtil.emptyIfNull(ids).stream().distinct().collect(Collectors.toList());
        userDao.removeByIds(ids);
        userRoleDao.removeByUserIds(ids);
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "#id"),
    })
    public AccountDetailResult getById(Long id) {
        AccountDetailResult accountDetailResult = new AccountDetailResult();
        accountDetailResult.setId(id);
        UserInfoResult user = accountBuilder.generateUserInfo(userDao.getById(id));
        accountDetailResult.setUser(user);
        Set<RoleInfoResult> roles = accountBuilder.generateUserRoleInfos(userRoleDao.getRolesByUserId(id));
        accountDetailResult.setRoles(roles);
        accountDetailResult.setPermissions(accountBuilder.generateUserPermissionInfos(userPermissionDao.getPermissionsByUserId(id)));
        return accountDetailResult;
    }

    @Override
    public IPageData<AccountResult> queryPage(AccountQuery accountQuery) {
        TUserQuery userQuery = getUserQuery(accountQuery);
        IPageData<TUser> data = userDao.queryPage(userQuery);
        return accountBuilder.generateAccountVoPage(data);
    }

    @Override
    public List<AccountResult> queryList(AccountQuery accountQuery) {
        TUserQuery userQuery = getUserQuery(accountQuery);
        List<TUser> tUsers = userDao.queryList(userQuery);
        return accountBuilder.generateAccountVoList(tUsers);
    }

    @Override
    public AccountResult queryOne(AccountQuery accountQuery) {
        TUserQuery query = getUserQuery(accountQuery);
        TUser tUser = userDao.queryOne(query);
        return accountBuilder.generateAccountVo(tUser);
    }

    private TUserQuery getUserQuery(AccountQuery accountQuery) {
        return accountBuilder.generateUserQuery(accountQuery);
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "#username")
    })
    public AccountDetailResult getByUsername(String username) {
        Optional<TUser> optional = userDao.getByUsernameOpt(username);
        if (optional.isPresent()) {
            AccountDetailResult accountDetailResult = new AccountDetailResult();
            TUser tUser = optional.get();
            accountDetailResult.setId(tUser.getId());
            accountDetailResult.setUser(accountBuilder.generateUserInfo(tUser));
            accountDetailResult.setRoles(accountBuilder.generateUserRoleInfos(userRoleDao.getRolesByUsername(username)));
            return accountDetailResult;
        } else {
            return null;
        }
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "#username"),
    })
    public Optional<AccountDetailResult> getByUsernameOpt(String username) {
        return Optional.empty();
    }
}