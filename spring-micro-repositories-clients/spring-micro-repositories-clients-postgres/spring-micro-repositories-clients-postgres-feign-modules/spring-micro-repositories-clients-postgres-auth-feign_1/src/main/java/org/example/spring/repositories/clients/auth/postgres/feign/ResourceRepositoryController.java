package org.example.spring.repositories.clients.auth.postgres.feign;


import org.example.spring.repositories.clients.auth.api.ResourceRepository;
import org.example.spring.repositories.feign.auth.clients.ResourceRepositoryClient;
import org.example.spring.repositories.feign.auth.clients.impl.ResourceRepositoryClientImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Primary
public class ResourceRepositoryController extends ResourceRepositoryClientImpl implements ResourceRepositoryClient {
    public ResourceRepositoryController(ResourceRepository repository) {
        super(repository);
    }
}