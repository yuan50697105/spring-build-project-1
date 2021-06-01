package org.example.spring.daos.oracle.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.daos.oracle.auth.dao.TRoleResourceDao;
import org.example.spring.daos.oracle.auth.mapper.TRoleResourceMapper;
import org.example.spring.daos.oracle.auth.table.po.TResource;
import org.example.spring.daos.oracle.auth.table.po.TRoleResource;
import org.example.spring.daos.oracle.auth.table.query.TRolePermissionQuery;
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

    @Override
    protected Wrapper<TRoleResource> queryWrapper(TRolePermissionQuery tRolePermissionQuery) {
        return null;
    }

    @Override
    public boolean removeByRoleIds(List<Long> ids) {
        return removeByIds(lambdaQuery().in(TRoleResource::getRoleId, ids).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList()));
    }

    @Override
    public boolean deleteByRoleIds(List<Long> ids) {
        return removeByRoleIds(ids);
    }

    @Override
    public boolean removeByRoleId(Long roleId) {
        return removeByIds(lambdaQuery().eq(TRoleResource::getRoleId, roleId).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList()));
    }

    @Override
    public boolean deleteByRoleId(Long roleId) {
        return removeByRoleId(roleId);
    }

    @Override
    public List<TResource> listByRoleId(Long roleId) {
        return baseMapper.listByRoleId(roleId);
    }

    @Override
    public boolean removeByResourceIds(List<Long> resourceIds) {
        List<Long> collect = lambdaQuery().in(TRoleResource::getResourceId, resourceIds).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList());
        return removeByIds(collect);
    }

    @Override
    public boolean deleteByResourceIds(List<Long> resourceIds) {
        return removeByResourceIds(resourceIds);
    }
}