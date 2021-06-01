package org.example.spring.repositories.mysql.auth.converter;

import org.example.spring.repositories.mysql.auth.table.dto.TResourceDTO;
import org.example.spring.repositories.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.repositories.mysql.auth.table.dto.TRoleResourceDTO;
import org.example.spring.repositories.mysql.auth.table.po.TRole;
import org.example.spring.repositories.mysql.auth.table.query.TRoleQuery;
import org.example.spring.repositories.mysql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TRoleConverter extends IBaseConverter<TRole, TRoleDTO, TRoleVo, TRoleQuery> {
    TRoleConverter instance = Mappers.getMapper(TRoleConverter.class);

    TRoleResourceDTO roleResources(TRole role, List<TResourceDTO> resources);
}
