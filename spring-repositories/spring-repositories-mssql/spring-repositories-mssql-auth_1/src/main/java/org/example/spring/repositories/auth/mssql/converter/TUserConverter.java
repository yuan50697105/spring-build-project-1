package org.example.spring.repositories.auth.mssql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.auth.mssql.table.dto.TUserDTO;
import org.example.spring.repositories.auth.mssql.table.dto.TUserRoleDTO;
import org.example.spring.repositories.auth.mssql.table.dto.TUserRoleResourceDTO;
import org.example.spring.repositories.auth.mssql.table.po.TUser;
import org.example.spring.repositories.auth.mssql.table.query.TUserQuery;
import org.example.spring.repositories.auth.mssql.table.vo.TUserVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
@Deprecated
public interface TUserConverter extends IBaseConverter<TUser, TUserDTO, TUserVo, TUserQuery> {
    TUserConverter instance = Mappers.getMapper(TUserConverter.class);

    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "resources", ignore = true)
    TUserRoleResourceDTO buildDTO2(TUserDTO tUserDTO);

    @Mapping(target = "roles", ignore = true)
    TUserRoleDTO buildDTO3(TUserDTO tUserDTO);
}
