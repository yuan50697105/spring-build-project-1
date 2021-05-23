package org.example.spring.models.mysql.auth.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface AccountClientConverter {
    AccountClientConverter CONVERTER = Mappers.getMapper(AccountClientConverter.class);
}
