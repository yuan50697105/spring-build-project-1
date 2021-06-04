package org.example.spring.auth.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.auth.dto.UserDTO;
import org.example.spring.repositories.commons.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.auth.query.UserQuery;
import org.example.spring.repositories.commons.auth.vo.UserVo;
import org.example.spring.repositories.postgres.auth.table.dto.TRoleDTO;
import org.example.spring.repositories.postgres.auth.table.dto.TUserDTO;
import org.example.spring.repositories.postgres.auth.table.dto.TUserRoleDTO;
import org.example.spring.repositories.postgres.auth.table.query.TUserQuery;
import org.example.spring.repositories.postgres.auth.table.vo.TUserVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface UserRepositoryConverter {
    UserRepositoryConverter CONVERTER = Mappers.getMapper(UserRepositoryConverter.class);

    TUserVo build(UserVo vo);

    UserVo convert(TUserVo build);

    UserDTO build(TUserDTO tUserDTO);

    TUserQuery build(UserQuery query);

    List<UserDTO> build(List<TUserDTO> DTO);

    IPageData<UserDTO> build(IPageData<TUserDTO> DTO);

//    @Mapping(target = "roles", ignore = true)
//    @Mapping(target = "resources", ignore = true)
//    UserRoleResourceDTO buildWithRoleResource(TUserRoleResourceDTO user);

    @Mapping(target = "roles", ignore = true)
    UserRoleDTO buildWithRole(TUserRoleDTO userRoleDTO);


    List<RoleDTO> buildRole(List<TRoleDTO> roles);

//    List<Tree<Long>> buildResources(List<Tree<Long>> resources);
}
