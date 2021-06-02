package org.example.spring.services.mysql.account.service;

import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.repositories.mysql.auth.table.vo.TUserVo;

import java.util.List;

public interface AccountService {
    void save(TUserVo vo);

    void update(TUserVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    void updateStatus(UserStatus status, Long id);

    void updateStatus(UserStatus status, Long... ids);

    void updateStaus(UserStatus status, List<Long> ids);
}
