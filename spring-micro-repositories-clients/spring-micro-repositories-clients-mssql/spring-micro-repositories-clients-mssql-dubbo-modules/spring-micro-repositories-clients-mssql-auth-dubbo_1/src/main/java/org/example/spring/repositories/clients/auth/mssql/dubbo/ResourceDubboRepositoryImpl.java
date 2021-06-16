package org.example.spring.repositories.clients.auth.mssql.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.mssql.api.ResourceRepositoryImpl;
import org.example.spring.repositories.clients.auth.mssql.converter.ResourceRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.ResourceDubboRepository;
import org.example.spring.repositories.mssql.auth.repository.TResourceRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@DubboService
@Primary
public class ResourceDubboRepositoryImpl extends ResourceRepositoryImpl implements ResourceDubboRepository {
    public ResourceDubboRepositoryImpl(ResourceRepositoryConverter converter, TResourceRepository repository) {
        super(converter, repository);
    }
}