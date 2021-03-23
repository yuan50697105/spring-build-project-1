package org.example.modules.repository.mysql.dao.impl;

import org.example.modules.repository.mysql.dao.TUserRoleDao;
import org.example.modules.repository.mysql.entity.TUserRole;
import org.example.modules.repository.mysql.entity.query.TUserRoleQuery;
import org.example.modules.repository.mysql.mapper.TUserRoleMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class TUserRoleDaoImpl extends TkBaseDaoImpl<TUserRole, TUserRoleQuery, TUserRoleMapper> implements TUserRoleDao {
}