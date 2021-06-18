package org.example.spring.repositories.clients.auth.postgres.feign;


import org.example.spring.repositories.clients.auth.api.DepartmentRepository;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.po.Department;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;
import org.example.spring.repositories.feign.auth.clients.DepartmentRepositoryClient;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Primary
public class DepartmentRepositoryController extends CommonsFeignClientImpl<Department, DepartmentVo, DepartmentDTO, DepartmentQuery,DepartmentRepository> implements DepartmentRepositoryClient {
    private final DepartmentRepository repository;

    public DepartmentRepositoryController(DepartmentRepository repository) {
        super(repository);
        this.repository = repository;
    }
}