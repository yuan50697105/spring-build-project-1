package org.example.spring.domains.services.postgres.auth.service;


import cn.hutool.core.lang.tree.Tree;
import org.example.spring.repositories.commons.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.auth.vo.ResourceVo;

import java.util.List;

public interface DResourceService {
    List<Tree<Long>> queryTreeByUserId(Long id);

    List<Tree<Long>> selectTreeList(ResourceQuery query);

    ResourceDTO get(Long id);

    void save(ResourceVo vo);

    void update(ResourceVo vo);

    void delete(List<Long> ids);

    void delete(Long... ids);

    void delete(Long id);
}
