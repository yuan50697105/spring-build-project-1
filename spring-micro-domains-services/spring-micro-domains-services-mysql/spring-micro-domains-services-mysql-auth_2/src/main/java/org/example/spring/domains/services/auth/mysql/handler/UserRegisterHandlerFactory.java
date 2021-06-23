package org.example.spring.domains.services.auth.mysql.handler;

import ai.yue.library.base.exception.ResultException;
import ai.yue.library.base.view.Result;
import org.example.spring.domains.services.auth.mysql.dto.RegisterResult;
import org.example.spring.domains.services.auth.mysql.vo.RegisterVo;

public interface UserRegisterHandlerFactory  extends UserRegisterHandler{
    Result<RegisterResult> register(RegisterVo registerVo);

    void verifyAccount(RegisterVo registerVo) throws ResultException;
}
