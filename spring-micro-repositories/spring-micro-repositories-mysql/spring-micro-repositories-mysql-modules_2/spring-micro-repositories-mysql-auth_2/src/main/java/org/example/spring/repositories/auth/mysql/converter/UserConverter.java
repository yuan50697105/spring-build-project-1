package org.example.spring.repositories.auth.mysql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.ICommonsConverter;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.auth.mysql.table.po.TUser;
import org.example.spring.repositories.auth.mysql.table.query.TUserQuery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface UserConverter extends ICommonsConverter<User, TUser, UserQuery, TUserQuery, UserVo, UserDTO> {
    UserConverter CONVERTER = Mappers.getMapper(UserConverter.class);

    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "resources", ignore = true)
    void copyUserRoleResourceDTO(TUser byId, @MappingTarget UserRoleResourceDTO dto);

    @Mapping(target = "roles", ignore = true)
    void copyUserRoleDTO(TUser byId, @MappingTarget UserRoleDTO dto);
}
