package org.example.spring.repositories.auth.repository.impl;

import org.example.spring.plugins.mybatis.repository.impl.ICommonsRepositoryImpl;
import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.RoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Role;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;
import org.example.spring.repositories.auth.converter.RoleConverter;
import org.example.spring.repositories.auth.dao.TRoleDao;
import org.example.spring.repositories.auth.repository.ResourceRepository;
import org.example.spring.repositories.auth.repository.RoleRepository;
import org.example.spring.repositories.auth.table.po.TRole;
import org.example.spring.repositories.auth.table.query.TRoleQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class RoleRepositoryImpl extends ICommonsRepositoryImpl<Role, TRole, RoleQuery, TRoleQuery, RoleVo, RoleDTO, RoleConverter, TRoleDao> implements RoleRepository {
    private final RoleConverter converter;
    private final TRoleDao dao;
    private final ResourceRepository resourceRepository;

    protected RoleRepositoryImpl(RoleConverter converter, TRoleDao dao, ResourceRepository resourceRepository) {
        super(converter, dao);
        this.converter = converter;
        this.dao = dao;
        this.resourceRepository = resourceRepository;
    }

    @Override
    public List<RoleDTO> queryListByDepartmentId(Long departmentId) {
        return converter.buildDTOS(dao.queryListByDepartmentId(departmentId));
    }

    @Override
    public RoleResourceDTO getDetails(Long id) {
        RoleResourceDTO roleResourceDTO = new RoleResourceDTO();
        converter.copyRoleResourceDTO(dao.getById(id), roleResourceDTO);
        roleResourceDTO.setResources(resourceRepository.queryListByRoleId(id));
        return roleResourceDTO;
    }

    @Override
    public List<RoleDTO> queryListByUserId(Long id) {
        return converter.buildDTOS(dao.queryListByUserId(id));
    }
}