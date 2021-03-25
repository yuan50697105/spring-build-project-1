package org.example.modules.repository.mysql.dao.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.modules.repository.mysql.dao.TRoleDao;
import org.example.modules.repository.mysql.entity.po.TRole;
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
    public boolean existByRoleName(String roleName) {
        return baseMapper.existByRoleName(roleName);
    }

    @Override
    public List<Long> getRoleIdListByIdsOrNames(List<Long> roleIds, List<String> roleNames) {
        return lambdaQuery().and(wrapper -> {
            wrapper.or().in(ObjectUtil.isNotEmpty(roleIds), IBaseEntity::getId, roleIds);
            wrapper.or().in(ObjectUtil.isNotEmpty(roleNames), TRole::getName, roleNames);
        }).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList());
    }

    @Override
    protected Wrapper<TRole> queryWrapper(TRoleQuery tRoleQuery) {
        return null;
    }
}