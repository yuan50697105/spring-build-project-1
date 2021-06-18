package org.example.spring.repositories.clients.auth.api;


import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.auth.dto.UserTokenDto;
import org.example.spring.repositories.commons.entity.auth.po.UserToken;
import org.example.spring.repositories.commons.entity.auth.query.UserTokenQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserTokenVo;

public interface UserTokenRepository extends CommonsRepository<UserToken, UserTokenVo, UserTokenDto, UserTokenQuery> {
}
