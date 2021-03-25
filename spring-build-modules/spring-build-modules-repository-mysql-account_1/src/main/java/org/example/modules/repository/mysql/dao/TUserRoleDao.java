package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.entity.po.TRole;
import org.example.modules.repository.mysql.entity.po.TUserRole;
import org.example.modules.repository.mysql.entity.query.TUserRoleQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TUserRoleDao extends TkBaseDao<TUserRole, TUserRoleQuery> {
    boolean removeByUserIds(List<Long> userIds);

    List<TRole> getListByUserId(Long userId);
}
