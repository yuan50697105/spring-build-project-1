package org.example.spring.services.mysql.account.service.impl;

import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.services.mysql.account.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    private UserRepository userRepository;

    @Override
    public void save(UserVo vo) {
        userRepository.save(vo);
    }

    @Override
    public void update(UserVo vo) {
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
        UserVo userVo = new UserVo();
        userVo.setId(id);
        userVo.setStatus(status.getValue());
        userRepository.update(userVo);
    }

    @Override
    public void updateStatus(UserStatus status, Long... ids) {
        updateStatus(status,Arrays.asList(ids));
    }

    @Override
    public void updateStatus(UserStatus status, List<Long> ids) {
        for (Long id : ids) {
            updateStatus(status, id);
        }
    }
}