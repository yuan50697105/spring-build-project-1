package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.po.TUser;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
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
    TUser copy(TUserVo tUserVo, @MappingTarget TUser user);

    TUserDTO buildUser(TUser byId);

    List<TUserDTO> buildUsers(List<TUser> list);

    Stream<TUserDTO> buildUserStream(Stream<TUser> stream);

    IPageData<TUserDTO> buildUsers(IPageData<TUser> list);
}