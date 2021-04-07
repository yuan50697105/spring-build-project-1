package org.example.spring.infrastructures.mysql.auth.builder;

import org.example.spring.infrastructures.mysql.auth.entity.result.Permission;
import org.example.spring.infrastructures.mysql.auth.table.po.TPermission;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TPermissionBuilder {
    List<Permission> buildPermissionResult(List<TPermission> listByRoleId);
}
