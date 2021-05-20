package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserRoleDTO;
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
    TUserBuilder instance = Mappers.getMapper(TUserBuilder.class);

    TUser buildUser(TUserVo vo);

    void copy(TUserVo vo, @MappingTarget TUser tUser);

    TUserDTO buildUser(TUser byId);

    List<TUserDTO> buildUsers(List<TUser> queryList);

    Stream<TUserDTO> buildUsers(Stream<TUser> queryListStream);

    @Mapping(target = "roles", ignore = true)
    TUserRoleDTO buildUser2(TUserDTO tUserDTO);

    IPageData<TUserDTO> buildUsers(IPageData<TUser> selectPage);
}
