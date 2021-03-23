package org.example.modules.repository.mysql.account.dao.impl;

import org.example.modules.repository.mysql.account.dao.TUserDao;
import org.example.modules.repository.mysql.account.entity.TUser;
import org.example.modules.repository.mysql.account.entity.query.TUserQuery;
import org.example.modules.repository.mysql.account.mapper.TUserMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class TUserDaoImpl extends TkBaseDaoImpl<TUser, TUserQuery, TUserMapper> implements TUserDao {
}