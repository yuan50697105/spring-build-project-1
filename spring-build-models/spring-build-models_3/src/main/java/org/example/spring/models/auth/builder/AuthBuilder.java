package org.example.spring.models.auth.builder;

import org.example.spring.infrastructures.commons.BaseBuilder;
import org.example.spring.infrastructures.es.auth.entity.po.TDepartment;
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
import org.example.spring.infrastructures.es.auth.entity.query.TDepartmentQuery;
import org.example.spring.infrastructures.es.auth.entity.query.TResourceQuery;
import org.example.spring.infrastructures.es.auth.entity.query.TRoleQuery;
import org.example.spring.infrastructures.es.auth.entity.query.TUserQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.mapstruct.*;

import java.util.ArrayList;
import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface AuthBuilder {
    org.example.spring.infrastructures.es.auth.entity.po.TUser buildUser(AccountVo account);

    void copyUser(AccountVo account, @MappingTarget org.example.spring.infrastructures.es.auth.entity.po.TUser tUser);

    org.example.spring.infrastructures.es.auth.entity.po.TUserRole buildRole(Long userId, Long roleId);

    TUserQuery buildAccountQuery(AccountQuery accountQuery);

    default List<org.example.spring.infrastructures.es.auth.entity.po.TUserRole> buildRoles(Long userId, List<Long> roleIds) {
        ArrayList<org.example.spring.infrastructures.es.auth.entity.po.TUserRole> userRoles = new ArrayList<>(roleIds.size());
        for (Long roleId : roleIds) {
            userRoles.add(buildRole(userId,roleId));
        }
        return userRoles;
    }

    Account buildAccount(org.example.spring.infrastructures.es.auth.entity.po.TUser user);

    IPageData<Account> buildAccounts(IPageData<org.example.spring.infrastructures.es.auth.entity.po.TUser> data);

    List<Account> buildAccounts(List<org.example.spring.infrastructures.es.auth.entity.po.TUser> data);

    org.example.spring.infrastructures.es.auth.entity.po.TRole buildRole(RoleVo role);

    void copyRole(RoleVo role, @MappingTarget org.example.spring.infrastructures.es.auth.entity.po.TRole tRole);

    TRoleQuery buildRoleQuery(RoleQuery roleQuery);

    Role buildRoleResult(org.example.spring.infrastructures.es.auth.entity.po.TRole role);

    List<Role> buildRoleResult(List<org.example.spring.infrastructures.es.auth.entity.po.TRole> role);

    IPageData<Role> buildRoleResult(IPageData<org.example.spring.infrastructures.es.auth.entity.po.TRole> role);

    default List<org.example.spring.infrastructures.es.auth.entity.po.TRoleResource> buildRolePermissions(Long roleId, List<Long> permissionIds) {
        ArrayList<org.example.spring.infrastructures.es.auth.entity.po.TRoleResource> permissions = new ArrayList<>(permissionIds.size());
        for (Long permissionId : permissionIds) {
            permissions.add(buildRolePermission(roleId, permissionId));
        }
        return permissions;
    }

    org.example.spring.infrastructures.es.auth.entity.po.TRoleResource buildRolePermission(Long roleId, Long permissionId);

    List<Resource> buildPermissionResult(List<org.example.spring.infrastructures.es.auth.entity.po.TResource> listByRoleId);

    org.example.spring.infrastructures.es.auth.entity.po.TResource buildPermission(ResourceVo permission);

    void copyResource(ResourceVo permission, @MappingTarget org.example.spring.infrastructures.es.auth.entity.po.TResource tResource);

    Resource buildPermissionResult(org.example.spring.infrastructures.es.auth.entity.po.TResource permission);

    TResourceQuery buildPermissionQuery(ResourceQuery resourceQuery);

    IPageData<Resource> buildPermissionResult(IPageData<org.example.spring.infrastructures.es.auth.entity.po.TResource> data);


    List<ResourceNode> buildPermissionToResrouceNode(List<org.example.spring.infrastructures.es.auth.entity.po.TResource> permissions);

    @Mapping(target = "extra", ignore = true)
    @Mapping(target = "parentId", source = "pid")
    ResourceNode buildPermissionToResrouceNode(org.example.spring.infrastructures.es.auth.entity.po.TResource resource);

    org.example.spring.infrastructures.es.auth.entity.po.TDepartment buildAccountDepartment(DepartmentVo department);

    void copyDepartment(DepartmentVo department, @MappingTarget org.example.spring.infrastructures.es.auth.entity.po.TDepartment tDepartment);

    Department buildDepartmentResult(org.example.spring.infrastructures.es.auth.entity.po.TDepartment department);

    TDepartmentQuery buildDepartmentQuery(DepartmentQuery departmentQuery);

    IPageData<Department> buildDepartmentResult(IPageData<org.example.spring.infrastructures.es.auth.entity.po.TDepartment> queryPage);

    List<Department> buildDepartmentResult(List<org.example.spring.infrastructures.es.auth.entity.po.TDepartment> data);

    List<DepartmentNode> buildDepartmentToDepartmentNode(List<org.example.spring.infrastructures.es.auth.entity.po.TDepartment> departments);

    @Mapping(target = "weight", ignore = true)
    @Mapping(target = "parentId", source = "pid")
    @Mapping(target = "extra", ignore = true)
    DepartmentNode buildDepartmentToDepartmentNode(TDepartment department);
}
