package org.example.spring.repositories.clients.dubbo.postgres.auth;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.postgres.api.DepartmentRepositoryImpl;
import org.example.spring.repositories.clients.auth.postgres.converter.DepartmentRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.DepartmentDubboRepository;
import org.example.spring.repositories.postgres.auth.repository.TDepartmentRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@DubboService
@Primary
public class DepartmentDubboRepositoryImpl extends DepartmentRepositoryImpl implements DepartmentDubboRepository {
    public DepartmentDubboRepositoryImpl(DepartmentRepositoryConverter converter, TDepartmentRepository repository) {
        super(converter, repository);
    }
}