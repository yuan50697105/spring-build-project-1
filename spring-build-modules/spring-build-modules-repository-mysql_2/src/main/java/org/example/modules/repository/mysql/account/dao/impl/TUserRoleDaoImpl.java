package org.example.modules.repository.mysql.account.dao.impl;

import org.example.modules.repository.mysql.account.dao.TUserRoleDao;
import org.example.modules.repository.mysql.account.entity.TUserRole;
import org.example.modules.repository.mysql.account.entity.query.TUserRoleQuery;
import org.example.modules.repository.mysql.account.mapper.TUserRoleMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class TUserRoleDaoImpl extends TkBaseDaoImpl<TUserRole, TUserRoleQuery, TUserRoleMapper> implements TUserRoleDao {
}