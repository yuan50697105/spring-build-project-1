package org.example.spring.repositories.feign.auth.clients;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Resource;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("resource/repository/client")
public interface ResourceRepositoryClient extends CommonsFeignClient<Resource, ResourceVo, ResourceDTO, ResourceQuery> {
    @GetMapping("query/tree/by/user/id/{id}")
    List<Tree<Long>> queryTreeByUserId(@PathVariable Long id);

    @GetMapping("query/tree/list")
    List<Tree<Long>> queryTreeList(ResourceQuery query);
}
    
