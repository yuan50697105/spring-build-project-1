package org.example.spring.domains.auth.service;

import org.example.spring.models.auth.entity.query.AccountQuery;
import org.example.spring.models.auth.entity.result.Account;
import org.example.spring.models.auth.entity.result.AccountDetails;
import org.example.spring.models.auth.entity.vo.AccountModelVo;
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
}
