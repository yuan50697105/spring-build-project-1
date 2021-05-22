package org.example.spring.daos.mysql.auth.converter;

import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserDetailsDTO;
import org.example.spring.daos.mysql.auth.table.po.TUser;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TUserConverter extends IBaseConverter<TUser, TUserDTO, TUserVo, TUserQuery> {
    TUserConverter instance = Mappers.getMapper(TUserConverter.class);

    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "resources", ignore = true)
    TUserDetailsDTO buildDTO2(TUserDTO tUserDTO);
}
