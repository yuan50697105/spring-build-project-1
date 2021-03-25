package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.modules.repository.mysql.dao.TRolePermissionDao;
import org.example.modules.repository.mysql.entity.po.TRolePermission;
import org.example.modules.repository.mysql.entity.query.TRolePermissionQuery;
import org.example.modules.repository.mysql.mapper.TRolePermissionMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Transactional
public class TRolePermissionDaoImpl extends TkBaseDaoImpl<TRolePermission, TRolePermissionQuery, TRolePermissionMapper> implements TRolePermissionDao {
    @Override
    protected Wrapper<TRolePermission> queryWrapper(TRolePermissionQuery tRolePermissionQuery) {
        return null;
    }

    @Override
    public List<Long> getRoleIdsByRoleId(Long roleId) {
        return lambdaQuery().eq(TRolePermission::getRoleId, roleId).select(TRolePermission::getPermissionId).list().stream().map(TRolePermission::getPermissionId).collect(Collectors.toList());
    }

    @Override
    public boolean removeByPermissionIdsAndRoleId(List<Long> permissionIds, Long roleId) {
        return lambdaUpdate().in(TRolePermission::getPermissionId, permissionIds).eq(TRolePermission::getRoleId, roleId).remove();
    }

    @Override
    public boolean removeByRoleIds(List<Long> roleIds) {
        return lambdaUpdate().in(TRolePermission::getRoleId, roleIds).remove();
    }
}