package org.example.spring.repositories.aggregation.auth.repository.impl;

import org.example.spring.plugins.mybatis.repository.impl.ICommonsRepositoryImpl;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentRoleDTO;
import org.example.spring.repositories.commons.entity.auth.po.Department;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;
import org.example.spring.repositories.aggregation.auth.converter.DepartmentConverter;
import org.example.spring.repositories.aggregation.auth.dao.TDepartmentDao;
import org.example.spring.repositories.aggregation.auth.repository.DepartmentRepository;
import org.example.spring.repositories.aggregation.auth.repository.RoleRepository;
import org.example.spring.repositories.aggregation.auth.table.po.TDepartment;
import org.example.spring.repositories.aggregation.auth.table.query.TDepartmentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class DepartmentRepositoryImpl extends ICommonsRepositoryImpl<Department, TDepartment, DepartmentQuery, TDepartmentQuery, DepartmentVo, DepartmentDTO, DepartmentConverter, TDepartmentDao> implements DepartmentRepository {
    private final DepartmentConverter converter;
    private final TDepartmentDao dao;
    private final RoleRepository roleRepository;

    protected DepartmentRepositoryImpl(DepartmentConverter converter, TDepartmentDao dao, RoleRepository roleRepository) {
        super(converter, dao);
        this.converter = converter;
        this.dao = dao;
        this.roleRepository = roleRepository;
    }

    @Override
    public DepartmentRoleDTO getDetails(Long id) {
        DepartmentRoleDTO dto = new DepartmentRoleDTO();
        converter.copyDepartmentRoleDTO(dao.getById(id),dto);
        dto.setRoles(roleRepository.queryListByDepartmentId(id));
        return dto;
    }
}