package org.example.spring.repositories.clients.dubbo.auth.api;

import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.auth.dto.UserTokenDto;
import org.example.spring.repositories.commons.entity.auth.po.UserToken;
import org.example.spring.repositories.commons.entity.auth.query.UserTokenQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserTokenVo;

public interface UserTokenDubboRepository extends CommonsDubboRepository<UserToken, UserTokenVo, UserTokenDto, UserTokenQuery> {
}
