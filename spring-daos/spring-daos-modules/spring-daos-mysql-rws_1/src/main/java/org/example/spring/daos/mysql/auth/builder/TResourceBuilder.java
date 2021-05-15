package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.po.TResource;
import org.example.spring.daos.mysql.auth.table.vo.TResourceVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TResourceBuilder {
    TResourceBuilder INSTANCE = Mappers.getMapper(TResourceBuilder.class);

    TResource buildResource(TResourceVo tResourceVo);
}
