package org.example.spring.domains.auth.service.impl;

import cn.hutool.core.lang.tree.Tree;
import lombok.AllArgsConstructor;
import org.example.spring.domains.auth.service.ResourceService;
import org.example.spring.infrastructures.mysql.auth.entity.query.PermissionQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.PermissionDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.PermissionFormVo;
import org.example.spring.infrastructures.mysql.auth.repository.PermissionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ResourceServiceImpl implements ResourceService {
    private final PermissionRepository permissionRepository;

    @Override
    public List<Tree<Long>> listResourceByUserId(Long id) {
        return permissionRepository.listAllResourceByUserId(id);
    }

    @Override
    public List<Tree<Long>> selectTreeList(PermissionQuery query) {
        return permissionRepository.queryTreeList(query);
    }

    @Override
    public PermissionDetails get(Long id) {
        return permissionRepository.getById(id);
    }

    @Override
    public void save(PermissionFormVo formVo) {
        permissionRepository.save(formVo);
    }

    @Override
    public void update(PermissionFormVo formVo) {
        permissionRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        permissionRepository.delete(ids);
    }
}