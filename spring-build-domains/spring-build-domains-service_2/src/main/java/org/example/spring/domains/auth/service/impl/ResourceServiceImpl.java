package org.example.spring.domains.auth.service.impl;

import cn.hutool.core.lang.tree.Tree;
import lombok.AllArgsConstructor;
import org.example.spring.domains.auth.service.ResourceService;
import org.example.spring.infrastructures.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.PermissionDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.PermissionFormVo;
import org.example.spring.infrastructures.mysql.auth.repository.ResourceRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ResourceServiceImpl implements ResourceService {
    private final ResourceRepository resourceRepository;

    @Override
    public List<Tree<Long>> listResourceByUserId(Long id) {
        return resourceRepository.listAllResourceByUserId(id);
    }

    @Override
    public List<Tree<Long>> selectTreeList(ResourceQuery query) {
        return resourceRepository.queryTreeList(query);
    }

    @Override
    public PermissionDetails get(Long id) {
        return resourceRepository.getById(id);
    }

    @Override
    public void save(PermissionFormVo formVo) {
        resourceRepository.save(formVo);
    }

    @Override
    public void update(PermissionFormVo formVo) {
        resourceRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        resourceRepository.delete(ids);
    }
}