package org.example.spring.domains.mysql.auth.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.domains.mysql.auth.service.AccountService;
import org.example.spring.models.mysql.auth.entity.query.AccountQuery;
import org.example.spring.models.mysql.auth.entity.result.Account;
import org.example.spring.models.mysql.auth.entity.result.AccountDetails;
import org.example.spring.models.mysql.auth.entity.vo.AccountModelVo;
import org.example.spring.models.mysql.auth.repository.AccountRepository;
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
        return accountRepository.queryTop(query, query.getSize());
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

    @Override
    public void updateStatusByIds(TUserStatus status, List<Long> ids) {
        accountRepository.updateStatusByIds(status, ids);
    }
}