package org.example.spring.infrastructures.mysql.auth.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.infrastructures.mysql.auth.builder.AuthClientBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TRoleDao;
import org.example.spring.infrastructures.mysql.auth.dao.TRoleResourceDao;
import org.example.spring.infrastructures.mysql.auth.entity.ITRole;
import org.example.spring.infrastructures.mysql.auth.entity.query.ITRoleQuery;
import org.example.spring.infrastructures.mysql.auth.table.po.TRole;
import org.example.spring.infrastructures.mysql.auth.table.query.TRoleQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@DubboService
@AllArgsConstructor
public class TRoleClientImpl implements TRoleClient {
    private final AuthClientBuilder authClientBuilder;
    private final TRoleDao roleDao;
    private final TRoleResourceDao roleResourceDao;

    @Override
    public void save(ITRole role) {
        TRole entity = authClientBuilder.createForSave(role);
        roleDao.save(entity);
        roleResourceDao.saveNew(entity.getId(), role.getResourceIds());
    }

    @Override
    public void update(ITRole role) {
        Optional<TRole> optional = roleDao.getByIdOpt(role.getId());
        if (optional.isPresent()) {
            TRole tRole = optional.get();
            tRole.copy(authClientBuilder.createForSave(role));
            roleDao.updateById(tRole);
            roleResourceDao.saveNew(role.getId(), role.getResourceIds());
        }
    }

    @Override
    public void delete(List<Long> ids) {
        roleDao.deleteByIds(ids);
        roleResourceDao.removeByRoleIds(ids);
    }

    @Override
    public ITRole get(Long id) {
        return authClientBuilder.createForGetRole(roleDao.getById(id));
    }

    @Override
    public Optional<ITRole> get(ITRoleQuery query) {
        TRoleQuery roleQuery = authClientBuilder.createForQuery(query);
        Optional<TRole> tRole = roleDao.queryFirst(roleQuery);
        return Optional.ofNullable(authClientBuilder.createForGetRole(tRole.orElse(null)));
    }

    @Override
    public List<ITRole> list(ITRoleQuery query) {
        TRoleQuery roleQuery = authClientBuilder.createForQuery(query);
        List<TRole> list = roleDao.queryTop(roleQuery, roleQuery.getSize());
        return authClientBuilder.createForGetUser(list);

    }

    @Override
    public IPageData<ITRole> data(ITRoleQuery query) {
        return null;
    }
}