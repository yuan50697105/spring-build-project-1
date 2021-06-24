package org.example.spring.repositories.auth.oracle.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.auth.oracle.table.dto.TResourceDTO;
import org.example.spring.repositories.auth.oracle.table.dto.TRoleDTO;
import org.example.spring.repositories.auth.oracle.table.dto.TRoleResourceDTO;
import org.example.spring.repositories.auth.oracle.table.po.TRole;
import org.example.spring.repositories.auth.oracle.table.vo.TRoleVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
@Deprecated
public interface TRoleConverter extends IBaseConverter<TRole, TRoleDTO, TRoleVo, org.example.spring.repositories.auth.oracle.table.query.TRoleQuery> {
    TRoleConverter instance = Mappers.getMapper(TRoleConverter.class);

    TRoleResourceDTO roleResources(TRole role, List<TResourceDTO> resources);
}
