package org.example.spring.daos.mssql.auth.repository.impl;

import org.example.spring.daos.mssql.auth.converter.TResourceConverter;
import org.example.spring.daos.mssql.auth.dao.TResourceDao;
import org.example.spring.daos.mssql.auth.repository.TResourceRepository;
import org.example.spring.daos.mssql.auth.table.dto.TResourceDto;
import org.example.spring.daos.mssql.auth.table.po.TResource;
import org.example.spring.daos.mssql.auth.table.query.TResourceQuery;
import org.example.spring.daos.mssql.auth.table.vo.TResourceVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TResourceRepositoryImpl extends IBaseRepositoryImpl<TResource, TResourceDto, TResourceVo, TResourceQuery, TResourceConverter, TResourceDao> implements TResourceRepository {
}