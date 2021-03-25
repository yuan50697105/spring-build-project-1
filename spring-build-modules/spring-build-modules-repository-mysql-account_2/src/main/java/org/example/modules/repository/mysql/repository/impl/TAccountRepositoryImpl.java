package org.example.modules.repository.mysql.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import org.example.modules.repository.mysql.builder.UserBuilder;
import org.example.modules.repository.mysql.dao.TRoleDao;
import org.example.modules.repository.mysql.dao.TUserDao;
import org.example.modules.repository.mysql.dao.TUserRoleDao;
import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.modules.repository.mysql.entity.query.TAccountQuery;
import org.example.modules.repository.mysql.entity.vo.AccountVo;
import org.example.modules.repository.mysql.helper.TAccountHelper;
import org.example.modules.repository.mysql.repository.TAccountRepository;
import org.example.modules.repository.mysql.validator.TAccountValidator;
import org.example.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Repository
@Transactional
@Cacheable(cacheNames = {"accounts", "users"})
public class TAccountRepositoryImpl extends IBaseRepositoryImpl<AccountVo, AccountVo, TAccountQuery> implements TAccountRepository {
    @Autowired
    private UserBuilder userBuilder;
    @Autowired
    private TUserDao userDao;
    @Autowired
    private TRoleDao roleDao;
    @Autowired
    private TUserRoleDao userRoleDao;
    @Autowired
    private TAccountValidator accountValidator;
    @Autowired
    private TAccountHelper accountHelper;

    @Override
    @Transactional
    @CachePut
    public void save(@Validated AccountVo accountVo) {
        accountValidator.validate(accountVo);
        TUser user = userBuilder.generateUser(accountVo.getAccount());
        userDao.save(user);
        if (ObjectUtil.isAllEmpty(accountVo.getRoleIds(), accountVo.getRoleNames())) {
            throw new RuntimeException("角色信息错误");
        } else {
            List<Long> roleIds = accountHelper.getRoleIdList(accountVo);
            userRoleDao.saveBatch(userBuilder.generateUserRoles(user.getId(), roleIds));
        }
    }

    @Override
    @CachePut
    public void update(AccountVo accountVo) {

    }

    @Override
    @CacheEvict
    public void delete(List<Long> ids) {

    }
}