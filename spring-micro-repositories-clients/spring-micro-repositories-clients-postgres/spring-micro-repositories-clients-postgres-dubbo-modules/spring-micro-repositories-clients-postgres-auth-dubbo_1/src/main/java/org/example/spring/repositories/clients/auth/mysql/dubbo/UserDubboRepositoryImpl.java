package org.example.spring.repositories.clients.auth.mysql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.clients.dubbo.auth.api.UserDubboRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class UserDubboRepositoryImpl extends CommonsDubboRepositoryImpl<User, UserVo, UserDTO, UserQuery, UserRepository> implements UserDubboRepository {
    protected UserDubboRepositoryImpl(UserRepository repository) {
        super(repository);
    }
}