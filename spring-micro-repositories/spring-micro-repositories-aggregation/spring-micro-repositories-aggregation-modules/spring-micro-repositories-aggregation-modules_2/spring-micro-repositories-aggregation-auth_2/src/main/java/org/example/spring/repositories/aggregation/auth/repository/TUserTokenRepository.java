package org.example.spring.repositories.aggregation.auth.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.aggregation.auth.table.dto.TUserTokenDto;
import org.example.spring.repositories.aggregation.auth.table.po.TUserToken;
import org.example.spring.repositories.aggregation.auth.table.query.TUserTokenQuery;
import org.example.spring.repositories.aggregation.auth.table.vo.TUserTokenVo;
@Deprecated
public interface TUserTokenRepository extends IBaseRepository<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery> {
}
