package org.example.domains.service;

import org.example.modules.repository.mysql.entity.vo.TAccountVo;

public interface AccountService {
    void save(TAccountVo accountVo);
}
