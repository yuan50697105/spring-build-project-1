package org.example.spring.repositories.clients.dubbo.auth.api;


import cn.hutool.core.lang.tree.Tree;
import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Resource;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;

import java.util.List;

public interface ResourceDubboRepository extends CommonsDubboRepository<Resource, ResourceVo, ResourceDTO, ResourceQuery> {
    List<Tree<Long>> queryTreeByUserId(Long id);

    List<Tree<Long>> queryTreeList(ResourceQuery query);
}
