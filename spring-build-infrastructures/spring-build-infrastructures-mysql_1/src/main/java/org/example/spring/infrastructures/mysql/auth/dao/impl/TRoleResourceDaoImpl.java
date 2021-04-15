package org.example.spring.infrastructures.mysql.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.builder.AuthBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TRoleResourceDao;
import org.example.spring.infrastructures.mysql.auth.mapper.TRoleResourceMapper;
import org.example.spring.infrastructures.mysql.auth.table.po.TResource;
import org.example.spring.infrastructures.mysql.auth.table.po.TRoleResource;
import org.example.spring.infrastructures.mysql.auth.table.query.TRolePermissionQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class TRoleResourceDaoImpl extends TkBaseDaoImpl<TRoleResource, TRolePermissionQuery, TRoleResourceMapper> implements TRoleResourceDao {
    private final AuthBuilder authBuilder;

    @Override
    protected Wrapper<TRoleResource> queryWrapper(TRolePermissionQuery tRolePermissionQuery) {
        return null;
    }

    @Override
    public boolean saveNew(Long roleId, List<Long> permissionIds) {
        return saveBatch(authBuilder.buildRoleResources(roleId, permissionIds));
    }

    @Override
    public boolean saveUpdate(Long id, List<Long> permissionIds) {
        removeByRoleId(id);
        return saveNew(id, permissionIds);
    }

    @Override
    public boolean removeByRoleIds(List<Long> ids) {
        return remove(lambdaQuery().in(TRoleResource::getRoleId,ids));
    }

    @Override
    public void removeByRoleId(Long roleId) {
        remove(lambdaQuery().eq(TRoleResource::getRoleId, roleId));
    }

    @Override
    public List<TResource> listByRoleId(Long roleId) {
        return baseMapper.listByRoleId(roleId);
    }

    @Override
    public boolean removeByPermissionIds(List<Long> permissionIds) {
        return remove(lambdaQuery().in(TRoleResource::getResourceId,permissionIds));
    }
}