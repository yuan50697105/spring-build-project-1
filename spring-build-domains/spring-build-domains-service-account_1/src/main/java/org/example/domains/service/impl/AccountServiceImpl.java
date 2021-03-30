package org.example.domains.service.impl;

import org.example.domains.service.AccountService;
import org.example.modules.repository.mysql.entity.query.AccountQuery;
import org.example.modules.repository.mysql.entity.result.AccountDetails;
import org.example.modules.repository.mysql.entity.result.Account;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.example.modules.repository.mysql.repository.AccountRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void save(AccountFormVo accountFormVo) {
        accountRepository.save(accountFormVo);
    }

    @Override
    public void update(Long id, AccountFormVo formVo) {
        formVo.setId(id);
        accountRepository.update(formVo);
    }

    @Override
    public void update(AccountFormVo formVo) {
        accountRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        accountRepository.delete(ids);
    }

    @Override
    public AccountDetails get(Long id) {
        return accountRepository.getById(id);
    }

    @Override
    public IPageData<Account> page(AccountQuery query) {
        return accountRepository.queryPage(query);
    }

}