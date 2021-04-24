package org.example.spring.domains.mysql.auth.service;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.models.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.models.mysql.auth.entity.result.ResourceDetails;
import org.example.spring.models.mysql.auth.entity.vo.ResourceModelVo;

import java.util.List;

public interface ResourceService {
    List<Tree<Long>> listResourceByUserId(Long id);

    List<Tree<Long>> selectTreeList(ResourceQuery query);

    ResourceDetails get(Long id);

    void save(ResourceModelVo formVo);

    void update(ResourceModelVo formVo);

    void delete(List<Long> ids);
}
