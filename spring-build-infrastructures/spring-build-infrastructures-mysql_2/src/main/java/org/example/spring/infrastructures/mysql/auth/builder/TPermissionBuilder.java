package org.example.spring.infrastructures.mysql.auth.builder;

import org.example.spring.infrastructures.mysql.auth.entity.query.PermissionQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Permission;
import org.example.spring.infrastructures.mysql.auth.entity.vo.PermissionVo;
import org.example.spring.infrastructures.mysql.auth.table.po.TPermission;
import org.example.spring.infrastructures.mysql.auth.table.query.TPermissionQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TPermissionBuilder {
    List<Permission> buildPermissionResult(List<TPermission> listByRoleId);

    TPermission buildPermission(PermissionVo permission);

    void copyPermission(PermissionVo permission, @MappingTarget TPermission tPermission);

    Permission buildPermissionResult(TPermission permission);

    TPermissionQuery buildPermissionQuery(PermissionQuery permissionQuery);

    IPageData<Permission> buildPermissionResult(IPageData<TPermission> data);
}
