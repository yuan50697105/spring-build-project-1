package org.example.spring.daos.postgres.auth.converter;

import org.example.spring.daos.postgres.auth.table.dto.TResourceDTO;
import org.example.spring.daos.postgres.auth.table.po.TResource;
import org.example.spring.daos.postgres.auth.table.query.TResourceQuery;
import org.example.spring.daos.postgres.auth.table.vo.TResourceVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TResourceConverter extends IBaseConverter<TResource, TResourceDTO, TResourceVo, TResourceQuery> {
    TResourceConverter instance = Mappers.getMapper(TResourceConverter.class);
}
