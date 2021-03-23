package org.example.modules.repository.mysql.dao.impl;

import org.example.modules.repository.mysql.dao.TUserDao;
import org.example.modules.repository.mysql.entity.TUser;
import org.example.modules.repository.mysql.entity.query.TUserQuery;
import org.example.modules.repository.mysql.mapper.TUserMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class TUserDaoImpl extends TkBaseDaoImpl<TUser, TUserQuery, TUserMapper> implements TUserDao {
}