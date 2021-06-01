package org.example.spring.repositories.oracle.auth.dao;

import org.example.spring.repositories.oracle.auth.table.po.TDepartmentRole;
import org.example.spring.repositories.oracle.auth.table.po.TRole;
import org.example.spring.repositories.oracle.auth.table.query.TDepartmentRoleQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TDepartmentRoleDao extends TkBaseDao<TDepartmentRole, TDepartmentRoleQuery> {
    boolean removeByDepartmentId(Long id);

    boolean removeByDepartmentIds(List<Long> ids);

    List<TRole> listRolesByDepartmentId(Long id);
}
