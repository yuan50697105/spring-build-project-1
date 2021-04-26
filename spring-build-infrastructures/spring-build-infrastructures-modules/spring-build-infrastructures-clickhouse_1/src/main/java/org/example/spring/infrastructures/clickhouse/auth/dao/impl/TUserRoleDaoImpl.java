package org.example.spring.infrastructures.clickhouse.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.clickhouse.auth.dao.TUserRoleDao;
import org.example.spring.infrastructures.clickhouse.auth.builder.AuthBuilder;
import org.example.spring.infrastructures.clickhouse.auth.mapper.TUserRoleMapper;
import org.example.spring.infrastructures.clickhouse.auth.table.po.TRole;
import org.example.spring.infrastructures.clickhouse.auth.table.po.TUserRole;
import org.example.spring.infrastructures.clickhouse.auth.table.query.TUserRoleQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendSqls;

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
    public boolean removeByUserId(Long id) {
        Example.Builder where = Weekend.builder(entityClass).where(WeekendSqls.<TUserRole>custom().andEqualTo(TUserRole::getUserId, id));
        return SqlHelper.retBool(baseMapper.deleteByExample(where.build()));
    }

    @Override
    public boolean removeByUserIds(List<Long> userIds) {
        Example.Builder where = Weekend.builder(entityClass).where(WeekendSqls.<TUserRole>custom().andIn(TUserRole::getUserId, userIds));
        return SqlHelper.retBool(baseMapper.deleteByExample(where.build()));
    }

    @Override
    public List<TRole> listByUserId(Long userId) {
        return baseMapper.listByUserId(userId);
    }

}