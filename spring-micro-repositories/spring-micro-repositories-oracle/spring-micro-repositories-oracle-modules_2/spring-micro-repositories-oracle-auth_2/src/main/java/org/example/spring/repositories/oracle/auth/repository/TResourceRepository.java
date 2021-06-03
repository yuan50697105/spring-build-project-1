package org.example.spring.repositories.oracle.auth.repository;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.oracle.auth.table.dto.TResourceDTO;
import org.example.spring.repositories.oracle.auth.table.po.TResource;
import org.example.spring.repositories.oracle.auth.table.query.TResourceQuery;
import org.example.spring.repositories.oracle.auth.table.vo.TResourceVo;

import java.util.List;

public interface TResourceRepository extends IBaseRepository<TResource, TResourceDTO, TResourceVo, TResourceQuery> {
    List<TResourceDTO> queryListByRoleId(Long id);

    List<Tree<Long>> queryTreeByRoleId(Long roleId);

    List<Tree<Long>> queryTreeByUserId(Long id);
}
