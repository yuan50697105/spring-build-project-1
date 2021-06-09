package org.example.spring.repositories.clients.dubbo.postgres.auth;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.postgres.api.DepartmentRepositoryImpl;
import org.example.spring.repositories.clients.auth.postgres.converter.DepartmentRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.DubboDepartmentRepository;
import org.example.spring.repositories.postgres.auth.repository.TDepartmentRepository;
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