package org.example.domains.service.impl;

import org.example.domains.builder.AccountBuilder;
import org.example.domains.service.AccountService;
import org.example.modules.repository.mysql.entity.vo.AccountVo;
import org.example.modules.repository.mysql.repository.TAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private TAccountRepository accountRepository;
    @Autowired
    private AccountBuilder accountBuilder;

    @Override
    public void save(AccountVo accountVo) {
        accountRepository.save(accountVo);
    }

}