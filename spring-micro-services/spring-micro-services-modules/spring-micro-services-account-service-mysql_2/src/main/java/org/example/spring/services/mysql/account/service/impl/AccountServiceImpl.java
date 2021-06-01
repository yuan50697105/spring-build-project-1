package org.example.spring.services.mysql.account.service.impl;

import org.example.spring.repositories.mysql.auth.repository.TUserRepository;
import org.example.spring.repositories.mysql.auth.table.vo.TUserVo;
import org.example.spring.services.mysql.account.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    private TUserRepository userRepository;

    @Override
    public void save(TUserVo vo) {
        userRepository.save(vo);
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }
}