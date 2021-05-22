package org.example.spring.domains.service.mysql.auth.impl;


import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.domains.service.mysql.auth.DAccountService;
import org.example.spring.models.mysql.auth.entity.po.DAccount;
import org.example.spring.models.mysql.auth.entity.query.DAccountQuery;
import org.example.spring.models.mysql.auth.entity.result.DAccountDTO;
import org.example.spring.models.mysql.auth.entity.result.DAccountRoleDetailsDTO;
import org.example.spring.models.mysql.auth.entity.vo.DAccountVo;
import org.example.spring.models.mysql.auth.repository.DAccountRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class DAccountServiceImpl implements DAccountService {
    private final DAccountRepository accountRepository;


    @Override
    public IPageData<DAccountDTO> queryPage(DAccountQuery query) {
        return null;
    }

    @Override
    public List<DAccountDTO> queryList(DAccountQuery query) {
        return null;
    }

    @Override
    public DAccount queryOne(DAccountQuery query) {
        return null;
    }

    @Override
    public DAccountRoleDetailsDTO get(Long id) {
        return null;
    }


    @Override
    public void save(DAccountVo formVo) {

    }

    @Override
    public void update(DAccountVo formVo) {

    }

    @Override
    public void delete(List<Long> ids) {
        accountRepository.delete(ids);
    }

    @Override
    public void updateStatus(TUserStatus status, List<Long> ids) {
        accountRepository.updateStatus(status, ids);
    }
}