package org.example.spring.domains.services.mysql.auth.service.impl;


import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.domains.repositories.mysql.auth.entity.query.DAccountQuery;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountRoleDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.vo.DAccountVo;
import org.example.spring.domains.repositories.mysql.auth.repository.DAccount2Repository;
import org.example.spring.domains.services.mysql.auth.service.DAccountService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class DAccountServiceImpl implements DAccountService {
    private final DAccount2Repository account2Repository;

    @Override
    public IPageData<DAccountDTO> queryPage(DAccountQuery query) {
        return null;
    }

    @Override
    public List<DAccountDTO> queryList(DAccountQuery query) {
        return null;
    }

    @Override
    public DAccountDTO queryOne(DAccountQuery query) {
        return null;
    }

    @Override
    public DAccountRoleDTO get(Long id) {
        return null;
    }


    @Override
    public void save(DAccountVo formVo) {
        account2Repository.save(formVo);
    }

    @Override
    public void update(DAccountVo formVo) {
        account2Repository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        account2Repository.delete(ids);
    }

    @Override
    public void updateStatus(TUserStatus status, List<Long> ids) {
        ids.forEach(id -> {
            DAccountVo vo = new DAccountVo();
            vo.setId(id);
            vo.setStatus(status.getValue());
            update(vo);
        });
    }
}