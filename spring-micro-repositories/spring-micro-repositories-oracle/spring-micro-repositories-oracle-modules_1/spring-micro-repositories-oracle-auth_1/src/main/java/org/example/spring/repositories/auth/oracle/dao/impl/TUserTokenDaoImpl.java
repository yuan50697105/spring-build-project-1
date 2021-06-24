package org.example.spring.repositories.auth.oracle.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.example.spring.repositories.auth.oracle.dao.TUserTokenDao;
import org.example.spring.repositories.auth.oracle.mapper.TUserTokenMapper;
import org.example.spring.repositories.auth.oracle.table.po.TUserToken;
import org.example.spring.repositories.auth.oracle.table.query.TUserTokenQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TUserTokenDaoImpl extends TkExtDaoImpl<TUserToken, TUserTokenQuery, TUserTokenMapper> implements TUserTokenDao {
}