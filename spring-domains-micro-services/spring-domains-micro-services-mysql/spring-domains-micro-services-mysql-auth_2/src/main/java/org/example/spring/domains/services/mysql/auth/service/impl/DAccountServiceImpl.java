package org.example.spring.domains.services.mysql.auth.service.impl;


import org.example.spring.domains.services.mysql.auth.service.DAccountService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.repositories.mysql.auth.repository.TUserRepository;
import org.example.spring.repositories.mysql.auth.table.dto.TUserDTO;
import org.example.spring.repositories.mysql.auth.table.dto.TUserRoleDTO;
import org.example.spring.repositories.mysql.auth.table.dto.TUserRoleResourceDTO;
import org.example.spring.repositories.mysql.auth.table.query.TUserQuery;
import org.example.spring.repositories.mysql.auth.table.vo.TUserVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DAccountServiceImpl implements DAccountService {
    private final TUserRepository userRepository;

    public DAccountServiceImpl(TUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public IPageData<TUserDTO> queryPage(TUserQuery query) {
        return userRepository.queryPage(query);
    }

    @Override
    public List<TUserDTO> queryList(TUserQuery query) {
        return userRepository.queryTop(query);
    }

    @Override
    public TUserDTO queryOne(TUserQuery query) {
        return userRepository.queryFirst(query);
    }

    @Override
    public TUserDTO get(Long id) {
        return userRepository.get(id);
    }

    @Override
    public TUserRoleDTO getWithRole(Long id) {
        return userRepository.getWithRole(id);
    }

    @Override
    public TUserRoleResourceDTO getWithRoleAndResource(Long id) {
        return userRepository.getWithRoleAndResource(id);
    }

    @Override
    public void save(TUserVo vo) {
        userRepository.save(vo);
    }

    @Override
    public void update(TUserVo vo) {
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
            TUserVo vo = new TUserVo();
            vo.setId(id);
            vo.setStatus(status.getValue());
            update(vo);
        });
    }
}