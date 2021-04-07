package org.example.spring.infrastructures.mysql.auth.builder;

import org.example.spring.infrastructures.mysql.auth.entity.vo.PermissionVo;
import org.example.spring.infrastructures.mysql.auth.table.po.TPermission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionBuilder extends TPermissionBuilder,TRolePermissionBuilder {
}
