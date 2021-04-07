package org.example.spring.infrastructures.mysql.auth.builder;

import org.example.spring.infrastructures.mysql.auth.entity.result.Role;
import org.example.spring.infrastructures.mysql.auth.table.po.TPermission;
import org.example.spring.infrastructures.mysql.auth.table.po.TRole;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleBuilder extends TRoleBuilder, TPermissionBuilder, TRolePermissionBuilder {

}
