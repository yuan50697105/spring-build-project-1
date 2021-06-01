package org.example.spring.services.mysql.account.service;

import org.example.spring.repositories.mysql.auth.table.vo.TUserVo;
import org.example.spring.repositories.mysql.table.enumerate.TUserStatus;

import java.util.List;

public interface AccountService {
    void save(TUserVo vo);

    void update(TUserVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    void updateStatus(TUserStatus status, Long id);
}
