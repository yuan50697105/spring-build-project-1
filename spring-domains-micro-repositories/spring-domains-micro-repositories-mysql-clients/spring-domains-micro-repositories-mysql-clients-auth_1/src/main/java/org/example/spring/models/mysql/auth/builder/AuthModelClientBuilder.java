package org.example.spring.models.mysql.auth.builder;

import org.example.spring.models.mysql.auth.client.entity.*;
import org.example.spring.models.mysql.auth.entity.query.AccountQuery;
import org.example.spring.models.mysql.auth.entity.result.Account;
import org.example.spring.models.mysql.auth.entity.result.Role;
import org.example.spring.models.mysql.auth.entity.vo.AccountModelVo;
import org.example.spring.models.mysql.auth.entity.vo.DAccountVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface AuthModelClientBuilder {
    DAccountVo buildAccountAdd(AccountAddVo accountAddVo);

    DAccountVo buildAccountUpdate(AccountUpdateVo accountUpdateVo);

    AccountDetailDto.UserDTO buildAccountForDTO(Account account);

    AccountQuery buildAccountQuery(AccountQueryVo queryDto);

    AccountDto buildAccountDto(Account queryOne);

    List<AccountDto> buildAccountDto(List<Account> queryTop);

    IPageData<AccountDto> buildAccountDto(IPageData<Account> queryTop);

    List<AccountDetailDto.RoleDTO> buildAccountForDTORoles(List<Role> roles);
}
