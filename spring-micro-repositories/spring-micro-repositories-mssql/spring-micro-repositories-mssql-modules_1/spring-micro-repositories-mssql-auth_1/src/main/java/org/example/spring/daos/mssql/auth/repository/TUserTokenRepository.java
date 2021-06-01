package org.example.spring.daos.mssql.auth.repository;

import org.example.spring.daos.mssql.auth.table.dto.TUserTokenDto;
import org.example.spring.daos.mssql.auth.table.po.TUserToken;
import org.example.spring.daos.mssql.auth.table.query.TUserTokenQuery;
import org.example.spring.daos.mssql.auth.table.vo.TUserTokenVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TUserTokenRepository extends IBaseRepository<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery> {
}
