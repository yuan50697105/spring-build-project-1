package org.example.spring.repositories.clients.auth.mysql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.mysql.api.DepartmentRepositoryImpl;
import org.example.spring.repositories.clients.auth.mysql.converter.DepartmentRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.DubboDepartmentRepository;
import org.example.spring.repositories.mysql.auth.repository.TDepartmentRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@DubboService
@Primary
public class DubboDepartmentRepositoryImpl extends DepartmentRepositoryImpl implements DubboDepartmentRepository {
    public DubboDepartmentRepositoryImpl(DepartmentRepositoryConverter converter, TDepartmentRepository repository) {
        super(converter, repository);
    }
}