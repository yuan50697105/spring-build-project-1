package org.example.spring.repositories.clients.auth.oracle.dubbo;

import cn.hutool.core.lang.tree.Tree;
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

import java.util.List;

@Component
@DubboService
@Primary
public class ResourceDubboRepositoryImpl extends CommonsDubboRepositoryImpl<Resource, ResourceVo, ResourceDTO, ResourceQuery, ResourceRepository> implements ResourceDubboRepository {
    private final ResourceRepository repository;

    protected ResourceDubboRepositoryImpl(ResourceRepository repository) {
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