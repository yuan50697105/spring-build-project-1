package org.example.spring.repositories.clients.auth.oracle.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.oracle.api.ResourceRepositoryImpl;
import org.example.spring.repositories.clients.auth.oracle.converter.ResourceRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.ResourceDubboRepository;
import org.example.spring.repositories.oracle.auth.repository.TResourceRepository;
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