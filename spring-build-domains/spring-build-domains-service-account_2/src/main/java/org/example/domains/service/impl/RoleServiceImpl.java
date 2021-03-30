package org.example.domains.service.impl;

import lombok.AllArgsConstructor;
import org.example.domains.service.RoleService;
import org.example.modules.repository.mysql.entity.query.RoleQuery;
import org.example.modules.repository.mysql.entity.result.Role;
import org.example.modules.repository.mysql.entity.result.RoleDetails;
import org.example.modules.repository.mysql.entity.vo.RoleFormVo;
import org.example.modules.repository.mysql.repository.RoleRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Override
    public void save(RoleFormVo formVo) {
        roleRepository.save(formVo);
    }

    @Override
    public void update(RoleFormVo formVo) {
        roleRepository.update(formVo);
    }

    @Override
    public RoleDetails get(Long id) {
        return roleRepository.getById(id);
    }

    @Override
    public Role queryOne(RoleQuery query) {
        return roleRepository.queryOne(query);
    }

    @Override
    public List<Role> queryList(RoleQuery query) {
        return roleRepository.queryList(query);
    }

    @Override
    public IPageData<Role> queryPage(RoleQuery query) {
        return roleRepository.queryPage(query);
    }
}