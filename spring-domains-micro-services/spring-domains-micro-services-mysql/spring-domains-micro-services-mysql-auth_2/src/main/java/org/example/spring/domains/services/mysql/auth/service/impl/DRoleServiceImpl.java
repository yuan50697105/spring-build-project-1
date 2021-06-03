package org.example.spring.domains.services.mysql.auth.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.services.mysql.auth.service.DRoleService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.mysql.auth.repository.RoleRepository;
import org.example.spring.repositories.mysql.auth.table.dto.RoleDTO;
import org.example.spring.repositories.mysql.auth.table.query.RoleQuery;
import org.example.spring.repositories.mysql.auth.table.vo.RoleVo;
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
        return roleRepository.queryPage(query);
    }

    @Override
    public List<RoleDTO> queryList(RoleQuery query) {
        return roleRepository.queryTop(query);
    }

    @Override
    public RoleDTO queryOne(RoleQuery query) {
        return roleRepository.queryFirst(query);
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