package org.example.spring.domains.auth.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.auth.service.RoleService;
import org.example.spring.models.auth.entity.query.RoleQuery;
import org.example.spring.models.auth.entity.result.Role;
import org.example.spring.models.auth.entity.result.RoleDetails;
import org.example.spring.models.auth.entity.vo.RoleModelVo;
import org.example.spring.models.auth.repository.RoleRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Override
    public IPageData<Role> queryPage(RoleQuery query) {
        return roleRepository.queryPage(query);
    }

    @Override
    public List<Role> queryList(RoleQuery query) {
        return roleRepository.queryTop(query,query.getSize());
    }

    @Override
    public Role queryOne(RoleQuery query) {
        return roleRepository.queryFirst(query);
    }

    @Override
    public RoleDetails get(Long id) {
        return roleRepository.getDetailsById(id);
    }

    @Override
    public void save(RoleModelVo formVo) {
        roleRepository.save(formVo);
    }

    @Override
    public void update(RoleModelVo formVo) {
        roleRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        roleRepository.delete(ids);
    }
}