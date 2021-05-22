package org.example.spring.daos.mysql.auth.repository;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.daos.mysql.auth.table.dto.TResourceDTO;
import org.example.spring.daos.mysql.auth.table.po.TResource;
import org.example.spring.daos.mysql.auth.table.query.TResourceQuery;
import org.example.spring.daos.mysql.auth.table.vo.TResourceVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

import java.util.List;

public interface TResource2Repository extends IBaseRepository<TResource, TResourceDTO, TResourceVo, TResourceQuery> {
    List<TResourceDTO> queryListByRoleId(Long id);

    List<Tree<Long>> queryListByUserId(Long id);
}
