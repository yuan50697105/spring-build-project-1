package org.example.spring.infrastructures.mysql.auth.dao;

import org.example.spring.infrastructures.mysql.auth.table.po.TRole;
import org.example.spring.infrastructures.mysql.auth.table.po.TUserRole;
import org.example.spring.infrastructures.mysql.auth.table.query.TUserRoleQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TUserRoleDao extends TkBaseDao<TUserRole, TUserRoleQuery> {
    List<Long> listRoleIdsByUserId(Long userId);

    boolean updateUserRole(Long id, List<Long> existRoleIds);

    boolean removeByUserId(Long id);

    boolean removeByUserIds(List<Long> userIds);

    boolean deleteByUserId(Long id);

    boolean deleteByUserIds(List<Long> ids);

    List<TRole> listByUserId(Long userId);
}
