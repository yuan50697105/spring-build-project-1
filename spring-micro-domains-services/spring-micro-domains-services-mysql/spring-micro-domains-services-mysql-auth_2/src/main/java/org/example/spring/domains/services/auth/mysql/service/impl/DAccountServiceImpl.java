package org.example.spring.domains.services.auth.mysql.service.impl;


import ai.yue.library.base.exception.ResultException;
import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.services.auth.mysql.dto.RegisterResult;
import org.example.spring.domains.services.auth.mysql.handler.UserRegisterHandler;
import org.example.spring.domains.services.auth.mysql.service.DAccountService;
import org.example.spring.domains.services.auth.mysql.vo.RegisterVo;
import org.example.spring.domains.services.impl.DServiceImpl;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
public class DAccountServiceImpl extends DServiceImpl<User, UserVo, UserDTO, UserQuery, UserRepository> implements DAccountService {
    private final UserRegisterHandler userRegisterHandler;

    @Override
    public UserRoleDTO getWithRole(Long id) {
        return repository.getWithRole(id);
    }

    @Override
    public UserRoleResourceDTO getWithRoleResource(Long id) {
        return repository.getWithRoleResource(id);
    }

    @Override
    public void updateStatus(UserStatus status, List<Long> ids) {
        ids.stream().map(id -> {
            UserVo userVo = new UserVo();
            userVo.setId(id);
            userVo.setStatus(status.getValue());
            return userVo;
        }).forEach(repository::update);
    }

    @Override
    public void updateStatus(UserStatus status, Long... ids) {
        updateStatus(status, Arrays.asList(ids));
    }

    @Override
    public void updateStatus(UserStatus status, Long id) {
        updateStatus(status, Collections.singletonList(id));
    }

    @Override
    public Result<RegisterResult> register(RegisterVo registerVo) {
        return userRegisterHandler.register(registerVo);
    }

    @Override
    public Result<?> verifyAccountExists(RegisterVo registerVo) throws ResultException {
        userRegisterHandler.verifyAccount(registerVo);
        return R.success();
    }
}
