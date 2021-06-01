package org.example.spring.daos.mysql.auth.repository;

import org.example.spring.daos.mysql.auth.table.dto.TUserTokenDto;
import org.example.spring.daos.mysql.auth.table.po.TUserToken;
import org.example.spring.daos.mysql.auth.table.query.TUserTokenQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserTokenVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TUserTokenRepository extends IBaseRepository<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery> {
}
