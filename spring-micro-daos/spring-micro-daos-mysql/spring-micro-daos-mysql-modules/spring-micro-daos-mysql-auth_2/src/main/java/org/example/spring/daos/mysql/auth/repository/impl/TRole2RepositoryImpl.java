package org.example.spring.daos.mysql.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.builder.TResourceBuilder;
import org.example.spring.daos.mysql.auth.builder.TRoleBuilder;
import org.example.spring.daos.mysql.auth.converter.TRoleConverter;
import org.example.spring.daos.mysql.auth.dao.TRoleDao;
import org.example.spring.daos.mysql.auth.repository.TResource2Repository;
import org.example.spring.daos.mysql.auth.repository.TRole2Repository;
import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.dto.TRoleResourceDTO;
import org.example.spring.daos.mysql.auth.table.po.TRole;
import org.example.spring.daos.mysql.auth.table.query.TRoleQuery;
import org.example.spring.daos.mysql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class TRole2RepositoryImpl extends IBaseRepositoryImpl<TRole, TRoleDTO, TRoleVo, TRoleQuery, TRoleConverter, TRoleDao> implements TRole2Repository {
    private final TRoleBuilder roleBuilder;
    private final TResourceBuilder resourceBuilder;
    private final TResource2Repository resource2Repository;

    @Override
    public List<TRoleDTO> queryListByDepartmentId(Long departmentId) {
        return roleBuilder.buildRole(dao.queryListByDepartmentId(departmentId));
    }

    @Override
    public TRoleResourceDTO getDetails(Long id) {
        TRoleResourceDTO roleResourceDTO = resourceBuilder.toDetails(get(id));
        roleResourceDTO.setResources(resource2Repository.queryListByRoleId(id));
        return roleResourceDTO;
    }

    @Override
    public List<TRoleDTO> queryListByUserId(Long id) {
        return roleBuilder.buildRole(dao.queryListByUserId(id));
    }
}