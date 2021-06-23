package org.example.spring.domains.services.auth.mysql.handler.impl;

import ai.yue.library.base.exception.ResultException;
import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import org.example.spring.domains.services.auth.mysql.dto.RegisterResult;
import org.example.spring.domains.services.auth.mysql.handler.UserRegisterHandler;
import org.example.spring.domains.services.auth.mysql.handler.UserRegisterHandlerFactory;
import org.example.spring.domains.services.auth.mysql.vo.RegisterVo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component(UserRegisterHandlerFactoryImpl.USER_REGISTER_HANDLER_FACTORY)
@Primary
public class UserRegisterHandlerFactoryImpl extends AbstractUserRegisterHandlerImpl implements UserRegisterHandlerFactory {
    public static final String USER_REGISTER_HANDLER_FACTORY = "userRegisterHandlerFactory";
    private final Map<String, UserRegisterHandler> factory;

    public UserRegisterHandlerFactoryImpl(Map<String, UserRegisterHandler> factory) {
        this.factory = factory;
    }

    @Override
    public Result<RegisterResult> register(RegisterVo registerVo) {
        return factory.get(registerVo.getType().getType()).register(registerVo);
    }

    @Override
    public void verifyAccount(RegisterVo registerVo) throws ResultException {
        throw new ResultException(R.errorPrompt("not implemented interface"));
    }
}