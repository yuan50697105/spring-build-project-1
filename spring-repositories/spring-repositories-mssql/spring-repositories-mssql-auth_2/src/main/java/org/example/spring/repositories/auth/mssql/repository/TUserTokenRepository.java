package org.example.spring.repositories.auth.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.auth.mssql.table.dto.TUserTokenDto;
import org.example.spring.repositories.auth.mssql.table.po.TUserToken;
import org.example.spring.repositories.auth.mssql.table.query.TUserTokenQuery;
import org.example.spring.repositories.auth.mssql.table.vo.TUserTokenVo;

@Deprecated
public interface TUserTokenRepository extends IBaseRepository<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery> {
}
