package org.example.spring.domains.services.mysql.auth.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.repositories.mysql.auth.entity.query.DRoleQuery;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DRoleDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DRoleDetailsDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.vo.DRoleVo;
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
    public IPageData<DRoleDTO> queryPage(DRoleQuery query) {
        return null;
    }

    @Override
    public List<DRoleDTO> queryList(DRoleQuery query) {
        return null;
    }

    @Override
    public DRoleDTO queryOne(DRoleQuery query) {
        return null;
    }

    @Override
    public DRoleDetailsDTO get(Long id) {
        return null;
    }

    @Override
    public void save(DRoleVo vo) {

    }

    @Override
    public void update(DRoleVo vo) {

    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public void delete(Long... ids) {

    }

    @Override
    public void delete(Long id) {

    }


}