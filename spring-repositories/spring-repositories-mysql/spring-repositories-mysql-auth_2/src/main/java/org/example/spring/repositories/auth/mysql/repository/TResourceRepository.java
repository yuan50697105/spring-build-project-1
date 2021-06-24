package org.example.spring.repositories.auth.mysql.repository;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.auth.mysql.table.dto.TResourceDTO;
import org.example.spring.repositories.auth.mysql.table.po.TResource;
import org.example.spring.repositories.auth.mysql.table.query.TResourceQuery;
import org.example.spring.repositories.auth.mysql.table.vo.TResourceVo;

import java.util.List;

@Deprecated
public interface TResourceRepository extends IBaseRepository<TResource, TResourceDTO, TResourceVo, TResourceQuery> {
    List<TResourceDTO> queryListByRoleId(Long id);

    default List<TResourceDTO> selectListByRoleId(Long id) {
        return queryListByRoleId(id);
    }

    default List<TResourceDTO> searchListByRoleId(Long id) {
        return queryListByRoleId(id);
    }

    default List<TResourceDTO> findListByRoleId(Long id) {
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

    List<Tree<Long>> queryTree(TResourceQuery query);

    default List<Tree<Long>> findTree(TResourceQuery query) {
        return queryTree(query);
    }

    default List<Tree<Long>> selectTree(TResourceQuery query) {
        return queryTree(query);
    }

    default List<Tree<Long>> searchTree(TResourceQuery query) {
        return queryTree(query);
    }
}
