package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.modules.repository.mysql.dao.TUserRoleDao;
import org.example.modules.repository.mysql.table.po.TRole;
import org.example.modules.repository.mysql.table.po.TUserRole;
import org.example.modules.repository.mysql.table.query.TUserRoleQuery;
import org.example.modules.repository.mysql.mapper.TUserRoleMapper;
import org.example.modules.repository.mysql.mapper.TUserRoleQueryMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.plugins.mybatis.entity.po.IBaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Transactional
public class TUserRoleDaoImpl extends TkBaseDaoImpl<TUserRole, TUserRoleQuery, TUserRoleMapper> implements TUserRoleDao {
    @Autowired
    private TUserRoleQueryMapper userRoleQueryMapper;
    @Override
    public boolean removeByUserIds(List<Long> userIds) {
        List<Long> ids = lambdaQuery().in(TUserRole::getUserId, userIds).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList());
        return removeByIds(ids);
    }

    @Override
    public boolean removeByRoleIdsAndUserId(List<Long> userRoleIds, Long id) {
        List<Long> ids = lambdaQuery().eq(TUserRole::getUserId, id).in(TUserRole::getRoleId, userRoleIds).select(IBaseEntity::getId).list()
                .stream().map(IBaseEntity::getId).collect(Collectors.toList());
        return removeByIds(ids);
    }

    @Override
    public List<TRole> getRolesByUserId(Long userId) {
        return userRoleQueryMapper.getRoleListByUserId(userId);
    }

    @Override
    public List<Long> getRoleIdsByUserId(Long id) {
        return lambdaQuery().eq(TUserRole::getUserId,id).select(TUserRole::getRoleId).list().stream().map(TUserRole::getRoleId).distinct().collect(Collectors.toList());
    }

    @Override
    public List<TRole> getRolesByUsername(String username) {
        return userRoleQueryMapper.getRolesByUsername(username);
    }

    @Override
    protected Wrapper<TUserRole> queryWrapper(TUserRoleQuery tUserRoleQuery) {
        return null;
    }
}