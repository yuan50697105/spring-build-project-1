package org.example.spring.domains.services.mysql.auth.service.impl;


import org.example.spring.domains.services.mysql.auth.service.DAccountService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.commons.auth.dto.UserDTO;
import org.example.spring.repositories.commons.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.auth.query.UserQuery;
import org.example.spring.repositories.commons.auth.vo.UserVo;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DAccountServiceImpl implements DAccountService {
    private final UserRepository userRepository;

    public DAccountServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public IPageData<UserDTO> queryPage(UserQuery query) {
        return userRepository.data(query);
    }

    @Override
    public List<UserDTO> queryList(UserQuery query) {
        return userRepository.top(query);
    }

    @Override
    public List<UserDTO> queryTop(UserQuery query) {
        return userRepository.top(query);
    }

    @Override
    public UserDTO queryOne(UserQuery query) {
        return userRepository.first(query);
    }

    @Override
    public UserDTO get(Long id) {
        return userRepository.get(id);
    }

    @Override
    public UserRoleDTO getWithRole(Long id) {
        return userRepository.getWithRole(id);
    }

    @Override
    public UserRoleResourceDTO getWithRoleAndResource(Long id) {
        return userRepository.getWithRoleResource(id);
    }

    @Override
    public void save(UserVo vo) {
        userRepository.save(vo);
    }

    @Override
    public void update(UserVo vo) {
        userRepository.update(vo);
    }

    @Override
    public void delete(List<Long> ids) {
        userRepository.delete(ids);
    }

    @Override
    public void delete(Long... ids) {
        userRepository.delete(ids);
    }
    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }

    @Override
    public void updateStatus(UserStatus status, List<Long> ids) {
        ids.forEach(id -> {
            UserVo vo = new UserVo();
            vo.setId(id);
            vo.setStatus(status.getValue());
            update(vo);
        });
    }
}