package org.example.spring.domains.postgresql.auth.service;

import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.models.postgresql.auth.entity.query.AccountQuery;
import org.example.spring.models.postgresql.auth.entity.result.Account;
import org.example.spring.models.postgresql.auth.entity.result.AccountDetails;
import org.example.spring.models.postgresql.auth.entity.vo.AccountModelVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface AccountService {
    IPageData<Account> queryPage(AccountQuery query);

    List<Account> queryList(AccountQuery query);

    Account queryOne(AccountQuery query);

    AccountDetails get(Long id);

    void save(AccountModelVo formVo);

    void update(AccountModelVo formVo);

    void delete(List<Long> ids);

    void updateStatusByITs(TUserStatus status, List<Long> ids);
}
