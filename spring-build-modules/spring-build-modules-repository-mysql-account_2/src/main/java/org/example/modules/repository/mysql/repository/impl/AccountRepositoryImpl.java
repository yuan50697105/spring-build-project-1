package org.example.modules.repository.mysql.repository.impl;

import cn.hutool.core.collection.CollUtil;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.builder.AccountBuilder;
import org.example.modules.repository.mysql.dao.TRoleDao;
import org.example.modules.repository.mysql.dao.TUserDao;
import org.example.modules.repository.mysql.dao.TUserPermissionDao;
import org.example.modules.repository.mysql.dao.TUserRoleDao;
import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.modules.repository.mysql.entity.query.AccountQuery;
import org.example.modules.repository.mysql.entity.query.TUserQuery;
import org.example.modules.repository.mysql.entity.result.Account;
import org.example.modules.repository.mysql.entity.result.AccountDetails;
import org.example.modules.repository.mysql.entity.result.Role;
import org.example.modules.repository.mysql.entity.result.User;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.example.modules.repository.mysql.helper.AccountHelper;
import org.example.modules.repository.mysql.repository.AccountRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.example.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static cn.hutool.core.util.ObjectUtil.isNotEmpty;

@Repository
@Transactional
@AllArgsConstructor
@CacheConfig(cacheNames = {AccountRepositoryImpl.ACCOUNTS, AccountRepositoryImpl.USERS})
public class AccountRepositoryImpl extends IBaseRepositoryImpl<Account, AccountFormVo, AccountDetails, AccountQuery> implements AccountRepository {
    public static final String ACCOUNTS = "accounts";
    public static final String USERS = "users";
    private final AccountBuilder accountBuilder;
    private final AccountHelper accountHelper;
    private final TUserDao userDao;
    private final TRoleDao roleDao;
    private final TUserRoleDao userRoleDao;
    private final TUserPermissionDao userPermissionDao;
    private final CacheManager cacheManager;

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
        @NotEmpty Long id = accountFormVo.getId();
        Optional<TUser> optional = userDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TUser tUser = optional.get();
            accountBuilder.copyUser(accountFormVo.getUser(), tUser);
            userDao.updateById(tUser);
//            accountHelper.handleUserRoleUpdate(id, accountFormVo.getRoleIds(), accountFormVo.getRoleNames());
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
    public AccountDetails getById(Long id) {
        AccountDetails accountDetails = new AccountDetails();
        accountDetails.setId(id);
        User user = accountBuilder.generateUserInfo(userDao.getById(id));
        accountDetails.setUser(user);
        Set<Role> roles = accountBuilder.generateUserRoleInfos(userRoleDao.getRolesByUserId(id));
        accountDetails.setRoles(roles);
        accountDetails.setPermissions(accountBuilder.generateUserPermissionInfos(userPermissionDao.getPermissionsByUserId(id)));
        return accountDetails;
    }

    @Override
    public IPageData<Account> queryPage(AccountQuery accountQuery) {
        TUserQuery userQuery = getUserQuery(accountQuery);
        IPageData<TUser> data = userDao.queryPage(userQuery);
        return accountBuilder.generateAccountVoPage(data);
    }

    @Override
    public List<Account> queryList(AccountQuery accountQuery) {
        TUserQuery userQuery = getUserQuery(accountQuery);
        List<TUser> tUsers = userDao.queryList(userQuery);
        return accountBuilder.generateAccountVoList(tUsers);
    }

    @Override
    public Account queryOne(AccountQuery accountQuery) {
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
    public AccountDetails getByUsername(String username) {
        Optional<TUser> optional = userDao.getByUsernameOpt(username);
        if (optional.isPresent()) {
            AccountDetails accountDetails = new AccountDetails();
            TUser tUser = optional.get();
            accountDetails.setId(tUser.getId());
            accountDetails.setUser(accountBuilder.generateUserInfo(tUser));
            accountDetails.setRoles(accountBuilder.generateUserRoleInfos(userRoleDao.getRolesByUsername(username)));
            return accountDetails;
        } else {
            return null;
        }
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "#username"),
    })
    public Optional<AccountDetails> getByUsernameOpt(String username) {
        return Optional.ofNullable(getByUsername(username));
    }

    @Override
    public void updateStatus(List<Long> ids, int status) {
        userDao.updateStatus(ids, status);
    }

    private void putCache(Long id, String username, String name) {
        Cache accounts = cacheManager.getCache(ACCOUNTS);
        Cache users = cacheManager.getCache(USERS);
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("username", username);
        map.put("name", name);
        if (isNotEmpty(id)) {
            accounts.put(id, map);
            users.put(id, map);
        }
        if (isNotEmpty(username)) {
            accounts.put(username, map);
            users.put(username, map);
        }
        if (isNotEmpty(name)) {
            accounts.put(name,map);
            users.put(name, map);
        }
    }
}