package org.example.spring.repositories.oracle.auth.dao;

import org.example.spring.repositories.oracle.auth.table.po.TRole;
import org.example.spring.repositories.oracle.auth.table.query.TRoleQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TRoleDao extends TkBaseDao<TRole, TRoleQuery> {
    List<Long> listRoleIdsByRoleIdsOrRoleName(List<Long> roleIds, List<String> roleName);

    List<Long> listRoleIdsByRoleIds(List<Long> roleIds);

    List<TRole> queryListByUserId(Long userId);

    List<TRole> queryListByDepartmentId(Long departmentId);
}
