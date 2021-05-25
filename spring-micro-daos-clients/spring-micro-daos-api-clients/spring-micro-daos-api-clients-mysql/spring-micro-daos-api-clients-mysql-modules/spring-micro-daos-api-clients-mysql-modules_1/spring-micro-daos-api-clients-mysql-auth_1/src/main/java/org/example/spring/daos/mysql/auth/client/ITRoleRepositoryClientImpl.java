package org.example.spring.daos.mysql.auth.client;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.converter.TRoleRepositoryClientConverter;
import org.example.spring.daos.mysql.auth.entity.dto.RoleDTO;
import org.example.spring.daos.mysql.auth.entity.dto.RoleResourceDTO;
import org.example.spring.daos.mysql.auth.entity.query.RoleQuery;
import org.example.spring.daos.mysql.auth.entity.vo.RoleVo;
import org.example.spring.daos.mysql.auth.repository.TRoleRepository;
import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
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
    private final TRoleRepositoryClientConverter converter;
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
    public RoleDTO get(Long id) {
        return converter.build(roleRepository.get(id));
    }

    @Override
    public Optional<RoleDTO> get(RoleQuery query) {
        TRoleQuery roleQuery = converter.build(query);
        TRoleDTO tRole = roleRepository.queryFirst(roleQuery);
        return Optional.ofNullable(converter.build(tRole));
    }

    @Override
    public RoleResourceDTO getRoleResourceDetails(Long id) {
        return converter.buildRoleResourceDTO(roleRepository.getDetails(id));
    }


    @Override
    public List<RoleDTO> list(RoleQuery query) {
        TRoleQuery roleQuery = converter.build(query);
        List<TRoleDTO> list = roleRepository.queryTop(roleQuery);
        return converter.build(list);

    }

    @Override
    public IPageData<RoleDTO> data(RoleQuery query) {
        TRoleQuery roleQuery = converter.build(query);
        IPageData<TRoleDTO> list = roleRepository.queryPage(roleQuery);
        return converter.build(list);
    }
}