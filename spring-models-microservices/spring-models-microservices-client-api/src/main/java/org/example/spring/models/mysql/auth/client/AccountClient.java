package org.example.spring.models.mysql.auth.client;

import org.example.spring.models.commons.enumerate.UserStatus;
import org.example.spring.models.mysql.auth.client.entity.AccountAddVo;
import org.example.spring.models.mysql.auth.client.entity.AccountDetailDto;
import org.example.spring.models.mysql.auth.client.entity.AccountUpdateVo;

import java.util.List;

public interface AccountClient {
    String ACCOUNT = "account";

    void save(AccountAddVo accountAddVo);

    void update(AccountUpdateVo accountUpdateVo);

    void updateStatus(UserStatus status, List<Long> ids);

    void updateStatus(UserStatus status, Long... ids);

    void delete(List<Long> ids);

    void delete(Long... ids);

    AccountDetailDto get(Long id);
}
