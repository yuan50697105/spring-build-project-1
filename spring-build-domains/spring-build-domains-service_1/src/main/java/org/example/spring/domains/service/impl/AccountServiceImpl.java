package org.example.spring.domains.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.service.AccountService;
import org.example.spring.infrastructures.mysql.auth.entity.query.AccountQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Account;
import org.example.spring.infrastructures.mysql.auth.entity.result.AccountDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.AccountFormVo;
import org.example.spring.infrastructures.mysql.auth.repository.AccountRepository;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public IPageData<Account> queryPage(AccountQuery query) {
        return accountRepository.queryPage(query);
    }

    @Override
    public List<Account> queryList(AccountQuery query) {
        return accountRepository.queryList(query);
    }

    @Override
    public List<Account> queryTop(AccountQuery query) {
        return accountRepository.queryTop(query, query.getSize());
    }

    @Override
    public Account queryFirst(AccountQuery query) {
        return accountRepository.queryFirst(query);
    }

    @Override
    public Account queryOne(AccountQuery query) {
        return accountRepository.queryOne(query);
    }

    @Override
    public AccountDetails get(Long id) {
        return accountRepository.getById(id);
    }

    @Override
    public void save(AccountFormVo formVo) {
        accountRepository.save(formVo);
    }

    @Override
    public void update(AccountFormVo formVo) {
        accountRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        accountRepository.delete(ids);
    }
}