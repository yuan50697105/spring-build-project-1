package org.example.spring.domains.services.auth.mysql.handler.impl;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import org.example.spring.domains.services.auth.mysql.dto.RegisterResult;
import org.example.spring.domains.services.auth.mysql.handler.UserRegisterHandler;
import org.example.spring.domains.services.auth.mysql.vo.RegisterVo;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component(RegisterVo.RegisterType.Constants.SELL_USER_REGISTER_HANDLER)
@Transactional
public class SellUserRegisterHandlerImpl extends AbstractUserRegisterHandlerImpl implements UserRegisterHandler {
    private final UserRepository userRepository;

    public SellUserRegisterHandlerImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Result<RegisterResult> register(RegisterVo registerVo) {
        userRepository.save(registerVo.getUser());
        return R.success(new RegisterResult(registerVo.getUser().getUsername(), ""));
    }


}