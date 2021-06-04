package org.example.spring.repositories.mysql.auth.controller.controller;

import org.example.spring.auth.api.DepartmentRepositoryImpl;
import org.example.spring.auth.converter.DepartmentRepositoryConverter;
import org.example.spring.repositories.clients.auth.api.DepartmentRepository;
import org.example.spring.repositories.mysql.auth.repository.TDepartmentRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentRepositoryController extends DepartmentRepositoryImpl implements DepartmentRepository {
    public DepartmentRepositoryController(DepartmentRepositoryConverter converter, TDepartmentRepository repository) {
        super(converter, repository);
    }
}