package org.example.spring.domains.services.mysql.auth.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.vo.TRoleVo;
import org.example.spring.domains.repositories.mysql.auth.entity.query.DRoleQuery;
import org.example.spring.domains.repositories.mysql.auth.repository.DRoleRepository;
import org.example.spring.domains.services.mysql.auth.service.DRoleService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class DRoleServiceImpl implements DRoleService {
    private final DRoleRepository roleRepository;

    @Override
    public IPageData<TRoleDTO> queryPage(DRoleQuery query) {
        return roleRepository.queryPage(query);
    }

    @Override
    public List<TRoleDTO> queryList(DRoleQuery query) {
        return roleRepository.queryTop(query);
    }

    @Override
    public TRoleDTO queryOne(DRoleQuery query) {
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