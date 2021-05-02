package org.example.spring.infrastructures.postgresql.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.postgresql.auth.builder.AuthBuilder;
import org.example.spring.infrastructures.postgresql.auth.dao.TRoleResourceDao;
import org.example.spring.infrastructures.postgresql.auth.mapper.TRoleResourceMapper;
import org.example.spring.infrastructures.postgresql.auth.table.po.TResource;
import org.example.spring.infrastructures.postgresql.auth.table.po.TRoleResource;
import org.example.spring.infrastructures.postgresql.auth.table.query.TRolePermissionQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

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
        return removeByIds(lambdaQuery().in(TRoleResource::getRoleId, ids).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList()));
    }

    @Override
    public boolean removeByRoleId(Long roleId) {
        return removeByIds(lambdaQuery().eq(TRoleResource::getRoleId, roleId).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList()));
    }

    @Override
    public List<TResource> listByRoleId(Long roleId) {
        return baseMapper.listByRoleId(roleId);
    }

    @Override
    public boolean removeByPermissionIds(List<Long> permissionIds) {
        List<Long> collect = lambdaQuery().in(TRoleResource::getResourceId, permissionIds).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList());
        return removeByIds(collect);
    }
}