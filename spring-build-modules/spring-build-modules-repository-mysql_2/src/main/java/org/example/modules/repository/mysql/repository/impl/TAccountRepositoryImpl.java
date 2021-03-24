package org.example.modules.repository.mysql.repository.impl;

import org.example.modules.repository.mysql.builder.UserBuilder;
import org.example.modules.repository.mysql.dao.TRoleDao;
import org.example.modules.repository.mysql.dao.TUserDao;
import org.example.modules.repository.mysql.dao.TUserRoleDao;
import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.modules.repository.mysql.entity.query.TAccountQuery;
import org.example.modules.repository.mysql.entity.vo.AccountVo;
import org.example.modules.repository.mysql.repository.TAccountRepository;
import org.example.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class TAccountRepositoryImpl extends IBaseRepositoryImpl<AccountVo, AccountVo, TAccountQuery> implements TAccountRepository {
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
    public void save(AccountVo accountVo) {
        TUser user = userBuilder.generateUser(accountVo.getAccount());
        userDao.save(user);
        List<Long> roleIds = roleDao.getRoleIdListByIds(accountVo.getRoleIds());
        userRoleDao.saveBatch(userBuilder.generateUserRoles(user.getId(), roleIds));
    }

    @Override
    public void update(AccountVo accountVo) {

    }

    @Override
    public void delete(List<Long> ids) {

    }
}