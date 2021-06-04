package org.example.spring.repositories.clients.dubbo.myql.auth;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.auth.api.ResourceRepositoryImpl;
import org.example.spring.auth.converter.ResourceRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.DubboResourceRepository;
import org.example.spring.repositories.mysql.auth.repository.TResourceRepository;
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