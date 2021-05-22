package org.example.spring.domains.repositories.mysql.auth.builder;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface DResourceBuilder {
    DResourceBuilder instance = Mappers.getMapper(DResourceBuilder.class);
}
