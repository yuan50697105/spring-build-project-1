package org.example.modules.repository.mysql.repository.impl;

import cn.hutool.core.collection.CollUtil;
import org.example.modules.repository.mysql.builder.AccountBuilder;
import org.example.modules.repository.mysql.dao.TRoleDao;
import org.example.modules.repository.mysql.dao.TUserDao;
import org.example.modules.repository.mysql.dao.TUserRoleDao;
import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.modules.repository.mysql.entity.query.AccountQuery;
import org.example.modules.repository.mysql.entity.query.TUserQuery;
import org.example.modules.repository.mysql.entity.vo.AccountDetailVo;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.example.modules.repository.mysql.entity.vo.AccountVo;
import org.example.modules.repository.mysql.helper.AccountHelper;
import org.example.modules.repository.mysql.repository.AccountRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.example.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
@Transactional
@Cacheable(cacheNames = {"accounts", "users"},sync = true)
public class AccountRepositoryImpl extends IBaseRepositoryImpl<AccountVo, AccountFormVo, AccountDetailVo, AccountQuery> implements AccountRepository {
    @Autowired
    private AccountBuilder accountBuilder;
    @Autowired
    private TUserDao userDao;
    @Autowired
    private TRoleDao roleDao;
    @Autowired
    private TUserRoleDao userRoleDao;
    @Autowired
    private AccountHelper accountHelper;

    @Override
    @Transactional
    @Caching(put = {
            @CachePut(key = "#accountFormVo.id"),
            @CachePut(key = "#accountFormVo.user.username")
    })
    public void save(@Validated AccountFormVo accountFormVo) {
        accountHelper.validate(accountFormVo);
        TUser user = accountBuilder.generateUser(accountFormVo.getUser());
        userDao.save(user);
        List<Long> roleIds = roleDao.getRoleIdListByIdsOrNames(accountFormVo.getRoleIds(), accountFormVo.getRoleNames());
        userRoleDao.saveBatch(accountBuilder.generateUserRoles(user.getId(), roleIds));
    }

    @Override
    @Transactional
    @Caching(put = {
            @CachePut(key = "#accountFormVo.id"),
            @CachePut(key = "#accountFormVo.user.username")
    })
    public void update(@Validated AccountFormVo accountFormVo) {
        update(accountFormVo.getId(),accountFormVo);
    }

    @Override
    @Caching(put = {
            @CachePut(key = "#accountFormVo.id"),
            @CachePut(key = "#accountFormVo.user.username")
    })
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
    @CacheEvict(key = "ids")
    public void delete(List<Long> ids) {
        ids = CollUtil.emptyIfNull(ids).stream().distinct().collect(Collectors.toList());
        userDao.removeByIds(ids);
        userRoleDao.removeByUserIds(ids);
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "#result.id"),
            @Cacheable(key = "#result.user.username"),
    })
    public AccountDetailVo getById(Long id) {
        AccountDetailVo accountDetailVo = new AccountDetailVo();
        accountDetailVo.setId(id);
        accountDetailVo.setUser(accountBuilder.generateUserInfo(userDao.getById(id)));
        accountDetailVo.setRoles(accountBuilder.generateUserRoleInfos(userRoleDao.getRolesByUserId(id)));
        return accountDetailVo;
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "accountQuery.id"),
            @Cacheable(key = "accountQuery.username")
    })
    public IPageData<AccountVo> queryPage(AccountQuery accountQuery) {
        TUserQuery userQuery = getUserQuery(accountQuery);
        IPageData<TUser> data = userDao.queryPage(userQuery);
        return accountBuilder.generateAccountVoPage(data);
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "accountQuery.id"),
            @Cacheable(key = "accountQuery.username")
    })
    public Iterable<AccountVo> queryList(AccountQuery accountQuery) {
        TUserQuery userQuery = getUserQuery(accountQuery);
        List<TUser> tUsers = userDao.queryList(userQuery);
        return accountBuilder.generateAccountVoList(tUsers);
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "accountQuery.id"),
            @Cacheable(key = "accountQuery.username")
    })
    public AccountVo queryOne(AccountQuery accountQuery) {
        TUserQuery query = getUserQuery(accountQuery);
        TUser tUser = userDao.queryOne(query);
        return accountBuilder.generateAccountVo(tUser);
    }

    private TUserQuery getUserQuery(AccountQuery accountQuery) {
        return accountBuilder.generateUserQuery(accountQuery);
    }


}