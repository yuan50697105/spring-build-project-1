package org.example.spring.domains.services.auth.mysql.handler.impl;

import org.example.spring.domains.services.auth.mysql.handler.UserRegisterHandler;
import org.example.spring.domains.services.auth.mysql.vo.RegisterVo;

import javax.validation.ValidationException;

public abstract class AbstractUserRegisterHandlerImpl implements UserRegisterHandler {
    @Override
    public void verifyAccount(RegisterVo registerVo) throws ValidationException {

    }
}