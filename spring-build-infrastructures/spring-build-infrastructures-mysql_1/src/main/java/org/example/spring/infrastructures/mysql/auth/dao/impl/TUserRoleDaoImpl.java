package org.example.spring.infrastructures.mysql.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.builder.AuthBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TUserRoleDao;
import org.example.spring.infrastructures.mysql.auth.mapper.TUserRoleMapper;
import org.example.spring.infrastructures.mysql.auth.table.po.TRole;
import org.example.spring.infrastructures.mysql.auth.table.po.TUserRole;
import org.example.spring.infrastructures.mysql.auth.table.query.TUserRoleQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
@Transactional
public class TUserRoleDaoImpl extends TkBaseDaoImpl<TUserRole, TUserRoleQuery, TUserRoleMapper> implements TUserRoleDao {
    private final AuthBuilder authBuilder;

    @Override
    protected Wrapper<TUserRole> queryWrapper(TUserRoleQuery tUserRoleQuery) {
        return null;
    }

    @Override
    public List<Long> listRoleIdsByUserId(Long userId) {
        return lambdaQuery().eq(TUserRole::getUserId, userId).list().stream().map(TUserRole::getRoleId).distinct().sorted().collect(Collectors.toList());
    }

    @Override
    @Transactional
    public boolean updateUserRole(Long id, List<Long> existRoleIds) {
        removeByUserId(id);
        return saveBatch(authBuilder.buildRoles(id, existRoleIds));
    }

    @Override
    public void removeByUserId(Long id) {
        LambdaQueryWrapper<TUserRole> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(TUserRole::getUserId, id);
        remove(lambdaQueryWrapper);
    }

    @Override
    public boolean removeByUserIds(List<Long> userIds) {
        LambdaQueryWrapper<TUserRole> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.in(TUserRole::getUserId, userIds);
        return remove(queryWrapper);
//        return removeByIds(lambdaQuery().in(TUserRole::getUserId, userIds).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList()));
    }

    @Override
    public List<TRole> listByUserId(Long userId) {
        return baseMapper.listByUserId(userId);
    }

}