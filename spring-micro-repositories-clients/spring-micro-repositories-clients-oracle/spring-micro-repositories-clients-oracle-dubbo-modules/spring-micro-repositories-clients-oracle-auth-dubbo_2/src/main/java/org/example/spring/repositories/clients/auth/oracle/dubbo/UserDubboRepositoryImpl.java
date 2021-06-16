package org.example.spring.repositories.clients.auth.oracle.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.clients.auth.oracle.api.UserRepositoryImpl;
import org.example.spring.repositories.clients.auth.oracle.converter.UserRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.UserDubboRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.oracle.auth.repository.TUserRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@DubboService
@Primary
public class UserDubboRepositoryImpl extends CommonsDubboRepositoryImpl<User, UserVo, UserDTO, UserQuery, UserRepository> implements UserDubboRepository {
    protected UserDubboRepositoryImpl(UserRepository repository) {
        super(repository);
    }
}