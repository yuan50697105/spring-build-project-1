package org.example.spring.domains.auth.service;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.infrastructures.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.ResourceDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.ResourceFormVo;

import java.util.List;

public interface ResourceService {
    List<Tree<Long>> listResourceByUserId(Long id);

    List<Tree<Long>> selectTreeList(ResourceQuery query);

    ResourceDetails get(Long id);

    void save(ResourceFormVo formVo);

    void update(ResourceFormVo formVo);

    void delete(List<Long> ids);
}
