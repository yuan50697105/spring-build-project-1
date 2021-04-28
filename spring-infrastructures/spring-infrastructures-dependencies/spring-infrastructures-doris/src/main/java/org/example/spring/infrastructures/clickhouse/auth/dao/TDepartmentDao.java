package org.example.spring.infrastructures.clickhouse.auth.dao;

import org.example.spring.infrastructures.clickhouse.auth.table.po.TDepartment;
import org.example.spring.infrastructures.clickhouse.auth.table.query.TDepartmentQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TDepartmentDao extends TkBaseDao<TDepartment, TDepartmentQuery> {
    boolean existChildByPIds(List<Long> ids);
}
