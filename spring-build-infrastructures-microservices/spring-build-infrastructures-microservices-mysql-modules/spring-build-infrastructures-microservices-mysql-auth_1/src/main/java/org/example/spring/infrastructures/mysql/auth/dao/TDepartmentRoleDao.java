package org.example.spring.infrastructures.mysql.auth.dao;

import org.example.spring.infrastructures.mysql.auth.table.po.TDepartmentRole;
import org.example.spring.infrastructures.mysql.auth.table.po.TRole;
import org.example.spring.infrastructures.mysql.auth.table.query.TDepartmentRoleQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TDepartmentRoleDao extends TkBaseDao<TDepartmentRole, TDepartmentRoleQuery> {
    boolean removeByDepartmentId(Long id);

    boolean removeByDepartmentIds(List<Long> ids);

    List<TRole> listRolesByDepartmentId(Long id);
}