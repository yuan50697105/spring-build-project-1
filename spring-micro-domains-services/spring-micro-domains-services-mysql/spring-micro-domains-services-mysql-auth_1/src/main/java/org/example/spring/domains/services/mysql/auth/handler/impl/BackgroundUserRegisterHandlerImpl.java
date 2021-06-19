package org.example.spring.domains.services.mysql.auth.handler.impl;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import org.example.spring.domains.services.mysql.auth.dto.RegisterResult;
import org.example.spring.domains.services.mysql.auth.handler.UserRegisterHandler;
import org.example.spring.domains.services.mysql.auth.vo.RegisterVo;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ValidationException;

@Component(RegisterVo.BACKGROUND_USER_HANDLER)
@Transactional
public class BackgroundUserRegisterHandlerImpl implements UserRegisterHandler {
    private final UserRepository userRepository;

    public BackgroundUserRegisterHandlerImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Result<RegisterResult> register(RegisterVo registerVo) {
        userRepository.save(registerVo.getUser());
        return R.success(new RegisterResult(registerVo.getUser().getUsername(), ""));
    }

    @Override
    public void verifyAccount(RegisterVo registerVo) throws ValidationException {

    }

}