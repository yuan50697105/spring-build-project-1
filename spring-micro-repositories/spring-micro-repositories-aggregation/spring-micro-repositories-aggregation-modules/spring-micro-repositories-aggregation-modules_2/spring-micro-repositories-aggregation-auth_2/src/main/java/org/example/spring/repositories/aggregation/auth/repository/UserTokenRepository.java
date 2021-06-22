package org.example.spring.repositories.aggregation.auth.repository;

import org.example.spring.plugins.mybatis.repository.ICommonsRepository;
import org.example.spring.repositories.commons.entity.auth.dto.UserTokenDto;
import org.example.spring.repositories.commons.entity.auth.po.UserToken;
import org.example.spring.repositories.commons.entity.auth.query.UserTokenQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserTokenVo;

public interface UserTokenRepository extends ICommonsRepository<UserToken, UserTokenDto, UserTokenVo, UserTokenQuery> {
}
