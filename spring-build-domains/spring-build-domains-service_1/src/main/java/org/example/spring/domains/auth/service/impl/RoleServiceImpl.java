package org.example.spring.domains.auth.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.auth.service.RoleService;
import org.example.spring.infrastructures.mysql.auth.entity.query.RoleQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Role;
import org.example.spring.infrastructures.mysql.auth.entity.result.RoleDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.RoleFormVo;
import org.example.spring.infrastructures.mysql.auth.repository.RoleRepository;
import org.example.spring.plugins.mybatis.entity.IPageData;
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
        return roleRepository.getById(id);
    }

    @Override
    public void save(RoleFormVo formVo) {
        roleRepository.save(formVo);
    }

    @Override
    public void update(RoleFormVo formVo) {
        roleRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        roleRepository.delete(ids);
    }
}