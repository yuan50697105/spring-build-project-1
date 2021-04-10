package org.example.spring.domains.auth.service;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.infrastructures.mysql.auth.entity.query.PermissionQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.PermissionDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.PermissionFormVo;

import java.util.List;

public interface ResourceService {
    List<Tree<Long>> listResourceByUserId(Long id);

    List<Tree<Long>> selectTreeList(PermissionQuery query);

    PermissionDetails get(Long id);

    void save(PermissionFormVo formVo);

    void update(PermissionFormVo formVo);

    void delete(List<Long> ids);
}
