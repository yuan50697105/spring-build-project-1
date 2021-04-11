package org.example.spring.infrastructures.mysql.auth.repository;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.infrastructures.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Resource;
import org.example.spring.infrastructures.mysql.auth.entity.result.PermissionDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.PermissionFormVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

import java.util.List;

public interface ResourceRepository extends IBaseRepository<Resource, PermissionFormVo, PermissionDetails, ResourceQuery> {
    List<Tree<Long>> listAllResourceByUserId(Long userId);

    List<Tree<Long>> queryTreeList(ResourceQuery query);
}
