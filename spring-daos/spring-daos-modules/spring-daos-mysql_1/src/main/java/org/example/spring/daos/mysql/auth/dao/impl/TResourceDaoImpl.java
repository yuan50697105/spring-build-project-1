package org.example.spring.daos.mysql.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.dao.TResourceDao;
import org.example.spring.daos.mysql.auth.mapper.TResourceMapper;
import org.example.spring.daos.mysql.auth.table.po.TResource;
import org.example.spring.daos.mysql.auth.table.query.TResourceQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
@Transactional
public class TResourceDaoImpl extends TkBaseDaoImpl<TResource, TResourceQuery, TResourceMapper> implements TResourceDao {
    @Override
    protected Wrapper<TResource> queryWrapper(TResourceQuery tResourceQuery) {
        return null;
    }

    @Override
    public List<Long> listResourceIdsByResourceIdsOrPermissionName(List<Long> permissionIds, List<String> permissionName) {
        return lambdaQuery().select(IBaseEntity::getId).and(wrapper -> {
            wrapper.or().in(IBaseEntity::getId, permissionIds);
            wrapper.or().in(TResource::getName, permissionName);
        }).list().stream().map(IBaseEntity::getId).collect(Collectors.toList());
    }

    @Override
    public boolean existChidByPids(List<Long> ids) {
        return baseMapper.existChidByPids(ids);
    }

    @Override
    public List<Long> listResourceIdsByResourceIds(List<Long> resourceIds) {
        return lambdaQuery().select(IBaseEntity::getId).in(IBaseEntity::getId, resourceIds).list().stream().map(IBaseEntity::getId).collect(Collectors.toList());
    }
}