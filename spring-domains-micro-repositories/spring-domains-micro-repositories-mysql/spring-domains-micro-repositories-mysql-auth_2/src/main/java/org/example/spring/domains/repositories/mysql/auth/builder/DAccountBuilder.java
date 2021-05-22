package org.example.spring.domains.repositories.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserRoleDTO;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountDetailsDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountRoleDetailsDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DRoleDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.query.DAccountQuery;
import org.example.spring.domains.repositories.mysql.auth.entity.vo.DAccountVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface DAccountBuilder {
    DAccountBuilder instance = Mappers.getMapper(DAccountBuilder.class);

    TUserVo build(DAccountVo accountVo);

    DAccountDTO build(TUserDTO tUserDTO);

    @Mapping(target = "resources", ignore = true)
    DAccountDetailsDTO build2(TUserRoleDTO details);

    List<DRoleDTO> buildRoles2(List<TRoleDTO> roles);

    TUserQuery buildQuery(DAccountQuery query);

    List<DAccountDTO> build(List<TUserDTO> queryList);

    IPageData<DAccountDTO> build(IPageData<TUserDTO> dto);

    DAccountRoleDetailsDTO build3(TUserRoleDTO details);
}
