package org.example.spring.models.mysql.auth.client;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.client.ITUserRepositoryClientImpl;
import org.example.spring.daos.mysql.auth.converter.TUserClientConverter;
import org.example.spring.daos.mysql.auth.dao.TUserDao;
import org.example.spring.daos.mysql.auth.repository.TUserRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService(interfaceClass = IDAccountClient.class)
public class DAccountClientImpl extends ITUserRepositoryClientImpl implements IDAccountClient {
    private final TUserDao userDao;
    private final TUserRepository userRepository;
    private final TUserClientConverter converter;

    public DAccountClientImpl(TUserDao userDao, TUserRepository userRepository, TUserClientConverter converter) {
        super(userDao, userRepository, converter);
        this.userDao = userDao;
        this.userRepository = userRepository;
        this.converter = converter;
    }
}