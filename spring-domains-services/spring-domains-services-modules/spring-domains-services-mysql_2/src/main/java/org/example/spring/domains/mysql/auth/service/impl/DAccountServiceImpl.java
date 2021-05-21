package org.example.spring.domains.mysql.auth.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.domains.mysql.auth.service.DAccountService;
import org.example.spring.models.mysql.auth.entity.query.DAccountQuery;
import org.example.spring.models.mysql.auth.entity.result.DAccountDTO;
import org.example.spring.models.mysql.auth.entity.result.DAccountDetailsDTO;
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
    public IPageData<DAccountDTO> page(DAccountQuery query) {
        return accountRepository.page(query);
    }

    @Override
    public List<DAccountDTO> list(DAccountQuery query) {
        return accountRepository.list(query);
    }

    @Override
    public DAccountDTO one(DAccountQuery query) {
        return accountRepository.one(query);
    }

    @Override
    public DAccountDTO first(DAccountQuery query) {
        return accountRepository.first(query);
    }

    @Override
    public DAccountDetailsDTO get(Long id) {
        return accountRepository.getDetails(id);
    }

    @Override
    public void save(DAccountVo formVo) {
        accountRepository.save(formVo);
    }

    @Override
    public void update(DAccountVo formVo) {
        accountRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
    }

    @Override
    public void updateStatusByIs(TUserStatus status, List<Long> ids) {
    }
}