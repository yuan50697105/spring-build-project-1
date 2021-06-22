package org.example.spring.repositories.aggregation.auth.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.aggregation.auth.table.po.TDepartmentRole;
import org.example.spring.repositories.aggregation.auth.table.po.TRole;
import org.example.spring.repositories.aggregation.auth.table.query.TDepartmentRoleQuery;

import java.util.List;

@SuppressWarnings("UnusedReturnValue")
public interface TDepartmentRoleDao extends TkBaseDao<TDepartmentRole, TDepartmentRoleQuery> {
    boolean removeByDepartmentId(Long id);

    boolean removeByDepartmentIds(List<Long> ids);

    List<TRole> listRolesByDepartmentId(Long id);
}
