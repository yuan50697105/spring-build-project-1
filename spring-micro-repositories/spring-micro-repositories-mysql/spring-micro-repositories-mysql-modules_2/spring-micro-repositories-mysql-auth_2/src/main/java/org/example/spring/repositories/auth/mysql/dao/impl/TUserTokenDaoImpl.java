package org.example.spring.repositories.auth.mysql.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.example.spring.repositories.auth.mysql.dao.TUserTokenDao;
import org.example.spring.repositories.auth.mysql.mapper.TUserTokenMapper;
import org.example.spring.repositories.auth.mysql.table.po.TUserToken;
import org.example.spring.repositories.auth.mysql.table.query.TUserTokenQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TUserTokenDaoImpl extends TkExtDaoImpl<TUserToken, TUserTokenQuery, TUserTokenMapper> implements TUserTokenDao {
}