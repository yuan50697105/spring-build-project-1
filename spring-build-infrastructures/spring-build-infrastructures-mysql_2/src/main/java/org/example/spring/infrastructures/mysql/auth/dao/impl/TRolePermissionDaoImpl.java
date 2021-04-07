package org.example.spring.infrastructures.mysql.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.builder.AuthBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TRolePermissionDao;
import org.example.spring.infrastructures.mysql.auth.mapper.TRolePermissionMapper;
import org.example.spring.infrastructures.mysql.auth.table.po.TPermission;
import org.example.spring.infrastructures.mysql.auth.table.po.TRolePermission;
import org.example.spring.infrastructures.mysql.auth.table.query.TRolePermissionQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class TRolePermissionDaoImpl extends TkBaseDaoImpl<TRolePermission, TRolePermissionQuery, TRolePermissionMapper> implements TRolePermissionDao {
    private final AuthBuilder authBuilder;

    @Override
    protected Wrapper<TRolePermission> queryWrapper(TRolePermissionQuery tRolePermissionQuery) {
        return null;
    }

    @Override
    public boolean saveNew(Long roleId, List<Long> permissionIds) {
        return saveBatch(authBuilder.buildRolePermissions(roleId, permissionIds));
    }

    @Override
    public boolean saveUpdate(Long id, List<Long> permissionIds) {
        removeByRoleId(id);
        return saveNew(id, permissionIds);
    }

    @Override
    public boolean removeByRoleIds(List<Long> ids) {
        return remove(lambdaQuery().in(TRolePermission::getRoleId,ids));
    }

    @Override
    public void removeByRoleId(Long roleId) {
        remove(lambdaQuery().eq(TRolePermission::getRoleId, roleId));
    }

    @Override
    public List<TPermission> listByRoleId(Long roleId) {
        return baseMapper.listByRoleId(roleId);
    }

    @Override
    public boolean removeByPermissionIds(List<Long> permissionIds) {
        return remove(lambdaQuery().in(TRolePermission::getPermissionId,permissionIds));
    }
}