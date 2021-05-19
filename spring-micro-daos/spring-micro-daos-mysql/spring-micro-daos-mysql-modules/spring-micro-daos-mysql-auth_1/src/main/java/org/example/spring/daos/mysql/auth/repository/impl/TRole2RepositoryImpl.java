package org.example.spring.daos.mysql.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.converter.TRoleConverter;
import org.example.spring.daos.mysql.auth.dao.TRoleDao;
import org.example.spring.daos.mysql.auth.repository.TRole2Repository;
import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.po.TRole;
import org.example.spring.daos.mysql.auth.table.query.TRoleQuery;
import org.example.spring.daos.mysql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TRole2RepositoryImpl extends IBaseRepositoryImpl<TRole, TRoleDTO, TRoleVo, TRoleQuery, TRoleConverter, TRoleDao> implements TRole2Repository {
}