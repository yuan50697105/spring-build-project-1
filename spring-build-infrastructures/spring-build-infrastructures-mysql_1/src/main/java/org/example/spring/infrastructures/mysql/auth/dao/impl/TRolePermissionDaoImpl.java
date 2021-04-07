package org.example.spring.infrastructures.mysql.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.dao.TRolePermissionDao;
import org.example.spring.infrastructures.mysql.auth.mapper.TRolePermissionMapper;
import org.example.spring.infrastructures.mysql.auth.table.po.TRolePermission;
import org.example.spring.infrastructures.mysql.auth.table.query.TRolePermissionQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TRolePermissionDaoImpl extends TkBaseDaoImpl<TRolePermission, TRolePermissionQuery, TRolePermissionMapper> implements TRolePermissionDao {
    @Override
    protected Wrapper<TRolePermission> queryWrapper(TRolePermissionQuery tRolePermissionQuery) {
        return null;
    }
}