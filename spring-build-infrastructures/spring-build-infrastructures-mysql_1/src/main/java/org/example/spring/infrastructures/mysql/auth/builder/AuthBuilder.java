package org.example.spring.infrastructures.mysql.auth.builder;

import org.example.spring.infrastructures.mysql.auth.entity.query.AccountQuery;
import org.example.spring.infrastructures.mysql.auth.entity.query.PermissionQuery;
import org.example.spring.infrastructures.mysql.auth.entity.query.RoleQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Account;
import org.example.spring.infrastructures.mysql.auth.entity.result.Permission;
import org.example.spring.infrastructures.mysql.auth.entity.result.Role;
import org.example.spring.infrastructures.mysql.auth.entity.vo.AccountVo;
import org.example.spring.infrastructures.mysql.auth.entity.vo.PermissionVo;
import org.example.spring.infrastructures.mysql.auth.entity.vo.RoleVo;
import org.example.spring.infrastructures.mysql.auth.table.po.*;
import org.example.spring.infrastructures.mysql.auth.table.query.TPermissionQuery;
import org.example.spring.infrastructures.mysql.auth.table.query.TRoleQuery;
import org.example.spring.infrastructures.mysql.auth.table.query.TUserQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthBuilder {
    TUser buildUser(AccountVo account);

    Account buildAccount(TUser user);

    void copyUser(AccountVo account, @MappingTarget TUser tUser);

    TUserRole buildRole(Long userId, Long roleId);

    TUserQuery buildAccountQuery(AccountQuery accountQuery);

    default List<TUserRole> buildRoles(Long userId, List<Long> roleIds) {
        ArrayList<TUserRole> userRoles = new ArrayList<>(roleIds.size());
        for (Long roleId : roleIds) {
            userRoles.add(buildRole(userId,roleId));
        }
        return userRoles;
    }

    IPageData<Account> buildAccounts(IPageData<TUser> data);

    List<Account> buildAccounts(List<TUser> data);

    TRole buildRole(RoleVo role);

    void copyRole(RoleVo role, @MappingTarget TRole tRole);

    TRoleQuery buildRoleQuery(RoleQuery roleQuery);

    Role buildRoleResult(TRole role);

    List<Role> buildRoleResult(List<TRole> role);

    IPageData<Role> buildRoleResult(IPageData<TRole> role);

    default List<TRolePermission> buildRolePermissions(Long roleId, List<Long> permissionIds) {
        ArrayList<TRolePermission> permissions = new ArrayList<>(permissionIds.size());
        for (Long permissionId : permissionIds) {
            permissions.add(buildRolePermission(roleId, permissionId));
        }
        return permissions;
    }

    TRolePermission buildRolePermission(Long roleId, Long permissionId);

    List<Permission> buildPermissionResult(List<TPermission> listByRoleId);

    TPermission buildPermission(PermissionVo permission);

    void copyPermission(PermissionVo permission, @MappingTarget TPermission tPermission);

    Permission buildPermissionResult(TPermission permission);

    TPermissionQuery buildPermissionQuery(PermissionQuery permissionQuery);

    IPageData<Permission> buildPermissionResult(IPageData<TPermission> data);

}
