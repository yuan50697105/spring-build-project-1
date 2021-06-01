package org.example.spring.repositories.oracle.auth.repository;

import org.example.spring.repositories.oracle.auth.table.dto.TUserTokenDto;
import org.example.spring.repositories.oracle.auth.table.po.TUserToken;
import org.example.spring.repositories.oracle.auth.table.query.TUserTokenQuery;
import org.example.spring.repositories.oracle.auth.table.vo.TUserTokenVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TUserTokenRepository extends IBaseRepository<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery> {
}
