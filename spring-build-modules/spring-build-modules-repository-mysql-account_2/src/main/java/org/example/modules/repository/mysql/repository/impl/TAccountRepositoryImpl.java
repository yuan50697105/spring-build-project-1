package org.example.modules.repository.mysql.repository.impl;

import cn.hutool.core.collection.CollUtil;
import org.example.modules.repository.mysql.builder.AccountBuilder;
import org.example.modules.repository.mysql.dao.TRoleDao;
import org.example.modules.repository.mysql.dao.TUserDao;
import org.example.modules.repository.mysql.dao.TUserRoleDao;
import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.modules.repository.mysql.entity.query.AccountQuery;
import org.example.modules.repository.mysql.entity.vo.AccountDetailVo;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.example.modules.repository.mysql.entity.vo.AccountVo;
import org.example.modules.repository.mysql.helper.TAccountHelper;
import org.example.modules.repository.mysql.repository.TAccountRepository;
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

import java.util.List;
import java.util.stream.Collectors;

@Repository
@Transactional
@Cacheable(cacheNames = {"accounts", "users"},sync = true)
public class TAccountRepositoryImpl extends IBaseRepositoryImpl<AccountVo, AccountFormVo, AccountDetailVo, AccountQuery> implements TAccountRepository {
    @Autowired
    private AccountBuilder accountBuilder;
    @Autowired
    private TUserDao userDao;
    @Autowired
    private TRoleDao roleDao;
    @Autowired
    private TUserRoleDao userRoleDao;
    @Autowired
    private TAccountHelper accountHelper;

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
    public void update(AccountFormVo accountFormVo) {

    }

    @Override
    public void update(Long id, AccountFormVo formVo) {
        TUser user = userDao.getById(id);
        accountBuilder.copyUser(formVo.getUser(), user);
        userDao.updateById(user);
        accountHelper.handleUserRoleUpdate(id, formVo.getRoleIds(), formVo.getRoleNames());
    }

    @Override
    @Transactional
    @CacheEvict(key = "ids.iterator()")
    public void delete(List<Long> ids) {
        ids = CollUtil.emptyIfNull(ids).stream().distinct().collect(Collectors.toList());
        userDao.removeByIds(ids);
        userRoleDao.removeByUserIds(ids);
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "#result.id"),
            @Cacheable(key = "#result.user.username"),
            @Cacheable(key = "#result.id+'_'+#result.user.name"),
            @Cacheable(key = "#result.user.username+'_'+#result.user.name"),
    })
    public AccountDetailVo getById(Long id) {
        AccountDetailVo accountDetailVo = new AccountDetailVo();
        accountDetailVo.setId(id);
        accountDetailVo.setUser(accountBuilder.generateUserInfo(userDao.getById(id)));
        accountDetailVo.setRoles(accountBuilder.generateUserRoleInfos(userRoleDao.getRolesByUserId(id)));
        return accountDetailVo;
    }

    @Override
    public IPageData<AccountVo> queryPage(AccountQuery accountQuery) {
        return accountBuilder.generateAccountVoPage(userDao.queryPage(accountBuilder.generateUserQuery(accountQuery)));
    }

    @Override
    public Iterable<AccountVo> queryList(AccountQuery accountQuery) {
        return null;
    }

    @Override
    public AccountVo queryOne(AccountQuery accountQuery) {
        return null;
    }


}