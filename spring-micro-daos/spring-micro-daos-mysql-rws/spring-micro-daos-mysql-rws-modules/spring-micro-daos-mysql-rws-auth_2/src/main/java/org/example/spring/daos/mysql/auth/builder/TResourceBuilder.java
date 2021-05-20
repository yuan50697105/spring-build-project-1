package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.dto.TRoleResourceDTO;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TResourceBuilder {
    TResourceBuilder instance = Mappers.getMapper(TResourceBuilder.class);

    @Mapping(target = "resources", ignore = true)
    TRoleResourceDTO toDetails(TRoleDTO roleDTO);
}
