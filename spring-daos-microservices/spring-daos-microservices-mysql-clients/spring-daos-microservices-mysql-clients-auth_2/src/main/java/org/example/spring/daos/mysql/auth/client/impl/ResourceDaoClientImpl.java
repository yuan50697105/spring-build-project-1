package org.example.spring.daos.mysql.auth.client.impl;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.client.ResourceDaoClient;
import org.example.spring.daos.mysql.auth.dao.TResourceDao;
import org.example.spring.daos.mysql.auth.entity.Resource;
import org.example.spring.daos.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.daos.mysql.auth.table.po.TResource;
import org.example.spring.daos.mysql.auth.table.query.TResourceQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ValidationException;
import java.util.List;
import java.util.Optional;

@RestController
@DubboService
@AllArgsConstructor
@Transactional
public class ResourceDaoClientImpl implements ResourceDaoClient {
    private final AuthClientBuilder authClientBuilder;
    private final TResourceDao resourceDao;

    @Override
    public void save(Resource resource) {
        resourceDao.save(authClientBuilder.createForSave(resource));
    }

    @Override
    public void update(Resource resource) {
        Optional<TResource> optional = resourceDao.getByIdOpt(resource.getId());
        if (optional.isPresent()) {
            TResource tResource = optional.get();
            tResource.copy(authClientBuilder.createForSave(resource));
            resourceDao.updateById(tResource);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        validateDelete(ids);
    }

    private void validateDelete(List<Long> ids) {
        if (resourceDao.validateDelete(ids)) {
            throw new ValidationException("存在下级菜单");
        }
    }

    @Override
    public Resource get(Long id) {
        return authClientBuilder.createForGetResource(resourceDao.getById(id));
    }

    @Override
    public Optional<Resource> get(ResourceQuery query) {
        TResourceQuery resourceQuery = authClientBuilder.createForQuery(query);
        Optional<TResource> optional = resourceDao.queryFirst(resourceQuery);
        return Optional.ofNullable(authClientBuilder.createForGetResource(optional.orElse(null)));
    }

    @Override
    public List<Resource> list(ResourceQuery query) {
        TResourceQuery resourceQuery = authClientBuilder.createForQuery(query);
        List<TResource> resourceList = resourceDao.queryTop(resourceQuery, resourceQuery.getSize());
        return authClientBuilder.createForGetResource(resourceList);
    }

    @Override
    public IPageData<Resource> data(ResourceQuery query) {
        TResourceQuery resourceQuery = authClientBuilder.createForQuery(query);
        IPageData<TResource> pageData = resourceDao.queryPage(resourceQuery);
        return authClientBuilder.createForGetResource(pageData);
    }

}