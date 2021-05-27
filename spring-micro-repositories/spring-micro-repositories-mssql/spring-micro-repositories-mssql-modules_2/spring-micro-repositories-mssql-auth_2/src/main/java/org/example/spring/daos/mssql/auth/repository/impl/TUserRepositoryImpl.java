package org.example.spring.daos.mssql.auth.repository.impl;

import org.example.spring.daos.mssql.auth.converter.TUserConverter;
import org.example.spring.daos.mssql.auth.dao.TUserDao;
import org.example.spring.daos.mssql.auth.repository.TUserRepository;
import org.example.spring.daos.mssql.auth.table.dto.TUserDto;
import org.example.spring.daos.mssql.auth.table.po.TUser;
import org.example.spring.daos.mssql.auth.table.query.TUserQuery;
import org.example.spring.daos.mssql.auth.table.vo.TUserVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TUserRepositoryImpl extends IBaseRepositoryImpl<TUser, TUserDto, TUserVo, TUserQuery, TUserConverter, TUserDao> implements TUserRepository {
}