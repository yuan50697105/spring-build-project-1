package org.example.spring.domains.postgresql.auth.service.impl;

import cn.hutool.core.lang.tree.Tree;
import lombok.AllArgsConstructor;
import org.example.spring.domains.postgresql.auth.service.ResourceService;
import org.example.spring.models.postgresql.auth.entity.query.ResourceQuery;
import org.example.spring.models.postgresql.auth.entity.result.ResourceDetails;
import org.example.spring.models.postgresql.auth.entity.vo.ResourceModelVo;
import org.example.spring.models.postgresql.auth.repository.ResourceRepository;
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
    public ResourceDetails get(Long id) {
        return resourceRepository.getDetailsById(id);
    }

    @Override
    public void save(ResourceModelVo formVo) {
        resourceRepository.save(formVo);
    }

    @Override
    public void update(ResourceModelVo formVo) {
        resourceRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        resourceRepository.delete(ids);
    }
}