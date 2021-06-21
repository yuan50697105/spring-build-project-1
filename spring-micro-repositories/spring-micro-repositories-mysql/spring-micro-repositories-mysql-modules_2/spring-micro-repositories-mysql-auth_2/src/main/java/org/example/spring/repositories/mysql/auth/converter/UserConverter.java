package org.example.spring.repositories.mysql.auth.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.ICommonsConverter;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.mysql.auth.table.po.TUser;
import org.example.spring.repositories.mysql.auth.table.query.TUserQuery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface UserConverter extends ICommonsConverter<User, TUser, UserQuery, TUserQuery, UserVo, UserDTO> {
    UserConverter CONVERTER = Mappers.getMapper(UserConverter.class);

    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "resources", ignore = true)
    UserRoleResourceDTO buildUserRoleResourceDTO(TUser userDTO);

    @Mapping(target = "roles", ignore = true)
    UserRoleDTO buildUserRoleDTO(TUser byId);
}