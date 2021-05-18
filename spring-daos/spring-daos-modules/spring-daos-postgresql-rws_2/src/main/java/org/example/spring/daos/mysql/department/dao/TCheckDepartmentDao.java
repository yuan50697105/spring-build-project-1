package org.example.spring.daos.mysql.department.dao;

import org.example.spring.daos.mysql.department.table.po.TCheckDepartment;
import org.example.spring.daos.mysql.department.table.query.TCheckDepartmentQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCheckDepartmentDao extends TkBaseDao<TCheckDepartment, TCheckDepartmentQuery> {
}
