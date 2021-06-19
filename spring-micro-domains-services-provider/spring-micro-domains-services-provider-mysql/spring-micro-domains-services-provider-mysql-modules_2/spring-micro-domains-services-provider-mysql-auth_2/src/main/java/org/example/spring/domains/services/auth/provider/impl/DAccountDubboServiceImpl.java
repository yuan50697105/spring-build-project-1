package org.example.spring.domains.services.auth.provider.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.domains.services.auth.provider.DAccountDubboService;
import org.example.spring.domains.services.mysql.auth.handler.UserRegisterHandlerFactory;
import org.example.spring.domains.services.mysql.auth.service.impl.DAccountServiceImpl;
import org.springframework.stereotype.Service;

@Service
@DubboService(interfaceClass = DAccountDubboService.class)
public class DAccountDubboServiceImpl extends DAccountServiceImpl implements DAccountDubboService {
    public DAccountDubboServiceImpl(UserRegisterHandlerFactory userRegisterHandlerFactory) {
        super(userRegisterHandlerFactory);
    }
}