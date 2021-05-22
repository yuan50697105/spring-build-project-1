package org.example.spring.models.mysql.auth.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.models.mysql.auth.builder.AccountClientBuilder;
import org.example.spring.models.mysql.auth.client.entity.*;
import org.example.spring.models.mysql.auth.entity.query.DAccountQuery;
import org.example.spring.models.mysql.auth.entity.result.DAccountDTO;
import org.example.spring.models.mysql.auth.entity.result.DAccountRoleDetailsDTO;
import org.example.spring.models.mysql.auth.entity.vo.DAccountVo;
import org.example.spring.models.mysql.auth.repository.DAccountRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@DubboService
@AllArgsConstructor
public class AccountClientImpl implements AccountClient {
    private final AccountClientBuilder authBuilder;
    private final DAccountRepository accountRepository;

    @Override
    public void save(AccountAddVo accountAddVo) {
        DAccountVo accountVo = authBuilder.buildAccountAdd(accountAddVo);
        accountRepository.save(accountVo);
    }

    @Override
    public void update(AccountUpdateVo accountUpdateVo) {
        DAccountVo accountVo = authBuilder.buildAccountUpdate(accountUpdateVo);
        accountRepository.update(accountVo);
    }

    @Override
    public void updateStatus(TUserStatus status, List<Long> ids) {

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
        DAccountRoleDetailsDTO details = accountRepository.getDetails(id);
        accountDetailDto.setUser(authBuilder.buildUserDTO(details));
        accountDetailDto.setRoles(authBuilder.buildRoleDTOS(details.getRoles()));
        return accountDetailDto;
    }

    @Override
    public AccountDto get(AccountQueryVo queryDto) {
        DAccountQuery q = authBuilder.buildAccountQuery(queryDto);
        return authBuilder.buildAccountDto(accountRepository.one(q));
    }

    @Override
    public List<AccountDto> list(AccountQueryVo queryVo) {
        DAccountQuery query = authBuilder.buildAccountQuery(queryVo);
        List<DAccountDTO> queryTop = accountRepository.top(query);
        return authBuilder.buildAccountDto(queryTop);
    }

    @Override
    public IPageData<AccountDto> data(AccountQueryVo queryVo) {
        DAccountQuery query = authBuilder.buildAccountQuery(queryVo);
        IPageData<DAccountDTO> page = accountRepository.page(query);
        return authBuilder.buildAccountDto(page);
    }

}