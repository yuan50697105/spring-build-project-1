package org.example.spring.domains.service;

import org.example.spring.infrastructures.mysql.auth.entity.query.AccountQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Account;
import org.example.spring.plugins.mybatis.entity.IPageData;

public interface AccountService {
    IPageData<Account> selectPage(AccountQuery query);
}
