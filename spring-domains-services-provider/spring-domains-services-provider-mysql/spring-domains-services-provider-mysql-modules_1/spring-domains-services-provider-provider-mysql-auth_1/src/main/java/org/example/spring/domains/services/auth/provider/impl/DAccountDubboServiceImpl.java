package org.example.spring.domains.services.auth.provider.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.domains.services.auth.mysql.handler.UserRegisterHandlerFactory;
import org.example.spring.domains.services.auth.mysql.service.impl.DAccountServiceImpl;
import org.example.spring.domains.services.auth.provider.DAccountDubboService;
import org.springframework.stereotype.Service;

@Service
@DubboService(interfaceClass = DAccountDubboService.class)
public class DAccountDubboServiceImpl extends DAccountServiceImpl implements DAccountDubboService {
    public DAccountDubboServiceImpl(UserRegisterHandlerFactory userRegisterHandlerFactory) {
        super(userRegisterHandlerFactory);
    }
}