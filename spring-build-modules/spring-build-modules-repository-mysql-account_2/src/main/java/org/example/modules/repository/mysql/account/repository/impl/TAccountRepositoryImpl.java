package org.example.modules.repository.mysql.account.repository.impl;

import org.example.modules.repository.mysql.account.builder.UserBuilder;
import org.example.modules.repository.mysql.account.dao.TRoleDao;
import org.example.modules.repository.mysql.account.dao.TUserDao;
import org.example.modules.repository.mysql.account.dao.TUserRoleDao;
import org.example.modules.repository.mysql.account.entity.TUser;
import org.example.modules.repository.mysql.account.entity.query.TAccountQuery;
import org.example.modules.repository.mysql.account.entity.vo.TAccountVo;
import org.example.modules.repository.mysql.account.repository.TAccountRepository;
import org.example.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional
    public void save(TAccountVo tAccountVo) {
        TUser user = userBuilder.generateUser(tAccountVo.getAccount());
        userDao.save(user);
        List<Long> roleIds = roleDao.getRoleIdListByIds(tAccountVo.getRoleIds());
        userRoleDao.saveBatch(userBuilder.generateUserRoles(user.getId(), roleIds));
    }

    @Override
    public void update(TAccountVo tAccountVo) {

    }

    @Override
    public void delete(List<Long> ids) {

    }
}