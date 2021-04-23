package org.example.spring.models.clickhouse.auth.repository;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.models.clickhouse.auth.entity.query.ResourceQuery;
import org.example.spring.models.clickhouse.auth.entity.result.Resource;
import org.example.spring.models.clickhouse.auth.entity.result.ResourceDetails;
import org.example.spring.models.clickhouse.auth.entity.vo.ResourceModelVo;
import org.example.spring.models.commons.repository.IBaseRepository;

import java.util.List;

public interface ResourceRepository extends IBaseRepository<Resource, ResourceModelVo, ResourceDetails, ResourceQuery> {
    List<Tree<Long>> listAllResourceByUserId(Long userId);

    List<Tree<Long>> queryTreeList(ResourceQuery query);
}
