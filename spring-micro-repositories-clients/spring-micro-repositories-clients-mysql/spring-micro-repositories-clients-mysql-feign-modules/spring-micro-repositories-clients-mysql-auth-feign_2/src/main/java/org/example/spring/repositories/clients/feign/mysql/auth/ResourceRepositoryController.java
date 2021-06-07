package org.example.spring.repositories.clients.feign.mysql.auth;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.ResourceRepository;
import org.example.spring.repositories.clients.auth.mysql.api.ResourceRepositoryImpl;
import org.example.spring.repositories.clients.auth.mysql.converter.ResourceRepositoryConverter;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;
import org.example.spring.repositories.feign.auth.clients.ResourceRepositoryClient;
import org.example.spring.repositories.mysql.auth.repository.TResourceRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@Primary
public class ResourceRepositoryController implements ResourceRepositoryClient {
    private final ResourceRepository resourceRepository;

    public ResourceRepositoryController(ResourceRepositoryConverter converter, TResourceRepository repository) {
        this.resourceRepository = new ResourceRepositoryImpl(converter, repository);
    }

    @Override
    public List<Tree<Long>> queryTreeByUserId(Long id) {
        return resourceRepository.queryTreeByUserId(id);
    }

    @Override
    public List<Tree<Long>> queryTreeList(ResourceQuery query) {
        return resourceRepository.queryTreeList(query);
    }

    @Override
    public void save(ResourceVo vo) {
        resourceRepository.save(vo);
    }

    @Override
    public void update(ResourceVo vo) {
        resourceRepository.update(vo);
    }

    @Override
    public void delete(Long id) {
        resourceRepository.delete(id);
    }

    @Override
    public void delete(Long... ids) {
        resourceRepository.delete(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        resourceRepository.delete(ids);
    }

    @Override
    public ResourceDTO get(Long id) {
        return resourceRepository.get(id);
    }

    @Override
    public Optional<ResourceDTO> getOpt(Long id) {
        return resourceRepository.getOpt(id);
    }

    @Override
    public ResourceDTO one(ResourceQuery query) {
        return resourceRepository.one(query);
    }

    @Override
    public Optional<ResourceDTO> oneOpt(ResourceQuery query) {
        return resourceRepository.oneOpt(query);
    }

    @Override
    public ResourceDTO first(ResourceQuery query) {
        return resourceRepository.first(query);
    }

    @Override
    public Optional<ResourceDTO> firstOpt(ResourceQuery query) {
        return resourceRepository.firstOpt(query);
    }

    @Override
    public List<ResourceDTO> list(ResourceQuery query) {
        return resourceRepository.list(query);
    }

    @Override
    public Stream<ResourceDTO> listStream(ResourceQuery query) {
        return resourceRepository.listStream(query);
    }

    @Override
    public List<ResourceDTO> top(ResourceQuery query) {
        return resourceRepository.top(query);
    }

    @Override
    public Stream<ResourceDTO> topStream(ResourceQuery query) {
        return resourceRepository.topStream(query);
    }

    @Override
    public IPageData<ResourceDTO> data(ResourceQuery query) {
        return resourceRepository.data(query);
    }
}