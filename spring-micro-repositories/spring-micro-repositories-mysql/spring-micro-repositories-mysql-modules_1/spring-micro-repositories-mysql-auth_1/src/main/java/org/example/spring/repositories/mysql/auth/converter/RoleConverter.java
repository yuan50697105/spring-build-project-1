package org.example.spring.repositories.mysql.auth.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.ICommonsConverter;
import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.RoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Role;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;
import org.example.spring.repositories.mysql.auth.table.po.TRole;
import org.example.spring.repositories.mysql.auth.table.query.TRoleQuery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = BaseBuilder.class)
public interface RoleConverter extends ICommonsConverter<Role, TRole, RoleQuery, TRoleQuery, RoleVo, RoleDTO> {
    @Mapping(target = "resources", ignore = true)
    RoleResourceDTO buildRoleResourceDTO(TRole byId);
}
