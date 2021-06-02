package org.example.spring.auth.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.auth.dto.UserDTO;
import org.example.spring.repositories.commons.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.auth.query.UserQuery;
import org.example.spring.repositories.commons.auth.vo.UserVo;
import org.example.spring.repositories.mysql.auth.table.dto.TUserDTO;
import org.example.spring.repositories.mysql.auth.table.dto.TUserRoleDTO;
import org.example.spring.repositories.mysql.auth.table.query.TUserQuery;
import org.example.spring.repositories.mysql.auth.table.vo.TUserVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface UserClientsConverter {
    UserClientsConverter CONVERTER = Mappers.getMapper(UserClientsConverter.class);

    TUserVo build(UserVo vo);

    UserVo convert(TUserVo build);

    UserDTO build(TUserDTO tUserDTO);

    UserRoleDTO buildWithRole(TUserRoleDTO withRole);

    TUserQuery build(UserQuery query);

    List<UserDTO> build(List<TUserDTO> DTO);

    IPageData<UserDTO> build(IPageData<TUserDTO> DTO);
}
