package org.example.spring.daos.mssql.auth.dao.impl;

import org.example.spring.daos.mssql.auth.dao.TUserDao;
import org.example.spring.daos.mssql.auth.mapper.TUserMapper;
import org.example.spring.daos.mssql.auth.table.po.TUser;
import org.example.spring.daos.mssql.auth.table.query.TUserQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TUserDaoImpl extends TkExtDaoImpl<TUser, TUserQuery, TUserMapper> implements TUserDao {
}