package org.example.spring.applications.web.auth.service.impl;

import cn.hutool.core.lang.Validator;
import lombok.AllArgsConstructor;
import org.example.spring.applications.web.auth.entity.PhoneMessageDTO;
import org.example.spring.applications.web.auth.service.AAccountService;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.domains.postgresql.auth.service.AccountService;
import org.example.spring.models.postgresql.auth.entity.query.AccountQuery;
import org.example.spring.models.postgresql.auth.entity.result.Account;
import org.example.spring.models.postgresql.auth.entity.result.AccountDetails;
import org.example.spring.models.postgresql.auth.entity.vo.AccountModelVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ValidationException;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class AAccountServiceImpl implements AAccountService {
    private final AccountService accountService;

    @Override
    public IPageData<Account> queryPage(AccountQuery query) {
        return accountService.queryPage(query);
    }

    @Override
    public List<Account> queryList(AccountQuery withSize) {
        return accountService.queryList(withSize);
    }

    @Override
    public Account queryOne(AccountQuery query) {
        return accountService.queryOne(query);
    }

    @Override
    public AccountDetails get(Long id) {
        return accountService.get(id);
    }

    @Override
    public void save(AccountModelVo formVo) {
        accountService.save(formVo);
    }

    @Override
    public void update(AccountModelVo formVo) {
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
            accountService.updateStatusByITs(userStatus, list);
        } else {
            throw new ValidationException("status无效");
        }
    }

    @Override
    public void sendMessage(PhoneMessageDTO phoneMessageDTO) {

    }
}