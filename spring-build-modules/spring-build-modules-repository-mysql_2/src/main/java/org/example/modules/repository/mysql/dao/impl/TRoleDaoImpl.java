package org.example.modules.repository.mysql.dao.impl;

import org.example.modules.repository.mysql.dao.TRoleDao;
import org.example.modules.repository.mysql.entity.TRole;
import org.example.modules.repository.mysql.entity.query.TRoleQuery;
import org.example.modules.repository.mysql.mapper.TRoleMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.plugins.mybatis.entity.po.IBaseEntity;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Transactional
public class TRoleDaoImpl extends TkBaseDaoImpl<TRole, TRoleQuery, TRoleMapper> implements TRoleDao {
    @Override
    public List<Long> getRoleIdListByIds(List<Long> roleIds) {
        return lambdaQuery().in(IBaseEntity::getId, roleIds).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList());
    }
}