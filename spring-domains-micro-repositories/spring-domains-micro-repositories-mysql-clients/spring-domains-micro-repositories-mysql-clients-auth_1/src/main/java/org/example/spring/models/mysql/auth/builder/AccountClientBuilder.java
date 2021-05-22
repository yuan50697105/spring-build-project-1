package org.example.spring.models.mysql.auth.builder;

import org.example.spring.models.mysql.auth.client.entity.AccountAddVo;
import org.example.spring.models.mysql.auth.client.entity.AccountDetailDto;
import org.example.spring.models.mysql.auth.client.entity.AccountUpdateVo;
import org.example.spring.models.mysql.auth.entity.result.DAccountRoleDetailsDTO;
import org.example.spring.models.mysql.auth.entity.result.DRoleDTO;
import org.example.spring.models.mysql.auth.entity.vo.DAccountVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
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

    AccountDetailDto.UserDTO buildUserDTO(DAccountRoleDetailsDTO details);

    List<AccountDetailDto.RoleDTO> buildRoleDTOS(List<DRoleDTO> roles);
}
