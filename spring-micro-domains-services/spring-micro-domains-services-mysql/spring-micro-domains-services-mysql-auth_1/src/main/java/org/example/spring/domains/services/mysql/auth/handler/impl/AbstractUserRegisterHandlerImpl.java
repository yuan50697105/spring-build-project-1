package org.example.spring.domains.services.mysql.auth.handler.impl;

import org.example.spring.domains.services.mysql.auth.handler.UserRegisterHandler;
import org.example.spring.domains.services.mysql.auth.vo.RegisterVo;

import javax.validation.ValidationException;

public abstract class AbstractUserRegisterHandlerImpl implements UserRegisterHandler {
    @Override
    public void verifyAccount(RegisterVo registerVo) throws ValidationException {

    }
}