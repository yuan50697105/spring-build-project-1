package org.example.spring.daos.mysql.auth.repository;

import org.example.spring.daos.mysql.auth.table.dto.TResourceDTO;
import org.example.spring.daos.mysql.auth.table.po.TResource;
import org.example.spring.daos.mysql.auth.table.query.TResourceQuery;
import org.example.spring.daos.mysql.auth.table.vo.TResourceVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TResource2Repository extends IBaseRepository<TResource, TResourceDTO, TResourceVo, TResourceQuery> {
}
