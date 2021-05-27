package org.example.spring.daos.mssql.auth.dao.impl;

import org.example.spring.daos.mssql.auth.dao.TDepartmentRoleDao;
import org.example.spring.daos.mssql.auth.mapper.TDepartmentMapper;
import org.example.spring.daos.mssql.auth.table.po.TDepartment;
import org.example.spring.daos.mssql.auth.table.query.TDepartmentQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TDepartmentRoleDaoImpl extends TkExtDaoImpl<TDepartment, TDepartmentQuery, TDepartmentMapper> implements TDepartmentRoleDao {
}