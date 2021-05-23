package org.example.spring.daos.mysql.auth.client;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.converter.TRoleRepositoryClientConverter;
import org.example.spring.daos.mysql.auth.entity.query.RoleQuery;
import org.example.spring.daos.mysql.auth.entity.vo.RoleVo;
import org.example.spring.daos.mysql.auth.repository.TRoleRepository;
import org.example.spring.daos.mysql.auth.table.po.TRole;
import org.example.spring.daos.mysql.auth.table.query.TRoleQuery;
import org.example.spring.daos.mysql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@DubboService
@AllArgsConstructor
public class ITRoleRepositoryClientImpl implements IRoleRepositoryClient {
    private final TRoleRepository roleRepository;
    private final TRoleRepositoryClientConverter converter
    @Override
    @GlobalTransactional
    public void save(RoleVo roleVo) {
        TRoleVo vo = converter.build(roleVo);
        roleRepository.save(vo);
    }

    @Override
    @GlobalTransactional
    public void update(RoleVo roleVo) {
        TRoleVo vo = converter.build(roleVo);
        roleRepository.save(vo);
    }

    @Override
    @GlobalTransactional
    public void delete(List<Long> ids) {
        roleRepository.delete(ids);
    }

    @Override
    public RoleVo get(Long id) {
        return converter.build(roleDao.getById(id));
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