package org.example.spring.domains.auth.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.auth.service.AccountService;
import org.example.spring.models.auth.entity.query.AccountQuery;
import org.example.spring.models.auth.entity.result.Account;
import org.example.spring.models.auth.entity.result.AccountDetails;
import org.example.spring.models.auth.entity.vo.AccountModelVo;
import org.example.spring.models.auth.repository.AccountRepository;
import org.example.spring.plugins.commons.entity.IPageData;
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
    public Account queryOne(AccountQuery query) {
        return accountRepository.queryFirst(query);
    }

    @Override
    public AccountDetails get(Long id) {
        return accountRepository.getDetailsById(id);
    }

    @Override
    public void save(AccountModelVo formVo) {
        accountRepository.save(formVo);
    }

    @Override
    public void update(AccountModelVo formVo) {
        accountRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        accountRepository.delete(ids);
    }
}