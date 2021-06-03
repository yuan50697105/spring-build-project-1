package org.example.spring.repositories.clients.auth.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.auth.dto.UserTokenDto;
import org.example.spring.repositories.commons.auth.po.UserToken;
import org.example.spring.repositories.commons.auth.query.UserTokenQuery;
import org.example.spring.repositories.commons.auth.vo.UserTokenVo;

public interface UserTokenRepository extends CommonsRepository<UserToken, UserTokenVo, UserTokenDto, UserTokenQuery> {
}
