package org.example.spring.daos.mysql.auth.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.builder.AuthClientBuilder;
import org.example.spring.daos.mysql.auth.dao.TResourceDao;
import org.example.spring.daos.mysql.auth.entity.vo.ResourceVo;
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
    public void delete(List<Long> ids) {
        validateDelete(ids);
    }

    private void validateDelete(List<Long> ids) {
        if (resourceDao.validateDelete(ids)) {
            throw new ValidationException("存在下级菜单");
        }
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
        List<TResource> resourceList = resourceDao.queryTop(resourceQuery, resourceQuery.getSize());
        return authClientBuilder.createForGetResource(resourceList);
    }

    @Override
    public IPageData<ResourceVo> data(ResourceQuery query) {
        TResourceQuery resourceQuery = authClientBuilder.createForQuery(query);
        IPageData<TResource> pageData = resourceDao.queryPage(resourceQuery);
        return authClientBuilder.createForGetResource(pageData);
    }

}