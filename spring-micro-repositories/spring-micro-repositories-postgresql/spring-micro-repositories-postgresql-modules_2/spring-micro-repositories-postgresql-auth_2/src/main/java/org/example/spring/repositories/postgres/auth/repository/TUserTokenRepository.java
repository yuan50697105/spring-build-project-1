package org.example.spring.repositories.postgres.auth.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.postgres.auth.table.dto.TUserTokenDto;
import org.example.spring.repositories.postgres.auth.table.po.TUserToken;
import org.example.spring.repositories.postgres.auth.table.query.TUserTokenQuery;
import org.example.spring.repositories.postgres.auth.table.vo.TUserTokenVo;

public interface TUserTokenRepository extends IBaseRepository<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery> {
}
