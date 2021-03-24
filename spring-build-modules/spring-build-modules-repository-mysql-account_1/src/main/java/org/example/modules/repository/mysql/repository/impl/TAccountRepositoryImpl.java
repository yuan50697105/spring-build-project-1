package org.example.modules.repository.mysql.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import org.example.modules.repository.mysql.builder.UserBuilder;
import org.example.modules.repository.mysql.dao.TRoleDao;
import org.example.modules.repository.mysql.dao.TUserDao;
import org.example.modules.repository.mysql.dao.TUserRoleDao;
import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.modules.repository.mysql.entity.query.TAccountQuery;
import org.example.modules.repository.mysql.entity.vo.TAccountVo;
import org.example.modules.repository.mysql.helper.TAccountHelper;
import org.example.modules.repository.mysql.validator.TAccountValidator;
import org.example.modules.repository.mysql.repository.TAccountRepository;
import org.example.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class TAccountRepositoryImpl extends IBaseRepositoryImpl<TAccountVo, TAccountVo, TAccountQuery> implements TAccountRepository {
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
    public void save(@Validated TAccountVo tAccountVo) {
        accountValidator.validate(tAccountVo);
        TUser user = userBuilder.generateUser(tAccountVo.getAccount());
        userDao.save(user);
        if (ObjectUtil.isAllEmpty(tAccountVo.getRoleIds(), tAccountVo.getRoleNames())) {
            throw new RuntimeException("角色信息错误");
        } else {
            List<Long> roleIds = accountHelper.getRoleIdList(tAccountVo);
            userRoleDao.saveBatch(userBuilder.generateUserRoles(user.getId(), roleIds));
        }
    }

    @Override
    public void update(TAccountVo tAccountVo) {

    }

    @Override
    public void delete(List<Long> ids) {

    }
}