package org.example.spring.daos.mysql.auth.converter;

import org.example.spring.daos.mysql.auth.entity.vo.RoleVo;
import org.example.spring.daos.mysql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TRoleClientConverter {
    TRoleClientConverter instance = Mappers.getMapper(TRoleClientConverter.class);

    TRoleVo build(RoleVo roleVo);
}
