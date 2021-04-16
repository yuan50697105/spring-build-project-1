package org.example.spring.models.auth.repository;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.models.auth.entity.query.ResourceQuery;
import org.example.spring.models.auth.entity.result.Resource;
import org.example.spring.models.auth.entity.result.ResourceDetails;
import org.example.spring.models.auth.entity.vo.ResourceFormVo;
import org.example.spring.plugins.commons.repository.IBaseRepository;

import java.util.List;

public interface ResourceRepository extends IBaseRepository<Resource, ResourceFormVo, ResourceDetails, ResourceQuery> {
    List<Tree<Long>> listAllResourceByUserId(Long userId);

    List<Tree<Long>> queryTreeList(ResourceQuery query);
}
