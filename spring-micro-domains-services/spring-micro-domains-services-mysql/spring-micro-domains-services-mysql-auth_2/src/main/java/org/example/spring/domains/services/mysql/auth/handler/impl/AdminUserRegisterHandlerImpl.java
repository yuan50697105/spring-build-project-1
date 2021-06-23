package org.example.spring.domains.services.mysql.auth.handler.impl;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import org.example.spring.domains.services.mysql.auth.dto.RegisterResult;
import org.example.spring.domains.services.mysql.auth.handler.UserRegisterHandler;
import org.example.spring.domains.services.mysql.auth.vo.RegisterVo;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component(RegisterVo.RegisterType.Constants.ADMIN_USER_REGISTER_HANDLER)
@Transactional
public class AdminUserRegisterHandlerImpl extends AbstractUserRegisterHandlerImpl implements UserRegisterHandler {
    private final UserRepository userRepository;

    public AdminUserRegisterHandlerImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Result<RegisterResult> register(RegisterVo registerVo) {
        userRepository.save(registerVo.getUser());
        return R.success(new RegisterResult(registerVo.getUser().getUsername(), ""));
    }


}