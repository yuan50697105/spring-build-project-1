package org.example.domains.service.impl;

import org.example.domains.builder.AccountBuilder;
import org.example.domains.service.AccountService;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.example.modules.repository.mysql.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private AccountBuilder accountBuilder;

    @Override
    public void save(AccountFormVo accountFormVo) {
        accountRepository.save(accountFormVo);
    }

    @Override
    public void update(Long id, AccountFormVo formVo) {
        accountRepository.update(id, formVo);
    }

    @Override
    public void update(AccountFormVo formVo) {
        accountRepository.update(formVo);
    }

}