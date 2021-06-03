package org.example.spring.domains.services.postgres.auth.service.impl;


import lombok.AllArgsConstructor;
import org.example.spring.domains.services.postgres.auth.service.DRoleService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.RoleRepository;
import org.example.spring.repositories.commons.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.auth.query.RoleQuery;
import org.example.spring.repositories.commons.auth.vo.RoleVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class DRoleServiceImpl implements DRoleService {
    private final RoleRepository roleRepository;

    @Override
    public IPageData<RoleDTO> queryPage(RoleQuery query) {
        return roleRepository.data(query);
    }

    @Override
    public List<RoleDTO> queryList(RoleQuery query) {
        return roleRepository.top(query);
    }

    @Override
    public List<RoleDTO> queryTop(RoleQuery query) {
        return roleRepository.top(query);
    }

    @Override
    public RoleDTO queryOne(RoleQuery query) {
        return roleRepository.first(query);
    }

    @Override
    public RoleDTO get(Long id) {
        return roleRepository.get(id);
    }

    @Override
    public void save(RoleVo vo) {
        roleRepository.save(vo);
    }

    @Override
    public void update(RoleVo vo) {
        roleRepository.update(vo);
    }

    @Override
    public void delete(List<Long> ids) {
        roleRepository.delete(ids);
    }

    @Override
    public void delete(Long... ids) {
        roleRepository.delete(ids);
    }

    @Override
    public void delete(Long id) {
        roleRepository.delete(id);
    }


}