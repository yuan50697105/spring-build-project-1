package org.example.spring.repositories.postgres.auth.repository.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeUtil;
import cn.hutool.core.lang.tree.parser.NodeParser;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.postgres.auth.converter.TResourceConverter;
import org.example.spring.repositories.postgres.auth.dao.TResourceDao;
import org.example.spring.repositories.postgres.auth.repository.TResourceRepository;
import org.example.spring.repositories.postgres.auth.table.dto.TResourceDTO;
import org.example.spring.repositories.postgres.auth.table.po.TResource;
import org.example.spring.repositories.postgres.auth.table.query.TResourceQuery;
import org.example.spring.repositories.postgres.auth.table.vo.TResourceVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class TResourceRepositoryImpl extends IBaseRepositoryImpl<TResource, TResourceDTO, TResourceVo, TResourceQuery, TResourceConverter, TResourceDao> implements TResourceRepository {
    @Override
    public List<TResourceDTO> queryListByRoleId(Long roleId) {
        return converter.buildDTOS(dao.queryListByRoleId(roleId));
    }

    @Override
    public List<Tree<Long>> queryTreeByRoleId(Long roleId) {
        List<TResource> tResources = dao.queryListByRoleId(roleId);
        List<TResourceDTO> resourceDTOS = converter.buildDTOS(tResources);
        return TreeUtil.build(resourceDTOS, 0L, resourceToTreeParser());
    }

    @Override
    public List<Tree<Long>> queryTreeByUserId(Long id) {
        List<TResource> tResources = dao.queryListByUserId(id);
        List<TResourceDTO> resourceDTOS = converter.buildDTOS(tResources);
        return TreeUtil.build(resourceDTOS, 0L, resourceToTreeParser());
    }

    private NodeParser<TResourceDTO, Long> resourceToTreeParser() {
        return (resource, tree) -> {
            tree.setParentId(resource.getPid());
            tree.setName(resource.getName());
            tree.setId(resource.getId());
            tree.setWeight(resource.getWeight());
            Map<String, Object> map = BeanUtil.beanToMap(resource);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                tree.putExtra(entry.getKey(), entry.getValue());
            }
        };
    }

}