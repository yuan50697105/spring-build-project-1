package org.example.spring.daos.mysql.department.dao;

import org.example.spring.daos.mysql.department.table.po.TCheckDepartmentItems;
import org.example.spring.daos.mysql.department.table.query.TCheckDepartmentItemsQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCheckDepartmentItemsDao extends TkBaseDao<TCheckDepartmentItems, TCheckDepartmentItemsQuery> {
}
