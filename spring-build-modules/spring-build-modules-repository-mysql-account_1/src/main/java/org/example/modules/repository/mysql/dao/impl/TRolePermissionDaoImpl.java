package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.modules.repository.mysql.dao.TRolePermissionDao;
import org.example.modules.repository.mysql.entity.po.TRolePermission;
import org.example.modules.repository.mysql.entity.query.TRolePermissionQuery;
import org.example.modules.repository.mysql.mapper.TRolePermissionMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class TRolePermissionDaoImpl extends TkBaseDaoImpl<TRolePermission, TRolePermissionQuery, TRolePermissionMapper> implements TRolePermissionDao {
    @Override
    protected Wrapper<TRolePermission> queryWrapper(TRolePermissionQuery tRolePermissionQuery) {
        return null;
    }
}