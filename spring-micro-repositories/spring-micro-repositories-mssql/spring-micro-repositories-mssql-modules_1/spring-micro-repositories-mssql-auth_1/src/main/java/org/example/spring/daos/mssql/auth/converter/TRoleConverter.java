package org.example.spring.daos.mssql.auth.converter;

import org.example.spring.daos.mssql.auth.table.dto.TRoleDto;
import org.example.spring.daos.mssql.auth.table.po.TRole;
import org.example.spring.daos.mssql.auth.table.query.TRoleQuery;
import org.example.spring.daos.mssql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TRoleConverter extends IBaseConverter<TRole, TRoleDto, TRoleVo, TRoleQuery> {
    TRoleConverter CONVERTER = Mappers.getMapper(TRoleConverter.class);
}
