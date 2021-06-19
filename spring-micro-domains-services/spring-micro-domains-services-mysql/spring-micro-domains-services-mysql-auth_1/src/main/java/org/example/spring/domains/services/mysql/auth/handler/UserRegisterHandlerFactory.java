package org.example.spring.domains.services.mysql.auth.handler;

import ai.yue.library.base.view.Result;
import org.example.spring.domains.services.mysql.auth.dto.RegisterResult;
import org.example.spring.domains.services.mysql.auth.vo.RegisterVo;

public interface UserRegisterHandlerFactory {
    Result<RegisterResult> register(RegisterVo registerVo);
}
