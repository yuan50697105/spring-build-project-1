package org.example.spring.repositories.auth.postgres.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.ICommonsConverter;
import org.example.spring.repositories.auth.postgres.table.po.TRole;
import org.example.spring.repositories.auth.postgres.table.query.TRoleQuery;
import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.RoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Role;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(config = BaseBuilder.class)
public interface RoleConverter extends ICommonsConverter<Role, TRole, RoleQuery, TRoleQuery, RoleVo, RoleDTO> {

    @Mapping(target = "resources", ignore = true)
    void copyRoleResourceDTO(TRole byId, @MappingTarget RoleResourceDTO roleResourceDTO);
}
