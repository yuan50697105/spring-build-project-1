package org.example.spring.repositories.clients.auth.oracle.feign;


import org.example.spring.repositories.clients.auth.api.ResourceRepository;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Resource;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;
import org.example.spring.repositories.feign.auth.clients.ResourceRepositoryClient;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Primary
public class ResourceRepositoryController extends CommonsFeignClientImpl<Resource, ResourceVo, ResourceDTO, ResourceQuery, ResourceRepository> implements ResourceRepositoryClient {
    public ResourceRepositoryController(ResourceRepository repository) {
        super(repository);
    }
}