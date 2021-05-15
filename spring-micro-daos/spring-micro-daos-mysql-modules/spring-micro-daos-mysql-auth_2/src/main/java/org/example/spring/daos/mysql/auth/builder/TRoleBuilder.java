package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.po.TRole;
import org.example.spring.daos.mysql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TRoleBuilder {
    TRoleBuilder INSTANCE = Mappers.getMapper(TRoleBuilder.class);

    TRole buildRole(TRoleVo tRoleVo);

    List<TRoleDTO> buildRoleDTO(List<TRole> tRoles);
}
