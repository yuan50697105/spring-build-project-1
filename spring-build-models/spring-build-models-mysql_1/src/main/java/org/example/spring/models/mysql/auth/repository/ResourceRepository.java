package org.example.spring.models.mysql.auth.repository;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.models.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.models.mysql.auth.entity.result.Resource;
import org.example.spring.models.mysql.auth.entity.result.ResourceDetails;
import org.example.spring.models.mysql.auth.entity.vo.ResourceModelVo;
import org.example.spring.models.commons.repository.IBaseRepository;

import java.util.List;

public interface ResourceRepository extends IBaseRepository<Resource, ResourceModelVo, ResourceDetails, ResourceQuery> {
    List<Tree<Long>> listAllResourceByUserId(Long userId);

    List<Tree<Long>> queryTreeList(ResourceQuery query);
}
