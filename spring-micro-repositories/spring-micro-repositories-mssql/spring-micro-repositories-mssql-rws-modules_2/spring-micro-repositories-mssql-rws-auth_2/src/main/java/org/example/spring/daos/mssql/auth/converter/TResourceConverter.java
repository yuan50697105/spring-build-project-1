package org.example.spring.daos.mssql.auth.converter;

import org.example.spring.daos.mssql.auth.table.dto.TResourceDto;
import org.example.spring.daos.mssql.auth.table.po.TResource;
import org.example.spring.daos.mssql.auth.table.query.TResourceQuery;
import org.example.spring.daos.mssql.auth.table.vo.TResourceVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TResourceConverter extends IBaseConverter<TResource, TResourceDto, TResourceVo, TResourceQuery> {
    TResourceConverter CONVERTER = Mappers.getMapper(TResourceConverter.class);
}
