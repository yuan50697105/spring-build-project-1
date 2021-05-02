package org.example.spring.infrastructures.postgresql.auth.dao.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.postgresql.auth.dao.TRoleDao;
import org.example.spring.infrastructures.postgresql.auth.mapper.TRoleMapper;
import org.example.spring.infrastructures.postgresql.auth.table.po.TRole;
import org.example.spring.infrastructures.postgresql.auth.table.query.TRoleQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
@Transactional
public class TRoleDaoImpl extends TkBaseDaoImpl<TRole, TRoleQuery, TRoleMapper> implements TRoleDao {
    @Override
    protected Wrapper<TRole> queryWrapper(TRoleQuery tRoleQuery) {
        return null;
    }

    @Override
    public List<Long> listRoleIdsByRoleIdsOrRoleName(List<Long> roleIds, List<String> roleName) {
        return lambdaQuery().and(wrapper -> {
            wrapper.or().in(ObjectUtil.isNotEmpty(roleIds), IBaseEntity::getId, roleIds);
            wrapper.or().in(ObjectUtil.isNotEmpty(roleName), TRole::getName, roleName);
        }).list().stream().map(IBaseEntity::getId).distinct().sorted().collect(Collectors.toList());
    }

    @Override
    public List<Long> listRoleIdsByRoleIds(List<Long> roleIds) {
        return lambdaQuery().in(IBaseEntity::getId, roleIds).list().stream().map(IBaseEntity::getId).distinct().sorted().collect(Collectors.toList());
    }

}