package org.example.spring.repositories.auth.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.auth.table.dto.TResourceDTO;
import org.example.spring.repositories.auth.table.po.TResource;
import org.example.spring.repositories.auth.table.query.TResourceQuery;
import org.example.spring.repositories.auth.table.vo.TResourceVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
@Deprecated
public interface TResourceConverter extends IBaseConverter<TResource, TResourceDTO, TResourceVo, TResourceQuery> {
    TResourceConverter instance = Mappers.getMapper(TResourceConverter.class);
}
