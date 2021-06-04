package org.example.spring.repositories.mysql.auth.controller.controller;

import org.example.spring.auth.api.ResourceRepositoryImpl;
import org.example.spring.auth.converter.ResourceRepositoryConverter;
import org.example.spring.repositories.feign.auth.clients.ResourceRepositoryClient;
import org.example.spring.repositories.mysql.auth.repository.TResourceRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Primary
public class ResourceRepositoryController extends ResourceRepositoryImpl implements ResourceRepositoryClient {
    public ResourceRepositoryController(ResourceRepositoryConverter converter, TResourceRepository repository) {
        super(converter, repository);
    }
}