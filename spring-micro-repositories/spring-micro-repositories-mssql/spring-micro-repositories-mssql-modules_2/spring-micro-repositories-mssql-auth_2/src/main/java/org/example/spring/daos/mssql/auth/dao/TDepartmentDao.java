package org.example.spring.daos.mssql.auth.dao;

import org.example.spring.daos.mssql.auth.table.po.TDepartment;
import org.example.spring.daos.mssql.auth.table.query.TDepartmentQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TDepartmentDao extends TkExtDao<TDepartment, TDepartmentQuery> {
}
