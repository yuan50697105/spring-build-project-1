package org.example.spring.domains.services.mysql.auth.service;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.daos.mysql.auth.table.dto.TResourceDTO;
import org.example.spring.daos.mysql.auth.table.query.TResourceQuery;
import org.example.spring.daos.mysql.auth.table.vo.TResourceVo;

import java.util.List;

public interface DResourceService {
    List<Tree<Long>> listResourceByUserId(Long id);

    List<Tree<Long>> selectTreeList(TResourceQuery query);

    TResourceDTO get(Long id);

    void save(TResourceVo vo);

    void update(TResourceVo vo);

    void delete(List<Long> ids);

    void delete(Long... ids);

    void delete(Long id);
}
