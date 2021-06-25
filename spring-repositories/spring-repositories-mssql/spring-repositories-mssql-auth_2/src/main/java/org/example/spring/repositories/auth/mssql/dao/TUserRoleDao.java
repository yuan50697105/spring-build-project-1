package org.example.spring.repositories.auth.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.auth.mssql.table.po.TRole;
import org.example.spring.repositories.auth.mssql.table.po.TUserRole;
import org.example.spring.repositories.auth.mssql.table.query.TUserRoleQuery;

import java.util.List;

public interface TUserRoleDao extends TkBaseDao<TUserRole, TUserRoleQuery> {
    List<Long> listRoleIdsByUserId(Long userId);

    boolean removeByUserId(Long id);

    boolean removeByUserIds(List<Long> userIds);

    boolean deleteByUserId(Long id);

    boolean deleteByUserIds(List<Long> ids);

    List<TRole> listByUserId(Long userId);

    List<TRole> listRolesByUserId(Long userId);

    boolean deleteByRoleId(Long roleId);

    boolean removeByRoleId(Long roleId);

    boolean deleteByRoleIds(List<Long> ids);

    boolean removeByRoleIds(List<Long> ids);
}
