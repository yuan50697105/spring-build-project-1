package org.example.spring.repositories.clients.feign.mysql.auth;

import org.example.spring.repositories.clients.auth.mysql.api.ResourceRepositoryImpl;
import org.example.spring.repositories.clients.auth.mysql.converter.ResourceRepositoryConverter;
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