package org.example.spring.domains.services.auth.mysql.handler.impl;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import org.example.spring.domains.services.auth.mysql.dto.RegisterResult;
import org.example.spring.domains.services.auth.mysql.event.entity.AdminUserRegistrationEvent;
import org.example.spring.domains.services.auth.mysql.handler.UserRegisterHandler;
import org.example.spring.domains.services.auth.mysql.vo.RegisterVo;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component(RegisterVo.RegisterType.Constants.SELL_USER_REGISTER_HANDLER)
@Transactional
public class SellUserRegisterHandlerImpl extends AbstractUserRegisterHandlerImpl implements UserRegisterHandler {
    private final UserRepository userRepository;
    private final ApplicationContext applicationContext;

    public SellUserRegisterHandlerImpl(UserRepository userRepository, ApplicationContext applicationContext) {
        this.userRepository = userRepository;
        this.applicationContext = applicationContext;
    }

    @Override
    public Result<RegisterResult> register(RegisterVo registerVo) {
        UserVo user = registerVo.getUser();
        userRepository.save(user);
        registerVo.setUser(user);
        applicationContext.publishEvent(new AdminUserRegistrationEvent(registerVo));
        return R.success(new RegisterResult(registerVo.getUser().getUsername(), ""));
    }


}