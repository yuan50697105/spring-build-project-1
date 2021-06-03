package org.example.spring.applications.web.auth.service.impl;


import cn.hutool.core.lang.Validator;
import org.example.spring.applications.web.auth.entity.PhoneMessageDTO;
import org.example.spring.applications.web.auth.service.AAccountService;
import org.example.spring.domains.services.mysql.auth.service.DAccountService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.auth.dto.UserDTO;
import org.example.spring.repositories.commons.auth.query.UserQuery;
import org.example.spring.repositories.commons.auth.vo.UserVo;
import org.example.spring.repositories.commons.enumerate.UserStatus;
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
    public IPageData<UserDTO> queryPage(UserQuery query) {
        return accountService.queryPage(query);
    }

    @Override
    public List<UserDTO> queryList(UserQuery withSize) {
        return accountService.queryList(withSize);
    }

    @Override
    public UserDTO queryOne(UserQuery query) {
        return accountService.queryOne(query);
    }

    @Override
    public UserDTO get(Long id) {
        return accountService.get(id);
    }

    @Override
    public void save(UserVo formVo) {
        accountService.save(formVo);
    }

    @Override
    public void update(UserVo formVo) {
        accountService.update(formVo);
    }

    @Override
    public void delete(List<Long> list) {
        accountService.delete(list);
    }

    @Override
    public void updateStatus(String status, List<Long> list) {
        UserStatus userStatus = UserStatus.get(status);
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