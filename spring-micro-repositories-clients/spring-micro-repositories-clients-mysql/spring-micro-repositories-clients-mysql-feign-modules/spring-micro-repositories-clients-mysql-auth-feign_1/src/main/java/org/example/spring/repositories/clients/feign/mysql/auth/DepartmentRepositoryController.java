package org.example.spring.repositories.clients.feign.mysql.auth;

import org.example.spring.repositories.clients.auth.mysql.api.DepartmentRepositoryImpl;
import org.example.spring.repositories.clients.auth.mysql.converter.DepartmentRepositoryConverter;
import org.example.spring.repositories.clients.auth.api.DepartmentRepository;
import org.example.spring.repositories.mysql.auth.repository.TDepartmentRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Primary
public class DepartmentRepositoryController extends DepartmentRepositoryImpl implements DepartmentRepository {
    public DepartmentRepositoryController(DepartmentRepositoryConverter converter, TDepartmentRepository repository) {
        super(converter, repository);
    }
}