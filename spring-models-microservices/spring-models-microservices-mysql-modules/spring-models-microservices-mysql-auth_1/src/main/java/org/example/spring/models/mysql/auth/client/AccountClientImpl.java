package org.example.spring.models.mysql.auth.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.models.commons.enumerate.UserStatus;
import org.example.spring.models.mysql.auth.builder.AuthModelBuilder;
import org.example.spring.models.mysql.auth.client.entity.AccountAddVo;
import org.example.spring.models.mysql.auth.client.entity.AccountDetailDto;
import org.example.spring.models.mysql.auth.client.entity.AccountUpdateVo;
import org.example.spring.models.mysql.auth.entity.result.AccountDetails;
import org.example.spring.models.mysql.auth.entity.vo.AccountModelVo;
import org.example.spring.models.mysql.auth.repository.AccountRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@DubboService
@AllArgsConstructor
public class AccountClientImpl implements AccountClient {
    private final AuthModelBuilder authBuilder;
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
    public void updateStatus(UserStatus status, List<Long> ids) {
        accountRepository.updateStatus(status, ids);
    }

    @Override
    public void updateStatus(UserStatus status, Long... ids) {
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
        accountDetailDto.setRoles(authBuilder.buildAccountForDTO(details.getRoles()));
        return accountDetailDto;
    }
}