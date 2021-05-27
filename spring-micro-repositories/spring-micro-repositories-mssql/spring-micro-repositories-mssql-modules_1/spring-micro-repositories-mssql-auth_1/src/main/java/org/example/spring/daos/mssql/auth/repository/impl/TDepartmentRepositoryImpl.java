package org.example.spring.daos.mssql.auth.repository.impl;

import org.example.spring.daos.mssql.auth.converter.TDepartmentConverter;
import org.example.spring.daos.mssql.auth.dao.TDepartmentDao;
import org.example.spring.daos.mssql.auth.repository.TDepartmentRepository;
import org.example.spring.daos.mssql.auth.table.dto.TDepartmentDto;
import org.example.spring.daos.mssql.auth.table.po.TDepartment;
import org.example.spring.daos.mssql.auth.table.query.TDepartmentQuery;
import org.example.spring.daos.mssql.auth.table.vo.TDepartmentVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TDepartmentRepositoryImpl extends IBaseRepositoryImpl<TDepartment, TDepartmentDto, TDepartmentVo, TDepartmentQuery, TDepartmentConverter, TDepartmentDao> implements TDepartmentRepository {
}