package org.example.spring.repositories.clients.auth.postgres.feign;


import cn.hutool.core.lang.tree.Tree;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.api.ResourceRepository;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Resource;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;
import org.example.spring.repositories.feign.auth.clients.ResourceRepositoryClient;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@DubboService
public class ResourceRepositoryController extends CommonsFeignClientImpl<Resource, ResourceVo, ResourceDTO, ResourceQuery, ResourceRepository> implements ResourceRepositoryClient {
    private final ResourceRepository repository;

    public ResourceRepositoryController(ResourceRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public List<Tree<Long>> queryTreeByUserId(Long id) {
        return repository.queryTreeByUserId(id);
    }

    @Override
    public List<Tree<Long>> queryTreeList(ResourceQuery query) {
        return repository.queryTreeList(query);
    }
}