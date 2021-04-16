package org.example.spring.models.auth.builder;

import org.example.spring.plugins.commons.BaseBuilder;
import org.example.spring.models.auth.entity.dto.DepartmentNode;
import org.example.spring.models.auth.entity.query.AccountQuery;
import org.example.spring.models.auth.entity.query.DepartmentQuery;
import org.example.spring.models.auth.entity.query.ResourceQuery;
import org.example.spring.models.auth.entity.query.RoleQuery;
import org.example.spring.models.auth.entity.result.Account;
import org.example.spring.models.auth.entity.result.Department;
import org.example.spring.models.auth.entity.result.Resource;
import org.example.spring.models.auth.entity.dto.ResourceNode;
import org.example.spring.models.auth.entity.result.Role;
import org.example.spring.models.auth.entity.vo.AccountVo;
import org.example.spring.models.auth.entity.vo.DepartmentVo;
import org.example.spring.models.auth.entity.vo.ResourceVo;
import org.example.spring.models.auth.entity.vo.RoleVo;
import org.example.spring.infrastructures.mysql.auth.table.po.*;
import org.example.spring.infrastructures.mysql.auth.table.query.TDepartmentQuery;
import org.example.spring.infrastructures.mysql.auth.table.query.TResourceQuery;
import org.example.spring.infrastructures.mysql.auth.table.query.TRoleQuery;
import org.example.spring.infrastructures.mysql.auth.table.query.TUserQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.*;

import java.util.ArrayList;
import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface AuthBuilder {
    TUser buildUser(AccountVo account);

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

    Account buildAccount(TUser user);

    IPageData<Account> buildAccounts(IPageData<TUser> data);

    List<Account> buildAccounts(List<TUser> data);

    TRole buildRole(RoleVo role);

    void copyRole(RoleVo role, @MappingTarget TRole tRole);

    TRoleQuery buildRoleQuery(RoleQuery roleQuery);

    Role buildRoleResult(TRole role);

    List<Role> buildRoleResult(List<TRole> role);

    IPageData<Role> buildRoleResult(IPageData<TRole> role);

    default List<TRoleResource> buildRolePermissions(Long roleId, List<Long> permissionIds) {
        ArrayList<TRoleResource> permissions = new ArrayList<>(permissionIds.size());
        for (Long permissionId : permissionIds) {
            permissions.add(buildRolePermission(roleId, permissionId));
        }
        return permissions;
    }

    TRoleResource buildRolePermission(Long roleId, Long permissionId);

    List<Resource> buildResourceResult(List<TResource> listByRoleId);

    TResource buildPermission(ResourceVo permission);

    void copyResource(ResourceVo permission, @MappingTarget TResource tResource);

    Resource buildResourceResult(TResource permission);

    TResourceQuery buildPermissionQuery(ResourceQuery resourceQuery);

    IPageData<Resource> buildResourceResult(IPageData<TResource> data);


    List<ResourceNode> buildPermissionToResrouceNode(List<TResource> permissions);

    @Mapping(target = "extra", ignore = true)
    @Mapping(target = "parentId", source = "pid")
    ResourceNode buildPermissionToResrouceNode(TResource resource);

    TDepartment buildAccountDepartment(DepartmentVo department);

    void copyDepartment(DepartmentVo department, @MappingTarget TDepartment tDepartment);

    Department buildDepartmentResult(TDepartment department);

    TDepartmentQuery buildDepartmentQuery(DepartmentQuery departmentQuery);

    IPageData<Department> buildDepartmentResult(IPageData<TDepartment> queryPage);

    List<Department> buildDepartmentResult(List<TDepartment> data);

    List<DepartmentNode> buildDepartmentToDepartmentNode(List<TDepartment> departments);

    @Mapping(target = "weight", ignore = true)
    @Mapping(target = "parentId", source = "pid")
    @Mapping(target = "extra", ignore = true)
    DepartmentNode buildDepartmentToDepartmentNode(TDepartment department);
}
