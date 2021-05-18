package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserRoleDTO;
import org.example.spring.daos.mysql.auth.table.po.TUser;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Stream;

@Mapper(config = BaseBuilder.class)
public interface TUserBuilder {
    TUserBuilder INSTANCE = Mappers.getMapper(TUserBuilder.class);

    TUser buildUser(TUserVo tUserVo);

    @Mapping(target = "username", ignore = true)
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "status", ignore = true)
    void copy(TUserVo tUserVo, @MappingTarget TUser user);

    void copy(TUser tUser, @MappingTarget TUser user);

    TUserDTO buildUser(TUser byId);

    List<TUserDTO> buildUsers(List<TUser> list);

    Stream<TUserDTO> buildUsers(Stream<TUser> queryListStream);

    TUserRoleDTO buildUser(TUserDTO tUserDTO, List<TRoleDTO> roles);
}
