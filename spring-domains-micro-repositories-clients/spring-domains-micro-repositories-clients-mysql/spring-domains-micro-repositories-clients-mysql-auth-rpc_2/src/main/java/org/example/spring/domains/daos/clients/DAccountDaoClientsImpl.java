package org.example.spring.domains.daos.clients;


import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.auth.UserClientsImpl;
import org.example.spring.auth.converter.UserClientsConverter;
import org.example.spring.damains.daos.clients.auth.api.DAccountDaoClients;
import org.example.spring.repositories.mysql.auth.repository.TUserRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

@DubboService(interfaceClass = DAccountDaoClients.class)
@RestController
@Primary
@GlobalTransactional
public class DAccountDaoClientsImpl extends UserClientsImpl implements DAccountDaoClients {
    public DAccountDaoClientsImpl(TUserRepository userRepository, UserClientsConverter userClientsConverter) {
        super(userRepository, userClientsConverter);
    }
}