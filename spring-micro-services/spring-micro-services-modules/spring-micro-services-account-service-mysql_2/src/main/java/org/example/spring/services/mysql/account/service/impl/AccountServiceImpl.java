package org.example.spring.services.mysql.account.service.impl;

import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.repositories.mysql.auth.repository.TUserRepository;
import org.example.spring.repositories.mysql.auth.table.vo.TUserVo;
import org.example.spring.services.mysql.account.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    private TUserRepository userRepository;

    @Override
    public void save(TUserVo vo) {
        userRepository.save(vo);
    }

    @Override
    public void update(TUserVo vo) {
        userRepository.update(vo);
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }

    @Override
    public void delete(Long... ids) {
        userRepository.delete(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        userRepository.delete(ids);
    }

    @Override
    public void updateStatus(UserStatus status, Long id) {
        userRepository.updateStatus(status, id);
    }

    @Override
    public void updateStatus(UserStatus status, Long... ids) {
        userRepository.updateStatus(status, ids);
    }

    @Override
    public void updateStaus(UserStatus status, List<Long> ids) {
        userRepository.updateStatus(status, ids);
    }
}