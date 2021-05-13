package org.example.spring.daos.mysql.auth.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.builder.AuthClientBuilder;
import org.example.spring.daos.mysql.auth.dao.TRoleDao;
import org.example.spring.daos.mysql.auth.dao.TRoleResourceDao;
import org.example.spring.daos.mysql.auth.entity.Role;
import org.example.spring.daos.mysql.auth.entity.query.RoleQuery;
import org.example.spring.daos.mysql.auth.table.po.TRole;
import org.example.spring.daos.mysql.auth.table.query.TRoleQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@DubboService
@AllArgsConstructor
public class RoleDaoClientImpl implements RoleDaoClient {
    private final AuthClientBuilder authClientBuilder;
    private final TRoleDao roleDao;
    private final TRoleResourceDao roleResourceDao;

    @Override
    public void save(Role role) {
        TRole entity = authClientBuilder.createForSave(role);
        roleDao.save(entity);
        roleResourceDao.saveNew(entity.getId(), role.getResourceIds());
    }

    @Override
    public void update(Role role) {
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
    public Role get(Long id) {
        return authClientBuilder.createForGetRole(roleDao.getById(id));
    }

    @Override
    public Optional<Role> get(RoleQuery query) {
        TRoleQuery roleQuery = authClientBuilder.createForQuery(query);
        Optional<TRole> tRole = roleDao.queryFirst(roleQuery);
        return Optional.ofNullable(authClientBuilder.createForGetRole(tRole.orElse(null)));
    }

    @Override
    public List<Role> list(RoleQuery query) {
        TRoleQuery roleQuery = authClientBuilder.createForQuery(query);
        List<TRole> list = roleDao.queryTop(roleQuery, roleQuery.getSize());
        return authClientBuilder.createForGetRole(list);

    }

    @Override
    public IPageData<Role> data(RoleQuery query) {
        TRoleQuery roleQuery = authClientBuilder.createForQuery(query);
        IPageData<TRole> list = roleDao.queryPage(roleQuery);
        return authClientBuilder.createForGetRole(list);
    }
}