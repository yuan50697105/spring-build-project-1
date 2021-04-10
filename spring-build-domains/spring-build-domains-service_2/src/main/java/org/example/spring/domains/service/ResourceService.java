package org.example.spring.domains.service;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.infrastructures.mysql.auth.entity.query.PermissionQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Permission;
import org.example.spring.infrastructures.mysql.auth.entity.vo.PermissionFormVo;

import java.util.List;

public interface ResourceService {
    List<Tree<Long>> listResourceByUserId(Long userId);

    List<Tree<Long>> selectTreeList(PermissionQuery query);

    Permission get(Long id);

    void save(PermissionFormVo permission);

    void update(PermissionFormVo permission);

    void delete(List<Long> ids);
}
