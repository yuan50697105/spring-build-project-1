package org.example.spring.repositories.aggregation.auth.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.aggregation.auth.table.dto.TResourceDTO;
import org.example.spring.repositories.aggregation.auth.table.dto.TRoleDTO;
import org.example.spring.repositories.aggregation.auth.table.dto.TRoleResourceDTO;
import org.example.spring.repositories.aggregation.auth.table.po.TRole;
import org.example.spring.repositories.aggregation.auth.table.vo.TRoleVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
@Deprecated
public interface TRoleConverter extends IBaseConverter<TRole, TRoleDTO, TRoleVo, org.example.spring.repositories.aggregation.auth.table.query.TRoleQuery> {
    TRoleConverter instance = Mappers.getMapper(TRoleConverter.class);

    TRoleResourceDTO roleResources(TRole role, List<TResourceDTO> resources);
}
