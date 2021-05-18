package org.example.spring.models.mysql.auth.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.models.mysql.auth.builder.AuthModelClientBuilder;
import org.example.spring.models.mysql.auth.client.entity.*;
import org.example.spring.models.mysql.auth.entity.query.AccountQuery;
import org.example.spring.models.mysql.auth.entity.result.Account;
import org.example.spring.models.mysql.auth.entity.result.AccountDetails;
import org.example.spring.models.mysql.auth.entity.vo.AccountModelVo;
import org.example.spring.models.mysql.auth.repository.AccountRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@DubboService
@AllArgsConstructor
public class AccountClientImpl implements AccountClient {
    private final AuthModelClientBuilder authBuilder;
    private final AccountRepository accountRepository;

    @Override
    public void save(AccountAddVo accountAddVo) {
        AccountModelVo accountModelVo = authBuilder.buildAccountAdd(accountAddVo);
        accountRepository.save(accountModelVo);
    }

    @Override
    public void update(AccountUpdateVo accountUpdateVo) {
        accountRepository.update(authBuilder.buildAccountUpdate(accountUpdateVo));
    }

    @Override
    public void updateStatus(TUserStatus status, List<Long> ids) {
        accountRepository.updateStatus(status, ids);
    }

    @Override
    public void updateStatus(TUserStatus status, Long... ids) {
        updateStatus(status, Arrays.asList(ids));
    }

    @Override
    public void delete(List<Long> ids) {
        accountRepository.delete(ids);
    }

    @Override
    public void delete(Long... ids) {
        accountRepository.delete(Arrays.asList(ids));
    }

    @Override
    public AccountDetailDto get(Long id) {
        AccountDetailDto accountDetailDto = new AccountDetailDto();
        AccountDetails details = accountRepository.getDetailsById(id);
        accountDetailDto.setUser(authBuilder.buildAccountForDTO(details.getAccount()));
        accountDetailDto.setRoles(authBuilder.buildAccountForDTORoles(details.getRoles()));
        return accountDetailDto;
    }

    @Override
    public AccountDto get(AccountQueryVo queryDto) {
        AccountQuery q = authBuilder.buildAccountQuery(queryDto);
        return authBuilder.buildAccountDto(accountRepository.queryOne(q));
    }

    @Override
    public List<AccountDto> list(AccountQueryVo queryVo) {
        AccountQuery query = authBuilder.buildAccountQuery(queryVo);
        List<Account> queryTop = accountRepository.queryTop(query, query.getSize());
        return authBuilder.buildAccountDto(queryTop);
    }

    @Override
    public IPageData<AccountDto> data(AccountQueryVo queryVo) {
        AccountQuery query = authBuilder.buildAccountQuery(queryVo);
        IPageData<Account> queryTop = accountRepository.queryPage(query);
        return authBuilder.buildAccountDto(queryTop);
    }

}