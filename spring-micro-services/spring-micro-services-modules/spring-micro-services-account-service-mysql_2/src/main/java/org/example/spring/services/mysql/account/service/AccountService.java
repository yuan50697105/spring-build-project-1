package org.example.spring.services.mysql.account.service;

import org.example.spring.daos.mysql.auth.table.vo.TUserVo;

public interface AccountService {
    void save(TUserVo vo);

    void delete(Long id);
}
