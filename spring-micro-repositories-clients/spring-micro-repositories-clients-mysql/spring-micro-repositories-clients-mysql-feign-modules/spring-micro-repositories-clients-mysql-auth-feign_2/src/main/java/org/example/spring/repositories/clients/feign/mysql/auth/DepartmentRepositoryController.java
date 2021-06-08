package org.example.spring.repositories.clients.feign.mysql.auth;


import org.example.spring.repositories.clients.auth.api.DepartmentRepository;
import org.example.spring.repositories.feign.auth.clients.DepartmentRepositoryClient;
import org.example.spring.repositories.feign.auth.clients.impl.DepartmentRepositoryClientImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Primary
public class DepartmentRepositoryController extends DepartmentRepositoryClientImpl implements DepartmentRepositoryClient {
    public DepartmentRepositoryController(DepartmentRepository repository) {
        super(repository);
    }
}