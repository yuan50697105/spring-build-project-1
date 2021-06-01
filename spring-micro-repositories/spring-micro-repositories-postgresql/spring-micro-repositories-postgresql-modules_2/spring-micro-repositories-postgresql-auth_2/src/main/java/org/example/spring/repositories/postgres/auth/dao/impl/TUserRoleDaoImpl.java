package org.example.spring.repositories.postgres.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.postgres.auth.dao.TUserRoleDao;
import org.example.spring.repositories.postgres.auth.mapper.TUserRoleMapper;
import org.example.spring.repositories.postgres.auth.table.po.TRole;
import org.example.spring.repositories.postgres.auth.table.po.TUserRole;
import org.example.spring.repositories.postgres.auth.table.query.TUserRoleQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendSqls;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
@Transactional
public class TUserRoleDaoImpl extends TkBaseDaoImpl<TUserRole, TUserRoleQuery, TUserRoleMapper> implements TUserRoleDao {

    @Override
    protected Wrapper<TUserRole> queryWrapper(TUserRoleQuery tUserRoleQuery) {
        return null;
    }


    @Override
    public List<Long> listRoleIdsByUserId(Long userId) {
        return lambdaQuery().eq(TUserRole::getUserId, userId).list().stream().map(TUserRole::getRoleId).distinct().sorted().collect(Collectors.toList());
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
    public boolean deleteByUserId(Long id) {
        return removeByUserId(id);
    }

    @Override
    public boolean deleteByUserIds(List<Long> ids) {
        return removeByUserIds(ids);
    }

    @Override
    public List<TRole> listByUserId(Long userId) {
        return baseMapper.listByUserId(userId);
    }

    @Override
    public List<TRole> listRolesByUserId(Long userId) {
        return baseMapper.listRolesByUserId(userId);
    }

    @Override
    public boolean removeByRoleId(Long roleId) {
        Example.Builder where = Weekend.builder(entityClass).where(WeekendSqls.<TUserRole>custom().andEqualTo(TUserRole::getRoleId, roleId));
        return SqlHelper.retBool(baseMapper.deleteByExample(where.build()));
    }

    @Override
    public boolean deleteByRoleId(Long roleId) {
        return removeByRoleId(roleId);
    }

    @Override
    public boolean removeByRoleIds(List<Long> ids) {
        Example.Builder where = Weekend.builder(entityClass).where(WeekendSqls.<TUserRole>custom().andIn(TUserRole::getRoleId, ids));
        return SqlHelper.retBool(baseMapper.deleteByExample(where.build()));
    }

    @Override
    public boolean deleteByRoleIds(List<Long> ids) {
        return removeByRoleIds(ids);
    }

    @Override
    public boolean saveBatch(Collection<TUserRole> entityList, int batchSize) {
        List<Long> longs = entityList.stream().map(TUserRole::getUserId).collect(Collectors.toList());
        removeByUserIds(longs);
        return super.saveBatch(entityList, batchSize);
    }
}