package org.example.spring.daos.clickhouse.auth.dao;

import org.example.spring.daos.clickhouse.auth.table.po.TDepartment;
import org.example.spring.daos.clickhouse.auth.table.query.TDepartmentQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TDepartmentDao extends TkBaseDao<TDepartment, TDepartmentQuery> {
    boolean existChildByPIds(List<Long> ids);
}
