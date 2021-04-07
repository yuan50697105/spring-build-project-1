package org.example.spring.infrastructures.mysql.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.builder.TUserRoleBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TUserRoleDao;
import org.example.spring.infrastructures.mysql.auth.mapper.TUserRoleMapper;
import org.example.spring.infrastructures.mysql.auth.table.po.TUserRole;
import org.example.spring.infrastructures.mysql.auth.table.query.TUserRoleQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
@Transactional
public class TUserRoleDaoImpl extends TkBaseDaoImpl<TUserRole, TUserRoleQuery, TUserRoleMapper> implements TUserRoleDao {
    private final TUserRoleBuilder userRoleBuilder;

    @Override
    protected Wrapper<TUserRole> queryWrapper(TUserRoleQuery tUserRoleQuery) {
        return null;
    }

    @Override
    public List<Long> listRoleIdsByUserId(Long userId) {
        return lambdaQuery().eq(TUserRole::getUserId, userId).list().stream().map(TUserRole::getRoleId).distinct().sorted().collect(Collectors.toList());
    }

    @Override
    public void saveUpdate(Long id, List<Long> existRoleIds) {
        remove(lambdaQuery().eq(TUserRole::getUserId, id));
        saveBatch(userRoleBuilder.buildRoles(id, existRoleIds));

    }

}