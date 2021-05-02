package org.example.spring.daos.clickhouse.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.daos.clickhouse.auth.dao.TDepartmentRoleDao;
import org.example.spring.daos.clickhouse.auth.mapper.TDepartmentRoleMapper;
import org.example.spring.daos.clickhouse.auth.table.po.TDepartmentRole;
import org.example.spring.daos.clickhouse.auth.table.po.TRole;
import org.example.spring.daos.clickhouse.auth.table.query.TDepartmentRoleQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
}