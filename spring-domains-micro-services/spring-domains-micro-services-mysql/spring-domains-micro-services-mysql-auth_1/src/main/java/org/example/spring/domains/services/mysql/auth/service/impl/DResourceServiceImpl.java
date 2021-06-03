package org.example.spring.domains.services.mysql.auth.service.impl;


import cn.hutool.core.lang.tree.Tree;
import lombok.AllArgsConstructor;
import org.example.spring.domains.services.mysql.auth.service.DResourceService;
import org.example.spring.repositories.clients.auth.api.ResourceRepository;
import org.example.spring.repositories.commons.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.auth.vo.ResourceVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class DResourceServiceImpl implements DResourceService {
    private final ResourceRepository resourceRepository;

    @Override
    public List<Tree<Long>> lisResourceByUserId(Long id) {
        return null;
    }

    @Override
    public List<Tree<Long>> selectTreeList(ResourceQuery query) {
        return null;
    }

    @Override
    public ResourceDTO get(Long id) {
        return resourceRepository.get(id);
    }

    @Override
    public void save(ResourceVo vo) {
        resourceRepository.save(vo);
    }

    @Override
    public void update(ResourceVo vo) {
        resourceRepository.update(vo);
    }

    @Override
    public void delete(List<Long> ids) {
        resourceRepository.delete(ids);
    }

    @Override
    public void delete(Long... ids) {
        resourceRepository.delete(ids);
    }

    @Override
    public void delete(Long id) {
        resourceRepository.delete(id);
    }
}