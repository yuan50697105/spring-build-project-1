package org.example.domains.service;

import org.example.modules.repository.mysql.entity.query.AccountQuery;
import org.example.modules.repository.mysql.entity.result.AccountDetails;
import org.example.modules.repository.mysql.entity.result.Account;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.example.plugins.mybatis.entity.IPageData;

import java.util.List;

public interface AccountService {
    void save(AccountFormVo accountFormVo);

    void update(Long id, AccountFormVo formVo);

    void update(AccountFormVo formVo);

    void delete(List<Long> ids);

    void updateEnabled(List<Long> ids);

    void updateDisable(List<Long> singletonList);

    AccountDetails get(Long id);

    IPageData<Account> page(AccountQuery query);
}
