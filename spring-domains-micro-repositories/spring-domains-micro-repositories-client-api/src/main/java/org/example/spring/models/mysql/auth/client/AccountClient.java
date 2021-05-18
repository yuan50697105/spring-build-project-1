package org.example.spring.models.mysql.auth.client;

import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.models.mysql.auth.client.entity.*;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface AccountClient {
    String ACCOUNT = "account";

    void save(AccountAddVo accountAddVo);

    void update(AccountUpdateVo accountUpdateVo);

    void updateStatus(TUserStatus status, List<Long> ids);

    void updateStatus(TUserStatus status, Long... ids);

    void delete(List<Long> ids);

    void delete(Long... ids);

    AccountDetailDto get(Long id);

    AccountDto get(AccountQueryVo queryDto);

    List<AccountDto> list(AccountQueryVo queryVo);

    IPageData<AccountDto> data(AccountQueryVo queryVo);
}
