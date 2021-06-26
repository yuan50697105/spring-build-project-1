package org.example.spring.domains.services.postgres.auth.service;


import cn.hutool.core.lang.tree.Tree;
import org.example.spring.domains.services.DService;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Resource;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;

import java.util.List;

public interface DResourceService extends DService<Resource, ResourceVo, ResourceDTO, ResourceQuery> {
    List<Tree<Long>> queryTreeByUserId(Long id);

    List<Tree<Long>> selectTreeByUserId(Long id);

    List<Tree<Long>> selectTreeList(ResourceQuery query);

    List<Tree<Long>> queryTreeList(ResourceQuery query);

}
