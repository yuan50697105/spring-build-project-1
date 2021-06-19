package org.example.spring.repositories.clients.auth.mysql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.api.DepartmentRepository;
import org.example.spring.repositories.clients.dubbo.auth.api.DepartmentDubboRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.po.Department;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DepartmentDubboRepositoryImpl extends CommonsDubboRepositoryImpl<Department, DepartmentVo, DepartmentDTO, DepartmentQuery, DepartmentRepository> implements DepartmentDubboRepository {
    protected DepartmentDubboRepositoryImpl(DepartmentRepository repository) {
        super(repository);
    }
}