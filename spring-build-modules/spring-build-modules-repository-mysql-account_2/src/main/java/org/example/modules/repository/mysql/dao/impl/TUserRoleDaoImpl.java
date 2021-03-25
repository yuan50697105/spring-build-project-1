package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.modules.repository.mysql.dao.TUserRoleDao;
import org.example.modules.repository.mysql.entity.po.TRole;
import org.example.modules.repository.mysql.entity.po.TUserRole;
import org.example.modules.repository.mysql.entity.query.TUserRoleQuery;
import org.example.modules.repository.mysql.mapper.TUserRoleMapper;
import org.example.modules.repository.mysql.mapper.TUserRoleQueryMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class TUserRoleDaoImpl extends TkBaseDaoImpl<TUserRole, TUserRoleQuery, TUserRoleMapper> implements TUserRoleDao {
    @Autowired
    private TUserRoleQueryMapper userRoleQueryMapper;
    @Override
    public boolean removeByUserIds(List<Long> userIds) {
        return lambdaUpdate().in(TUserRole::getUserId,userIds).remove();
    }

    @Override
    public List<TRole> getListByUserId(Long userId) {
        return userRoleQueryMapper.getRoleListByUserId(userId);
    }

    @Override
    protected Wrapper<TUserRole> queryWrapper(TUserRoleQuery tUserRoleQuery) {
        return null;
    }
}