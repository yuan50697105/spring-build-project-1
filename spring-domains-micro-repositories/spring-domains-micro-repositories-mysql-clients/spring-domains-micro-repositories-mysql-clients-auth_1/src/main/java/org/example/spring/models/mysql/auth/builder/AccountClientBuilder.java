package org.example.spring.models.mysql.auth.builder;

import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.domains.repositories.mysql.auth.entity.query.DAccountQuery;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountRoleDetailsDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DRoleDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.vo.DAccountVo;
import org.example.spring.models.mysql.auth.client.entity.*;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface AccountClientBuilder {
    AccountClientBuilder instance = Mappers.getMapper(AccountClientBuilder.class);

    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    DAccountVo buildAccountAdd(AccountAddVo accountAddVo);

    default String convertUserStatus(TUserStatus status) {
        return status.getValue();
    }

    @Mapping(target = "username", ignore = true)
    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    DAccountVo buildAccountUpdate(AccountUpdateVo accountUpdateVo);

    UserDto buildUserDTO(DAccountRoleDetailsDTO details);

    List<RoleDto> buildRoleDTOS(List<DRoleDTO> roles);

    DAccountQuery buildAccountQuery(AccountQueryVo queryDto);

    AccountDto buildAccountDto(DAccountDTO one);

    List<AccountDto> buildAccountDto(List<DAccountDTO> queryTop);

    IPageData<AccountDto> buildAccountDto(IPageData<DAccountDTO> page);
}
