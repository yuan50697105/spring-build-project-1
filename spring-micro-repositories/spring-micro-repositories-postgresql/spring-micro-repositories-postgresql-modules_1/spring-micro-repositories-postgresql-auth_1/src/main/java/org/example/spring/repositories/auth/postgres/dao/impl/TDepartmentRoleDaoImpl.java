package org.example.spring.repositories.auth.postgres.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.example.spring.repositories.auth.postgres.dao.TDepartmentRoleDao;
import org.example.spring.repositories.auth.postgres.mapper.TDepartmentRoleMapper;
import org.example.spring.repositories.auth.postgres.table.po.TDepartmentRole;
import org.example.spring.repositories.auth.postgres.table.po.TRole;
import org.example.spring.repositories.auth.postgres.table.query.TDepartmentRoleQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
@Transactional
public class TDepartmentRoleDaoImpl extends TkBaseDaoImpl<TDepartmentRole, TDepartmentRoleQuery, TDepartmentRoleMapper> implements TDepartmentRoleDao {

    @Override
    protected Wrapper<TDepartmentRole> queryWrapper(TDepartmentRoleQuery tDepartmentRoleQuery) {
        return null;
    }

    @Override
    public boolean removeByDepartmentId(Long id) {
        List<Long> longs = lambdaQuery().eq(TDepartmentRole::getDepartmentId, id).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList());
        return removeByIds(longs);
    }

    @Override
    public boolean removeByDepartmentIds(List<Long> ids) {
        List<Long> longs = lambdaQuery().in(TDepartmentRole::getDepartmentId, ids).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList());
        return removeByIds(longs);
    }

    @Override
    public List<TRole> listRolesByDepartmentId(Long id) {
        return baseMapper.listRolesByDepartmentId(id);
    }

    @Override
    public boolean saveBatch(Collection<TDepartmentRole> entityList, int batchSize) {
        List<Long> departmentIds = entityList.stream().map(TDepartmentRole::getDepartmentId).collect(Collectors.toList());
        removeByDepartmentIds(departmentIds);
        return super.saveBatch(entityList, batchSize);
    }
}