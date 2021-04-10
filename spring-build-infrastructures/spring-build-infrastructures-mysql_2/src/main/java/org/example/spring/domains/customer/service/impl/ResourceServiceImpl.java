package org.example.spring.domains.customer.service.impl;

import cn.hutool.core.lang.tree.Tree;
import lombok.AllArgsConstructor;
import org.example.spring.domains.service.ResourceService;
import org.example.spring.infrastructures.mysql.auth.entity.query.PermissionQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Permission;
import org.example.spring.infrastructures.mysql.auth.entity.vo.PermissionFormVo;
import org.example.spring.infrastructures.mysql.auth.repository.PermissionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class ResourceServiceImpl implements ResourceService {
    private final PermissionRepository permissionRepository;

    @Override
    public List<Tree<Long>> listResourceByUserId(Long userId) {
        return permissionRepository.listAllResourceByUserId(userId);
    }

    @Override
    public List<Tree<Long>> selectTreeList(PermissionQuery query) {
        return permissionRepository.queryTreeList(query);
    }

    @Override
    public Permission get(Long id) {
        return permissionRepository.getById(id).getPermission();
    }

    @Override
    public void save(PermissionFormVo permission) {
        permissionRepository.save(permission);
    }

    @Override
    public void update(PermissionFormVo permission) {
        permissionRepository.update(permission);
    }

    @Override
    public void delete(List<Long> ids) {
        permissionRepository.delete(ids);
    }
}