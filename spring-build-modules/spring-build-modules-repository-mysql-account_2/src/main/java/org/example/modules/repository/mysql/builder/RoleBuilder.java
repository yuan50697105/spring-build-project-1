package org.example.modules.repository.mysql.builder;

import org.example.modules.repository.mysql.entity.po.TPermission;
import org.example.modules.repository.mysql.entity.po.TRole;
import org.example.modules.repository.mysql.entity.po.TRolePermission;
import org.example.modules.repository.mysql.entity.query.RoleQuery;
import org.example.modules.repository.mysql.entity.query.TRoleQuery;
import org.example.modules.repository.mysql.entity.result.RoleDetailResult;
import org.example.modules.repository.mysql.entity.vo.RoleFormVo;
import org.example.modules.repository.mysql.entity.result.RoleResult;
import org.example.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface RoleBuilder {
    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    TRole createRole(RoleFormVo.RoleInfo role);

    default List<TRolePermission> createRolePermissions(Long roleId, List<Long> permissionIds) {
        ArrayList<TRolePermission> rolePermissions = new ArrayList<>(permissionIds.size());
        for (Long permissionId : permissionIds) {
            rolePermissions.add(createRolePermission(roleId, permissionId));
        }
        return rolePermissions;
    }

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    TRolePermission createRolePermission(Long roleId, Long permissionId);

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    void copyRole(RoleFormVo.RoleInfo role, @MappingTarget TRole tRole);

    RoleDetailResult.RoleInfo createRoleInfo(TRole tRole);

    Set<RoleDetailResult.PermissionInfo> createRolePermissionsInfo(List<TPermission> permissions);

    TRoleQuery createQuery(RoleQuery roleQuery);

    List<RoleResult> createRoleVos(List<TRole> roles);

    @Mapping(target = "version", ignore = true)
    RoleResult createRoleVo(TRole role);

    IPageData<RoleResult> createRoleVos(IPageData<TRole> roles);
}