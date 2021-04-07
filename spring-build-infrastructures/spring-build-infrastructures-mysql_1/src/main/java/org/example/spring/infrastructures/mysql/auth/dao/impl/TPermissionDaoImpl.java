package org.example.spring.infrastructures.mysql.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.dao.TPermissionDao;
import org.example.spring.infrastructures.mysql.auth.mapper.TPermissionMapper;
import org.example.spring.infrastructures.mysql.auth.table.po.TPermission;
import org.example.spring.infrastructures.mysql.auth.table.query.TPermissionQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
@Transactional
public class TPermissionDaoImpl extends TkBaseDaoImpl<TPermission, TPermissionQuery, TPermissionMapper> implements TPermissionDao {
    @Override
    protected Wrapper<TPermission> queryWrapper(TPermissionQuery tPermissionQuery) {
        return null;
    }

    @Override
    public List<Long> listPermissionIdsByPermissionIdsOrPermissionName(List<Long> permissionIds, List<String> permissionName) {
        return lambdaQuery().select(IBaseEntity::getId).and(wrapper -> {
            wrapper.or().in(IBaseEntity::getId, permissionIds);
            wrapper.or().in(TPermission::getName, permissionName);
        }).list().stream().map(IBaseEntity::getId).collect(Collectors.toList());
    }
}