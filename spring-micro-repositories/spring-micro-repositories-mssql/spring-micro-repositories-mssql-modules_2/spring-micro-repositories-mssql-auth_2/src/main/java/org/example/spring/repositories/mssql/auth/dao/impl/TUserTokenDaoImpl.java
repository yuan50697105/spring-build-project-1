package org.example.spring.repositories.mssql.auth.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.example.spring.repositories.mssql.auth.dao.TUserTokenDao;
import org.example.spring.repositories.mssql.auth.mapper.TUserTokenMapper;
import org.example.spring.repositories.mssql.auth.table.po.TUserToken;
import org.example.spring.repositories.mssql.auth.table.query.TUserTokenQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TUserTokenDaoImpl extends TkExtDaoImpl<TUserToken, TUserTokenQuery, TUserTokenMapper> implements TUserTokenDao {
}