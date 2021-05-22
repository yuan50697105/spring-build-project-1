package org.example.spring.domains.service.mysql.auth;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.models.mysql.auth.entity.query.DResourceQuery;
import org.example.spring.models.mysql.auth.entity.result.DResourceDTO;
import org.example.spring.models.mysql.auth.entity.vo.DResourceVo;

import java.util.List;

public interface DResourceService {
    List<Tree<Long>> listResourceByUserId(Long id);

    List<Tree<Long>> selectTreeList(DResourceQuery query);

    DResourceDTO get(Long id);

    void save(DResourceVo formVo);

    void update(DResourceVo formVo);

    void delete(List<Long> ids);
}
