package org.example.spring.domains.services.mysql.auth.service.impl;

import cn.hutool.core.lang.tree.Tree;
import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.table.dto.TResourceDTO;
import org.example.spring.daos.mysql.auth.table.query.TResourceQuery;
import org.example.spring.daos.mysql.auth.table.vo.TResourceVo;
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
        return resourceRepository.queryListByUserId(id);
    }

    @Override
    public List<Tree<Long>> selectTreeList(TResourceQuery query) {
        return null;
    }

    @Override
    public TResourceDTO get(Long id) {
        return resourceRepository.get(id);
    }

    @Override
    public void save(TResourceVo formVo) {
        resourceRepository.save(formVo);
    }

    @Override
    public void update(TResourceVo formVo) {
        resourceRepository.update(formVo);
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