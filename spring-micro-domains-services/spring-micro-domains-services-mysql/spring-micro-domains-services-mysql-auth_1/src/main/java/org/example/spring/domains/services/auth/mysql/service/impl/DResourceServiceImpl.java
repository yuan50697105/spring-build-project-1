package org.example.spring.domains.services.auth.mysql.service.impl;


import cn.hutool.core.lang.tree.Tree;
import lombok.AllArgsConstructor;
import org.example.spring.domains.services.impl.DServiceImpl;
import org.example.spring.domains.services.auth.mysql.service.DResourceService;
import org.example.spring.repositories.clients.auth.api.ResourceRepository;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Resource;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class DResourceServiceImpl extends DServiceImpl<Resource, ResourceVo, ResourceDTO, ResourceQuery, ResourceRepository> implements DResourceService {

    @Override
    public List<Tree<Long>> queryTreeByUserId(Long id) {
        return repository.queryTreeByUserId(id);
    }

    @Override
    public List<Tree<Long>> selectTreeByUserId(Long id) {
        return repository.queryTreeByUserId(id);
    }

    @Override
    public List<Tree<Long>> selectTreeList(ResourceQuery query) {
        return repository.queryTreeList(query);
    }

    @Override
    public List<Tree<Long>> queryTreeList(ResourceQuery query) {
        return repository.queryTreeList(query);
    }

}