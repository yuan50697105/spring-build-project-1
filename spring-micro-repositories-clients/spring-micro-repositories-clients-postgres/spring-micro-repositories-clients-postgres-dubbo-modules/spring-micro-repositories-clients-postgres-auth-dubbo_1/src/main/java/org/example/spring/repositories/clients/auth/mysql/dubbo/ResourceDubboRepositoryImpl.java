package org.example.spring.repositories.clients.auth.mysql.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.api.ResourceRepository;
import org.example.spring.repositories.clients.dubbo.auth.api.ResourceDubboRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Resource;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@DubboService
@Primary
public class ResourceDubboRepositoryImpl extends CommonsDubboRepositoryImpl<Resource, ResourceVo, ResourceDTO, ResourceQuery, ResourceRepository> implements ResourceDubboRepository {
    protected ResourceDubboRepositoryImpl(ResourceRepository repository) {
        super(repository);
    }
}