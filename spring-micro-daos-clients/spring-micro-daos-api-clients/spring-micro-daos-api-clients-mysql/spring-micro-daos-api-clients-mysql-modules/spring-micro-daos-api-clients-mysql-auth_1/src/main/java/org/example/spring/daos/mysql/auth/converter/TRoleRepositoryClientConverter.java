package org.example.spring.daos.mysql.auth.converter;

import org.example.spring.daos.mysql.auth.entity.dto.RoleDTO;
import org.example.spring.daos.mysql.auth.entity.dto.RoleResourceDTO;
import org.example.spring.daos.mysql.auth.entity.query.RoleQuery;
import org.example.spring.daos.mysql.auth.entity.vo.RoleVo;
import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.dto.TRoleResourceDTO;
import org.example.spring.daos.mysql.auth.table.query.TRoleQuery;
import org.example.spring.daos.mysql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TRoleRepositoryClientConverter {
    TRoleRepositoryClientConverter instance = Mappers.getMapper(TRoleRepositoryClientConverter.class);

    TRoleVo build(RoleVo roleVo);

    RoleDTO build(TRoleDTO roleDTO);

    TRoleQuery build(RoleQuery query);

    List<RoleDTO> build(List<TRoleDTO> list);

    IPageData<RoleDTO> build(IPageData<TRoleDTO> list);

    @Mapping(target = "resourcesTree", ignore = true)
    RoleResourceDTO buildRoleResourceDTO(TRoleResourceDTO details);
}
