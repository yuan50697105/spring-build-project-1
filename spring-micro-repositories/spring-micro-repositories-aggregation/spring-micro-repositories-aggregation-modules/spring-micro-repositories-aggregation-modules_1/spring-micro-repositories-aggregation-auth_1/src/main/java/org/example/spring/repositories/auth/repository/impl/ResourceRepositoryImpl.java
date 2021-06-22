package org.example.spring.repositories.auth.repository.impl;

import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeUtil;
import org.example.spring.plugins.mybatis.repository.impl.ICommonsRepositoryImpl;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Resource;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;
import org.example.spring.repositories.auth.converter.ResourceConverter;
import org.example.spring.repositories.auth.dao.TResourceDao;
import org.example.spring.repositories.auth.repository.ResourceRepository;
import org.example.spring.repositories.auth.table.po.TResource;
import org.example.spring.repositories.auth.table.query.TResourceQuery;
import org.example.spring.repositories.auth.utils.ResourceUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ResourceRepositoryImpl extends ICommonsRepositoryImpl<Resource, TResource, ResourceQuery, TResourceQuery, ResourceVo, ResourceDTO, ResourceConverter, TResourceDao> implements ResourceRepository {
    private final ResourceConverter converter;
    private final TResourceDao dao;

    protected ResourceRepositoryImpl(ResourceConverter converter, TResourceDao dao) {
        super(converter, dao);
        this.converter = converter;
        this.dao = dao;
    }

    @Override
    public List<ResourceDTO> queryListByRoleId(Long roleId) {
        return converter.buildDTOS(dao.queryListByRoleId(roleId));
    }

    @Override
    public List<Tree<Long>> queryTreeByRoleId(Long roleId) {
        List<TResource> tResources = dao.queryListByRoleId(roleId);
        List<ResourceDTO> resourceDTOS = converter.buildDTOS(tResources);
        return TreeUtil.build(resourceDTOS, 0L, ResourceUtils.resourceToTreeParser());
    }

    @Override
    public List<Tree<Long>> queryTreeByUserId(Long id) {
        List<TResource> tResources = dao.queryListByUserId(id);
        List<ResourceDTO> resourceDTOS = converter.buildDTOS(tResources);
        return TreeUtil.build(resourceDTOS, 0L, ResourceUtils.resourceToTreeParser());
    }

    @Override
    public List<Tree<Long>> queryTree(ResourceQuery query) {
        return TreeUtil.build(queryList(query), 0L, ResourceUtils.resourceToTreeParser());
    }

}