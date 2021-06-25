package org.example.spring.repositories.feign.auth.clients;

import org.example.spring.repositories.commons.entity.auth.dto.UserTokenDto;
import org.example.spring.repositories.commons.entity.auth.po.UserToken;
import org.example.spring.repositories.commons.entity.auth.query.UserTokenQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserTokenVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("user/token/repository/client")
public interface UserTokenRepositoryClient extends CommonsFeignClient<UserToken, UserTokenVo, UserTokenDto, UserTokenQuery> {
}
