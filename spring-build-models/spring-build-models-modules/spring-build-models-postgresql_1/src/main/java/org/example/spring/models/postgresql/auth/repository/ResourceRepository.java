package org.example.spring.models.postgresql.auth.repository;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.models.commons.repository.IBaseRepository;
import org.example.spring.models.postgresql.auth.entity.query.ResourceQuery;
import org.example.spring.models.postgresql.auth.entity.result.Resource;
import org.example.spring.models.postgresql.auth.entity.result.ResourceDetails;
import org.example.spring.models.postgresql.auth.entity.vo.ResourceModelVo;

import java.util.List;

public interface ResourceRepository extends IBaseRepository<Resource, ResourceModelVo, ResourceDetails, ResourceQuery> {
    List<Tree<Long>> listAllResourceByUserId(Long userId);

    List<Tree<Long>> queryTreeList(ResourceQuery query);
}
