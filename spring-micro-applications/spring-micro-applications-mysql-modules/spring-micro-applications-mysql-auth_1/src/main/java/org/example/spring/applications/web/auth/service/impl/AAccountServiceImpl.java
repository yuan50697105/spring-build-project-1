package org.example.spring.applications.web.auth.service.impl;

import cn.hutool.core.lang.Validator;
import lombok.AllArgsConstructor;
import org.example.spring.applications.web.auth.entity.PhoneMessageDTO;
import org.example.spring.applications.web.auth.service.AAccountService;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.domains.repositories.mysql.auth.entity.query.DAccountQuery;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountRoleDetailsDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.vo.DAccountVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ValidationException;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class AAccountServiceImpl implements AAccountService {
    private final org.example.spring.domains.services.mysql.auth.service.DAccountService accountService;

    @Override
    public IPageData<DAccountDTO> queryPage(DAccountQuery query) {
        return accountService.queryPage(query);
    }

    @Override
    public List<DAccountDTO> queryList(DAccountQuery withSize) {
        return accountService.queryList(withSize);
    }

    @Override
    public DAccountDTO queryOne(DAccountQuery query) {
        return accountService.queryOne(query);
    }

    @Override
    public DAccountRoleDetailsDTO get(Long id) {
        return accountService.get(id);
    }

    @Override
    public void save(DAccountVo formVo) {
        accountService.save(formVo);
    }

    @Override
    public void update(DAccountVo formVo) {
        accountService.update(formVo);
    }

    @Override
    public void delete(List<Long> list) {
        accountService.delete(list);
    }

    @Override
    public void updateStatus(String status, List<Long> list) {
        TUserStatus userStatus = TUserStatus.get(status);
        if (Validator.isNotEmpty(userStatus)) {
            accountService.updateStatus(userStatus, list);
        } else {
            throw new ValidationException("status无效");
        }
    }

    @Override
    public void sendMessage(PhoneMessageDTO phoneMessageDTO) {

    }
}