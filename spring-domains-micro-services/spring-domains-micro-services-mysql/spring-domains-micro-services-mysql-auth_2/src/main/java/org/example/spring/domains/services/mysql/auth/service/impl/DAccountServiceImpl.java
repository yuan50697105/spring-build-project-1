package org.example.spring.domains.services.mysql.auth.service.impl;


import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserRoleDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserRoleResourceDTO;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.domains.repositories.mysql.auth.repository.DAccountRepository;
import org.example.spring.domains.services.mysql.auth.service.DAccountService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DAccountServiceImpl implements DAccountService {
    private final DAccountRepository accountRepository;

    public DAccountServiceImpl(DAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public IPageData<TUserDTO> queryPage(TUserQuery query) {
        return accountRepository.queryPage(query);
    }

    @Override
    public List<TUserDTO> queryList(TUserQuery query) {
        return accountRepository.queryTop(query);
    }

    @Override
    public TUserDTO queryOne(TUserQuery query) {
        return accountRepository.queryFirst(query);
    }

    @Override
    public TUserDTO get(Long id) {
        return accountRepository.get(id);
    }

    @Override
    public TUserRoleDTO getWithRole(Long id) {
        return accountRepository.getWithRole(id);
    }

    @Override
    public TUserRoleResourceDTO getWithRoleAndResource(Long id) {
        return accountRepository.getWithRoleAndResource(id);
    }

    @Override
    public void save(TUserVo vo) {
        accountRepository.save(vo);
    }

    @Override
    public void update(TUserVo vo) {
        accountRepository.update(vo);
    }

    @Override
    public void delete(List<Long> ids) {
        accountRepository.delete(ids);
    }

    @Override
    public void delete(Long... ids) {
        accountRepository.delete(ids);
    }
    @Override
    public void delete(Long id) {
        accountRepository.delete(id);
    }

    @Override
    public void updateStatus(TUserStatus status, List<Long> ids) {
        ids.forEach(id -> {
            TUserVo vo = new TUserVo();
            vo.setId(id);
            vo.setStatus(status.getValue());
            update(vo);
        });
    }
}