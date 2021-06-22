package org.example.spring.repositories.auth.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.auth.table.dto.TUserTokenDto;
import org.example.spring.repositories.auth.table.po.TUserToken;
import org.example.spring.repositories.auth.table.query.TUserTokenQuery;
import org.example.spring.repositories.auth.table.vo.TUserTokenVo;
@Deprecated
public interface TUserTokenRepository extends IBaseRepository<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery> {
}
