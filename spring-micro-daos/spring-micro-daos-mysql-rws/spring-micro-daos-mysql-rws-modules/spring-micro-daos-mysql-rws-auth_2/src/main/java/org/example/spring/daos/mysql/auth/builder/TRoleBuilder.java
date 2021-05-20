package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TRoleBuilder {
    TRoleBuilder instance = Mappers.getMapper(TRoleBuilder.class);

}
