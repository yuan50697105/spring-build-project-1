package org.example.spring.daos.mssql.auth.repository;

import org.example.spring.daos.mssql.auth.table.dto.TResourceDto;
import org.example.spring.daos.mssql.auth.table.po.TResource;
import org.example.spring.daos.mssql.auth.table.query.TResourceQuery;
import org.example.spring.daos.mssql.auth.table.vo.TResourceVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TResourceRepository extends IBaseRepository<TResource, TResourceDto, TResourceVo, TResourceQuery> {
}
