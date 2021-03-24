package org.example.domains.service;

import org.example.modules.repository.mysql.entity.vo.AccountVo;

public interface AccountService {
    void save(AccountVo accountVo);
}
