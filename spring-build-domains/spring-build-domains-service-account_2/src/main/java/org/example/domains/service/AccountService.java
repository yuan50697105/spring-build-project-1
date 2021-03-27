package org.example.domains.service;

import org.example.modules.repository.mysql.entity.query.AccountQuery;
import org.example.modules.repository.mysql.entity.result.AccountDetailResult;
import org.example.modules.repository.mysql.entity.result.AccountResult;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.example.plugins.mybatis.entity.IPageData;

public interface AccountService {
    void save(AccountFormVo accountFormVo);

    void update(Long id, AccountFormVo formVo);

    void update(AccountFormVo formVo);

    AccountDetailResult get(Long id);

    IPageData<AccountResult> page(AccountQuery query);
}
