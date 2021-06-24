package org.example.spring.services.mysql.account.service;

import org.example.spring.repositories.auth.mysql.table.vo.TUserVo;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.commons.enumerate.UserStatus;

import java.util.List;

public interface AccountService {
    void save(UserVo vo);

    void update(UserVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    void updateStatus(UserStatus status, Long id);

    void updateStatus(UserStatus status, Long... ids);

    void updateStatus(UserStatus status, List<Long> ids);
}
