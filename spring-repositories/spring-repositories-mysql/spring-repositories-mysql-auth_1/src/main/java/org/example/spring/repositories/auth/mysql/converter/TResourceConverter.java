package org.example.spring.repositories.auth.mysql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.auth.mysql.table.dto.TResourceDTO;
import org.example.spring.repositories.auth.mysql.table.po.TResource;
import org.example.spring.repositories.auth.mysql.table.query.TResourceQuery;
import org.example.spring.repositories.auth.mysql.table.vo.TResourceVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
@Deprecated
public interface TResourceConverter extends IBaseConverter<TResource, TResourceDTO, TResourceVo, TResourceQuery> {
    TResourceConverter instance = Mappers.getMapper(TResourceConverter.class);
}
