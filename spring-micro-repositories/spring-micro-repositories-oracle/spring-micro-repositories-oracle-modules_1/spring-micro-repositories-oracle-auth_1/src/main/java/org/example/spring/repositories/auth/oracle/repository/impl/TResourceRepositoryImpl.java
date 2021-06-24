package org.example.spring.repositories.auth.oracle.repository.impl;

import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeUtil;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.auth.oracle.converter.TResourceConverter;
import org.example.spring.repositories.auth.oracle.dao.TResourceDao;
import org.example.spring.repositories.auth.oracle.repository.TResourceRepository;
import org.example.spring.repositories.auth.oracle.table.dto.TResourceDTO;
import org.example.spring.repositories.auth.oracle.table.po.TResource;
import org.example.spring.repositories.auth.oracle.table.query.TResourceQuery;
import org.example.spring.repositories.auth.oracle.table.vo.TResourceVo;
import org.example.spring.repositories.auth.oracle.utils.ResourceUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
@Deprecated
public class TResourceRepositoryImpl extends IBaseRepositoryImpl<TResource, TResourceDTO, TResourceVo, TResourceQuery, TResourceConverter, TResourceDao> implements TResourceRepository {
    @Override
    public List<TResourceDTO> queryListByRoleId(Long roleId) {
        return converter.buildDTOS(dao.queryListByRoleId(roleId));
    }

    @Override
    public List<Tree<Long>> queryTreeByRoleId(Long roleId) {
        List<TResource> tResources = dao.queryListByRoleId(roleId);
        List<TResourceDTO> resourceDTOS = converter.buildDTOS(tResources);
        return TreeUtil.build(resourceDTOS, 0L, ResourceUtils.tResourceToTreeParser());
    }

    @Override
    public List<Tree<Long>> queryTreeByUserId(Long id) {
        List<TResource> tResources = dao.queryListByUserId(id);
        List<TResourceDTO> resourceDTOS = converter.buildDTOS(tResources);
        return TreeUtil.build(resourceDTOS, 0L, ResourceUtils.tResourceToTreeParser());
    }

    @Override
    public List<Tree<Long>> queryTree(TResourceQuery query) {
        return TreeUtil.build(queryList(query), 0L, ResourceUtils.tResourceToTreeParser());
    }

}