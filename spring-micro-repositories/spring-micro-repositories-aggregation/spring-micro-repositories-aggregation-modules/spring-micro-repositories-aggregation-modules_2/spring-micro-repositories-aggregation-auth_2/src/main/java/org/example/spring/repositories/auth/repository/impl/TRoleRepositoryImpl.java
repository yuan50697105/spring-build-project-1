package org.example.spring.repositories.auth.repository.impl;

import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.auth.converter.TRoleConverter;
import org.example.spring.repositories.auth.dao.TRoleDao;
import org.example.spring.repositories.auth.repository.TResourceRepository;
import org.example.spring.repositories.auth.repository.TRoleRepository;
import org.example.spring.repositories.auth.table.dto.TRoleDTO;
import org.example.spring.repositories.auth.table.dto.TRoleResourceDTO;
import org.example.spring.repositories.auth.table.po.TRole;
import org.example.spring.repositories.auth.table.query.TRoleQuery;
import org.example.spring.repositories.auth.table.vo.TRoleVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
@Deprecated
public class TRoleRepositoryImpl extends IBaseRepositoryImpl<TRole, TRoleDTO, TRoleVo, TRoleQuery, TRoleConverter, TRoleDao> implements TRoleRepository {
    private final TResourceRepository resourceRepository;

    public TRoleRepositoryImpl(TResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    @Override
    public List<TRoleDTO> queryListByDepartmentId(Long departmentId) {
        return converter.buildDTOS(dao.queryListByDepartmentId(departmentId));
    }

    @Override
    public TRoleResourceDTO getDetails(Long id) {
        return converter.roleResources(dao.getById(id), resourceRepository.queryListByRoleId(id));
    }

    @Override
    public List<TRoleDTO> queryListByUserId(Long id) {
        return converter.buildDTOS(dao.queryListByUserId(id));
    }
}