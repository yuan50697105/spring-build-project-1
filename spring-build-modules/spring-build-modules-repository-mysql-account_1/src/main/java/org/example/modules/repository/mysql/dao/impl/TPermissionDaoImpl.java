package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.modules.repository.mysql.dao.TPermissionDao;
import org.example.modules.repository.mysql.table.po.TPermission;
import org.example.modules.repository.mysql.table.query.TPermissionQuery;
import org.example.modules.repository.mysql.mapper.TPermissionMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.plugins.mybatis.entity.po.IBaseEntity;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Transactional
public class TPermissionDaoImpl extends TkBaseDaoImpl<TPermission, TPermissionQuery, TPermissionMapper> implements TPermissionDao {
    @Override
    protected Wrapper<TPermission> queryWrapper(TPermissionQuery tPermissionQuery) {
        return null;
    }

    @Override
    public List<Long> getPermisionIdsByPermissionIdsOrPermissionNames(List<Long> permissionIds, List<String> permissionNames) {
        return lambdaQuery().and(wrapper -> {
            wrapper.or().in(isNotEmpty(permissionIds), IBaseEntity::getId, permissionIds);
            wrapper.or().in(isNotEmpty(permissionNames), TPermission::getName, permissionNames);
        }).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList());
    }
}