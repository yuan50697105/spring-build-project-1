package org.example.spring.repositories.mysql.auth.repository.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeUtil;
import cn.hutool.core.lang.tree.parser.NodeParser;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.auth.converter.TResourceConverter;
import org.example.spring.repositories.mysql.auth.dao.TResourceDao;
import org.example.spring.repositories.mysql.auth.repository.TResourceRepository;
import org.example.spring.repositories.mysql.auth.table.dto.TResourceDTO;
import org.example.spring.repositories.mysql.auth.table.po.TResource;
import org.example.spring.repositories.mysql.auth.table.query.TResourceQuery;
import org.example.spring.repositories.mysql.auth.table.vo.TResourceVo;
import org.example.spring.repositories.mysql.auth.utils.ResourceUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

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