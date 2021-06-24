package org.example.spring.repositories.auth.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.auth.mysql.table.dto.TUserTokenDto;
import org.example.spring.repositories.auth.mysql.table.po.TUserToken;
import org.example.spring.repositories.auth.mysql.table.query.TUserTokenQuery;
import org.example.spring.repositories.auth.mysql.table.vo.TUserTokenVo;

@Deprecated
public interface TUserTokenRepository extends IBaseRepository<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery> {
}
