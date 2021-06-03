package org.example.spring.domains.services.postgres.auth.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.services.postgres.auth.service.DRoleService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.postgres.auth.repository.TRoleRepository;
import org.example.spring.repositories.postgres.auth.table.dto.TRoleDTO;
import org.example.spring.repositories.postgres.auth.table.query.TRoleQuery;
import org.example.spring.repositories.postgres.auth.table.vo.TRoleVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class DRoleServiceImpl implements DRoleService {
    private final TRoleRepository roleRepository;

    @Override
    public IPageData<TRoleDTO> queryPage(TRoleQuery query) {
        return roleRepository.queryPage(query);
    }

    @Override
    public List<TRoleDTO> queryList(TRoleQuery query) {
        return roleRepository.queryTop(query);
    }

    @Override
    public TRoleDTO queryOne(TRoleQuery query) {
        return roleRepository.queryFirst(query);
    }

    @Override
    public TRoleDTO get(Long id) {
        return roleRepository.get(id);
    }

    @Override
    public void save(TRoleVo vo) {
        roleRepository.save(vo);
    }

    @Override
    public void update(TRoleVo vo) {
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