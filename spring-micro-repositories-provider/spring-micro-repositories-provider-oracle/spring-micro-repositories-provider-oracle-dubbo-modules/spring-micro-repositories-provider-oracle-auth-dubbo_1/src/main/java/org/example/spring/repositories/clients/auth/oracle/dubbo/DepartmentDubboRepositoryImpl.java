package org.example.spring.repositories.clients.auth.oracle.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.api.DepartmentRepository;
import org.example.spring.repositories.clients.dubbo.auth.api.DepartmentDubboRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentRoleDTO;
import org.example.spring.repositories.commons.entity.auth.po.Department;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@DubboService
public class DepartmentDubboRepositoryImpl extends CommonsDubboRepositoryImpl<Department, DepartmentVo, DepartmentDTO, DepartmentQuery, DepartmentRepository> implements DepartmentDubboRepository {
    private final DepartmentRepository repository;

    protected DepartmentDubboRepositoryImpl(DepartmentRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public DepartmentRoleDTO getDepartmentRole(Long id) {
        return repository.getDepartmentRole(id);
    }

    @Override
    public Optional<DepartmentRoleDTO> getDepartmentRoleOpt(Long id) {
        return repository.getDepartmentRoleOpt(id);
    }
}