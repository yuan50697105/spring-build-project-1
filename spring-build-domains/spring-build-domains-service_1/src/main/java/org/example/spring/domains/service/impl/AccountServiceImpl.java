package org.example.spring.domains.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.service.AccountService;
import org.example.spring.infrastructures.mysql.auth.entity.query.AccountQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Account;
import org.example.spring.infrastructures.mysql.auth.repository.AccountRepository;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public IPageData<Account> selectPage(AccountQuery query) {
        return accountRepository.queryPage(query);
    }
}