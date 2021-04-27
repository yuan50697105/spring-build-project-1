package org.example.spring.domains.auth.service;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.models.auth.entity.query.ResourceQuery;
import org.example.spring.models.auth.entity.result.ResourceDetails;
import org.example.spring.models.auth.entity.vo.ResourceModelVo;

import java.util.List;

public interface ResourceService {
    List<Tree<Long>> listResourceByUserId(Long id);

    List<Tree<Long>> selectTreeList(ResourceQuery query);

    ResourceDetails get(Long id);

    void save(ResourceModelVo formVo);

    void update(ResourceModelVo formVo);

    void delete(List<Long> ids);
}
