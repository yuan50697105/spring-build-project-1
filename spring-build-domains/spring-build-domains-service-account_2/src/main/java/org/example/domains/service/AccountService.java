package org.example.domains.service;

import org.example.modules.repository.mysql.entity.vo.AccountFormVo;

public interface AccountService {
    void save(AccountFormVo accountFormVo);
}
