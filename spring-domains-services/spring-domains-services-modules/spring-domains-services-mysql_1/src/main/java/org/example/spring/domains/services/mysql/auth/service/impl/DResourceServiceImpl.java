package org.example.spring.domains.services.mysql.auth.service.impl;

import cn.hutool.core.lang.tree.Tree;
import lombok.AllArgsConstructor;
import org.example.spring.domains.repositories.mysql.auth.entity.query.DResourceQuery;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DResourceDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.vo.DResourceVo;
import org.example.spring.domains.repositories.mysql.auth.repository.DResourceRepository;
import org.example.spring.domains.services.mysql.auth.service.DResourceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class DResourceServiceImpl implements DResourceService {
    private final DResourceRepository resourceRepository;

    @Override
    public List<Tree<Long>> listResourceByUserId(Long id) {
        return null;
    }

    @Override
    public List<Tree<Long>> selectTreeList(DResourceQuery query) {
        return null;
    }

    @Override
    public DResourceDTO get(Long id) {
        return null;
    }

    @Override
    public void save(DResourceVo formVo) {

    }

    @Override
    public void update(DResourceVo formVo) {
    }

    @Override
    public void delete(List<Long> ids) {

    }
}