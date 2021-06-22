package org.example.spring.repositories.auth.repository;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.plugins.mybatis.repository.ICommonsRepository;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Resource;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;

import java.util.List;

public interface ResourceRepository extends ICommonsRepository<Resource, ResourceDTO, ResourceVo, ResourceQuery> {
    List<ResourceDTO> queryListByRoleId(Long id);

    default List<ResourceDTO> selectListByRoleId(Long id) {
        return queryListByRoleId(id);
    }

    default List<ResourceDTO> searchListByRoleId(Long id) {
        return queryListByRoleId(id);
    }

    default List<ResourceDTO> findListByRoleId(Long id) {
        return queryListByRoleId(id);
    }

    List<Tree<Long>> queryTreeByRoleId(Long roleId);

    default List<Tree<Long>> selectTreeByRoleId(Long roleId) {
        return queryTreeByRoleId(roleId);
    }

    default List<Tree<Long>> searchTreeByRoleId(Long roleId) {
        return queryTreeByRoleId(roleId);
    }

    default List<Tree<Long>> findTreeByRoleId(Long roleId) {
        return queryTreeByRoleId(roleId);
    }

    List<Tree<Long>> queryTreeByUserId(Long id);

    default List<Tree<Long>> selectTreeByUserId(Long id) {
        return queryTreeByUserId(id);
    }

    default List<Tree<Long>> searchTreeByUserId(Long id) {
        return queryTreeByUserId(id);
    }

    default List<Tree<Long>> findTreeByUserId(Long id) {
        return queryTreeByUserId(id);
    }

    List<Tree<Long>> queryTree(ResourceQuery query);

    default List<Tree<Long>> findTree(ResourceQuery query) {
        return queryTree(query);
    }

    default List<Tree<Long>> selectTree(ResourceQuery query) {
        return queryTree(query);
    }

    default List<Tree<Long>> searchTree(ResourceQuery query) {
        return queryTree(query);
    }
}
