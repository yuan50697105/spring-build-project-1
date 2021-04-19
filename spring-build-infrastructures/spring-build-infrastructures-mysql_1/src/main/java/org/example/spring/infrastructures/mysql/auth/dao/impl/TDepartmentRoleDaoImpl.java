package org.example.spring.infrastructures.mysql.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.dao.TDepartmentRoleDao;
import org.example.spring.infrastructures.mysql.auth.mapper.TDepartmentRoleMapper;
import org.example.spring.infrastructures.mysql.auth.table.po.TDepartmentRole;
import org.example.spring.infrastructures.mysql.auth.table.po.TRole;
import org.example.spring.infrastructures.mysql.auth.table.query.TDepartmentRoleQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
        return remove(lambdaQuery().eq(TDepartmentRole::getDepartmentId, id));
    }

    @Override
    public boolean removeByDepartmentIds(List<Long> ids) {
        return remove(lambdaQuery().in(TDepartmentRole::getDepartmentId, ids));
    }

    @Override
    public List<TRole> listRolesByDepartmentId(Long id) {
        return baseMapper.listRolesByDepartmentId(id);
    }
}