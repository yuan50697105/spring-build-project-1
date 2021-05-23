package org.example.spring.daos.mysql.auth.client;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.builder.AuthClientBuilder;
import org.example.spring.daos.mysql.auth.dao.TResourceDao;
import org.example.spring.daos.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.daos.mysql.auth.entity.vo.ResourceVo;
import org.example.spring.daos.mysql.auth.table.po.TResource;
import org.example.spring.daos.mysql.auth.table.query.TResourceQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ValidationException;
import java.util.List;
import java.util.Optional;

@RestController
@DubboService
@AllArgsConstructor
public class ITResourceRepositoryClientImpl implements IResourceRepositoryClient {
    private final AuthClientBuilder authClientBuilder;
    private final TResourceDao resourceDao;

    @Override
    @GlobalTransactional
    public void save(ResourceVo resourceVo) {
        resourceDao.save(authClientBuilder.createForSave(resourceVo));
    }

    @Override
    public void update(ResourceVo resourceVo) {
        Optional<TResource> optional = resourceDao.getByIdOpt(resourceVo.getId());
        if (optional.isPresent()) {
            TResource tResource = optional.get();
            tResource.copy(authClientBuilder.createForSave(resourceVo));
            resourceDao.updateById(tResource);
        }
    }

    @Override
    @GlobalTransactional
    public void delete(List<Long> ids) {
        resourceDao.deleteByIds(ids);
    }

    @Override
    public ResourceVo get(Long id) {
        return authClientBuilder.createForGetResource(resourceDao.getById(id));
    }

    @Override
    public Optional<ResourceVo> get(ResourceQuery query) {
        TResourceQuery resourceQuery = authClientBuilder.createForQuery(query);
        Optional<TResource> optional = resourceDao.queryFirstOpt(resourceQuery);
        return Optional.ofNullable(authClientBuilder.createForGetResource(optional.orElse(null)));
    }

    @Override
    public List<ResourceVo> list(ResourceQuery query) {
        TResourceQuery resourceQuery = authClientBuilder.createForQuery(query);
        List<TResource> resourceList = resourceDao.queryTop(resourceQuery);
        return authClientBuilder.createForGetResource(resourceList);
    }

    @Override
    public IPageData<ResourceVo> data(ResourceQuery query) {
        TResourceQuery resourceQuery = authClientBuilder.createForQuery(query);
        IPageData<TResource> pageData = resourceDao.queryPage(resourceQuery);
        return authClientBuilder.createForGetResource(pageData);
    }

}