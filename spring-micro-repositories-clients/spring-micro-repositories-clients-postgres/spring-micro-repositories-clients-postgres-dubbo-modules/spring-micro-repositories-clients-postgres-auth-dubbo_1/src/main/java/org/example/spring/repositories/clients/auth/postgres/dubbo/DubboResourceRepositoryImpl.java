package org.example.spring.repositories.clients.auth.postgres.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.postgres.api.ResourceRepositoryImpl;
import org.example.spring.repositories.clients.auth.postgres.converter.ResourceRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.DubboResourceRepository;
import org.example.spring.repositories.postgres.auth.repository.TResourceRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@DubboService
@Primary
public class DubboResourceRepositoryImpl extends ResourceRepositoryImpl implements DubboResourceRepository {
    public DubboResourceRepositoryImpl(ResourceRepositoryConverter converter, TResourceRepository repository) {
        super(converter, repository);
    }
}