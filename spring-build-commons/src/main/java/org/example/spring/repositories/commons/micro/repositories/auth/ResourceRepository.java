package org.example.spring.repositories.commons.micro.repositories.auth;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Resource;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;
import org.example.spring.repositories.commons.micro.repositories.commons.CommonsRepository;

import java.util.List;

public interface ResourceRepository extends CommonsRepository<Resource, ResourceVo, ResourceDTO, ResourceQuery> {
    List<Tree<Long>> queryTreeByUserId(Long userId);

    List<Tree<Long>> queryTreeByRoleId(Long roleId);

    List<ResourceDTO> queryListByUserId(Long userId);

    List<ResourceDTO> queryListByRoleId(Long roleId);

    List<Tree<Long>> queryTree(ResourceQuery query);

}
