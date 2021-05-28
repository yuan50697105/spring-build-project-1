package org.example.spring.auth.converter;

import org.example.spring.daos.clients.auth.entity.CUserDto;
import org.example.spring.daos.clients.auth.entity.CUserQuery;
import org.example.spring.daos.clients.auth.entity.CUserRoleDto;
import org.example.spring.daos.clients.auth.entity.CUserVo;
import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserRoleDTO;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface UserClientsConverter {
    UserClientsConverter CONVERTER = Mappers.getMapper(UserClientsConverter.class);

    TUserVo build(CUserVo vo);

    CUserVo convert(TUserVo build);

    CUserDto build(TUserDTO tUserDTO);

    CUserRoleDto buildWithRole(TUserRoleDTO withRole);

    TUserQuery build(CUserQuery query);

    List<CUserDto> build(List<TUserDTO> dto);

    IPageData<CUserDto> build(IPageData<TUserDTO> dto);
}
