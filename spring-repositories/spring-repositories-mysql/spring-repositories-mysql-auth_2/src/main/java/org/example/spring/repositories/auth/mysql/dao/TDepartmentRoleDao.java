package org.example.spring.repositories.auth.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.auth.mysql.table.po.TDepartmentRole;
import org.example.spring.repositories.auth.mysql.table.po.TRole;
import org.example.spring.repositories.auth.mysql.table.query.TDepartmentRoleQuery;

import java.util.List;

@SuppressWarnings("UnusedReturnValue")
public interface TDepartmentRoleDao extends TkBaseDao<TDepartmentRole, TDepartmentRoleQuery> {
    boolean removeByDepartmentId(Long id);

    boolean removeByDepartmentIds(List<Long> ids);

    List<TRole> listRolesByDepartmentId(Long id);
}
