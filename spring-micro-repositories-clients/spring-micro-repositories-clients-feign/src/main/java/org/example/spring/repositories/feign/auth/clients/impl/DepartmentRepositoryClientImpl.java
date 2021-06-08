package org.example.spring.repositories.feign.auth.clients.impl;

import org.example.spring.repositories.clients.auth.api.DepartmentRepository;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.po.Department;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;
import org.example.spring.repositories.feign.auth.clients.DepartmentRepositoryClient;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentRepositoryClientImpl extends CommonsFeignClientImpl<Department, DepartmentVo, DepartmentDTO, DepartmentQuery, DepartmentRepository> implements DepartmentRepositoryClient {
    private final DepartmentRepository repository;

    public DepartmentRepositoryClientImpl(DepartmentRepository repository) {
        super(repository);
        this.repository = repository;
    }
}