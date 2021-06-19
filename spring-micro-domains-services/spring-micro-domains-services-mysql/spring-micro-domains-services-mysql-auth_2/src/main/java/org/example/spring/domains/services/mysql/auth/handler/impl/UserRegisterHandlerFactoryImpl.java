package org.example.spring.domains.services.mysql.auth.handler.impl;

import ai.yue.library.base.view.Result;
import org.example.spring.domains.services.mysql.auth.dto.RegisterResult;
import org.example.spring.domains.services.mysql.auth.handler.UserRegisterHandler;
import org.example.spring.domains.services.mysql.auth.handler.UserRegisterHandlerFactory;
import org.example.spring.domains.services.mysql.auth.vo.RegisterVo;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component(UserRegisterHandlerFactoryImpl.USER_REGISTER_HANDLER_FACTORY)
public class UserRegisterHandlerFactoryImpl implements UserRegisterHandlerFactory {
    public static final String USER_REGISTER_HANDLER_FACTORY = "userRegisterHandlerFactory";
    private final Map<String, UserRegisterHandler> factory;

    public UserRegisterHandlerFactoryImpl(Map<String, UserRegisterHandler> factory) {
        this.factory = factory;
    }

    @Override
    public Result<RegisterResult> register(RegisterVo registerVo) {
        return factory.get(registerVo.getType().getType()).register(registerVo);
    }
}