package org.example.spring.applications.web.auth.service.impl;

import cn.hutool.core.lang.Validator;
import org.example.spring.applications.web.auth.entity.PhoneMessageDTO;
import org.example.spring.applications.web.auth.service.AAccountService;
import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.domains.services.mysql.auth.service.DAccountService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ValidationException;
import java.util.List;

@Service
@Transactional
public class AAccountServiceImpl implements AAccountService {
    private final DAccountService accountService;

    public AAccountServiceImpl(DAccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public IPageData<TUserDTO> queryPage(TUserQuery query) {
        return accountService.queryPage(query);
    }

    @Override
    public List<TUserDTO> queryList(TUserQuery withSize) {
        return accountService.queryList(withSize);
    }

    @Override
    public TUserDTO queryOne(TUserQuery query) {
        return accountService.queryOne(query);
    }

    @Override
    public TUserDTO get(Long id) {
        return accountService.get(id);
    }

    @Override
    public void save(TUserVo formVo) {
        accountService.save(formVo);
    }

    @Override
    public void update(TUserVo formVo) {
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