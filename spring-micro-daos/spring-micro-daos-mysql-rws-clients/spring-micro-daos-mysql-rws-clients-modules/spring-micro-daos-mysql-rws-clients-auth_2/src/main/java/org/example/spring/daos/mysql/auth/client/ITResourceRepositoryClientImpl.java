package org.example.spring.daos.mysql.auth.client;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.converter.TResourceRepositoryClientConverter;
import org.example.spring.daos.mysql.auth.entity.dto.ResourceDTO;
import org.example.spring.daos.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.daos.mysql.auth.entity.vo.ResourceVo;
import org.example.spring.daos.mysql.auth.repository.TResourceRepository;
import org.example.spring.daos.mysql.auth.table.dto.TResourceDTO;
import org.example.spring.daos.mysql.auth.table.po.TResource;
import org.example.spring.daos.mysql.auth.table.query.TResourceQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@DubboService
@AllArgsConstructor
public class ITResourceRepositoryClientImpl implements IResourceRepositoryClient {
    private final TResourceRepositoryClientConverter converter;
    private final TResourceRepository resourceRepository;

    @Override
    @GlobalTransactional
    public void save(ResourceVo resourceVo) {
        resourceRepository.save(converter.build(resourceVo));
    }

    @Override
    public void update(ResourceVo resourceVo) {
        resourceRepository.update(converter.build(resourceVo));
    }

    @Override
    @GlobalTransactional
    public void delete(List<Long> ids) {
        resourceRepository.delete(ids);
    }

    @Override
    public ResourceDTO get(Long id) {
        return converter.build(resourceRepository.get(id));
    }

    @Override
    public Optional<ResourceDTO> get(ResourceQuery query) {
        TResourceQuery resourceQuery = converter.build(query);
        TResourceDTO optional = resourceRepository.queryFirst(resourceQuery);
        return Optional.ofNullable(converter.build(optional));
    }

    @Override
    public List<ResourceDTO> list(ResourceQuery query) {
        TResourceQuery resourceQuery = converter.build(query);
        List<TResourceDTO> resourceList = resourceRepository.queryTop(resourceQuery);
        return converter.build(resourceList);
    }

    @Override
    public IPageData<ResourceDTO> data(ResourceQuery query) {
        TResourceQuery resourceQuery = converter.build(query);
        IPageData<TResourceDTO> pageData = resourceRepository.queryPage(resourceQuery);
        return converter.build(pageData);
    }

}