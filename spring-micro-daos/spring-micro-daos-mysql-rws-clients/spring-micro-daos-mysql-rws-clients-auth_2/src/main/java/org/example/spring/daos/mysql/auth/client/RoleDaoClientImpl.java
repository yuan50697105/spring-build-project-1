package org.example.spring.daos.mysql.auth.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.builder.AuthClientBuilder;
import org.example.spring.daos.mysql.auth.dao.TRoleDao;
import org.example.spring.daos.mysql.auth.dao.TRoleResourceDao;
import org.example.spring.daos.mysql.auth.entity.vo.RoleVo;
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
    public void save(RoleVo roleVo) {
        TRole entity = authClientBuilder.createForSave(roleVo);
        roleDao.save(entity);
        roleResourceDao.saveNew(entity.getId(), roleVo.getResourceIds());
    }

    @Override
    public void update(RoleVo roleVo) {
        Optional<TRole> optional = roleDao.getByIdOpt(roleVo.getId());
        if (optional.isPresent()) {
            TRole tRole = optional.get();
            tRole.copy(authClientBuilder.createForSave(roleVo));
            roleDao.updateById(tRole);
            roleResourceDao.saveNew(roleVo.getId(), roleVo.getResourceIds());
        }
    }

    @Override
    public void delete(List<Long> ids) {
        roleDao.deleteByIds(ids);
        roleResourceDao.removeByRoleIds(ids);
    }

    @Override
    public RoleVo get(Long id) {
        return authClientBuilder.createForGetRole(roleDao.getById(id));
    }

    @Override
    public Optional<RoleVo> get(RoleQuery query) {
        TRoleQuery roleQuery = authClientBuilder.createForQuery(query);
        Optional<TRole> tRole = roleDao.queryFirstOpt(roleQuery);
        return Optional.ofNullable(authClientBuilder.createForGetRole(tRole.orElse(null)));
    }

    @Override
    public List<RoleVo> list(RoleQuery query) {
        TRoleQuery roleQuery = authClientBuilder.createForQuery(query);
        List<TRole> list = roleDao.queryTop(roleQuery);
        return authClientBuilder.createForGetRole(list);

    }

    @Override
    public IPageData<RoleVo> data(RoleQuery query) {
        TRoleQuery roleQuery = authClientBuilder.createForQuery(query);
        IPageData<TRole> list = roleDao.queryPage(roleQuery);
        return authClientBuilder.createForGetRole(list);
    }
}