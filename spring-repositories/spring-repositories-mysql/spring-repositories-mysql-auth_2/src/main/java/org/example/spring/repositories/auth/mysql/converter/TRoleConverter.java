package org.example.spring.repositories.auth.mysql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.auth.mysql.table.dto.TResourceDTO;
import org.example.spring.repositories.auth.mysql.table.dto.TRoleDTO;
import org.example.spring.repositories.auth.mysql.table.dto.TRoleResourceDTO;
import org.example.spring.repositories.auth.mysql.table.po.TRole;
import org.example.spring.repositories.auth.mysql.table.vo.TRoleVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
@Deprecated
public interface TRoleConverter extends IBaseConverter<TRole, TRoleDTO, TRoleVo, org.example.spring.repositories.auth.mysql.table.query.TRoleQuery> {
    TRoleConverter instance = Mappers.getMapper(TRoleConverter.class);

    TRoleResourceDTO roleResources(TRole role, List<TResourceDTO> resources);
}
