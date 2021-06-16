package org.example.spring.repositories.clients.auth.mysql.feign;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.feign.auth.clients.UserRepositoryClient;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class UserRepositoryController extends CommonsFeignClientImpl<User, UserVo, UserDTO, UserQuery, UserRepository> implements UserRepositoryClient {
    public UserRepositoryController(UserRepository repository) {
        super(repository);
    }
}