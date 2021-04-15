package org.example.spring.models.auth.builder;

import org.example.spring.infrastructures.commons.BaseBuilder;
import org.example.spring.infrastructures.es.auth.entity.po.EDepartment;
import org.example.spring.infrastructures.es.auth.entity.po.EResource;
import org.example.spring.infrastructures.es.auth.entity.po.ERole;
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

    ERole buildRole(RoleVo role);

    void copyRole(RoleVo role, @MappingTarget ERole eRole);

    TRoleQuery buildRoleQuery(RoleQuery roleQuery);

    Role buildRoleResult(ERole role);

    List<Role> buildRoleResult(List<ERole> role);

    IPageData<Role> buildRoleResult(IPageData<ERole> role);

    default List<org.example.spring.infrastructures.es.auth.entity.po.TRoleResource> buildRolePermissions(Long roleId, List<Long> permissionIds) {
        ArrayList<org.example.spring.infrastructures.es.auth.entity.po.TRoleResource> permissions = new ArrayList<>(permissionIds.size());
        for (Long permissionId : permissionIds) {
            permissions.add(buildRolePermission(roleId, permissionId));
        }
        return permissions;
    }

    org.example.spring.infrastructures.es.auth.entity.po.TRoleResource buildRolePermission(Long roleId, Long permissionId);

    List<Resource> buildPermissionResult(List<EResource> listByRoleId);

    EResource buildPermission(ResourceVo permission);

    void copyResource(ResourceVo permission, @MappingTarget EResource eResource);

    Resource buildPermissionResult(EResource permission);

    TResourceQuery buildPermissionQuery(ResourceQuery resourceQuery);

    IPageData<Resource> buildPermissionResult(IPageData<EResource> data);


    List<ResourceNode> buildPermissionToResrouceNode(List<EResource> permissions);

    @Mapping(target = "extra", ignore = true)
    @Mapping(target = "parentId", source = "pid")
    ResourceNode buildPermissionToResrouceNode(EResource resource);

    EDepartment buildAccountDepartment(DepartmentVo department);

    void copyDepartment(DepartmentVo department, @MappingTarget EDepartment eDepartment);

    Department buildDepartmentResult(EDepartment department);

    TDepartmentQuery buildDepartmentQuery(DepartmentQuery departmentQuery);

    IPageData<Department> buildDepartmentResult(IPageData<EDepartment> queryPage);

    List<Department> buildDepartmentResult(List<EDepartment> data);

    List<DepartmentNode> buildDepartmentToDepartmentNode(List<EDepartment> departments);

    @Mapping(target = "weight", ignore = true)
    @Mapping(target = "parentId", source = "pid")
    @Mapping(target = "extra", ignore = true)
    DepartmentNode buildDepartmentToDepartmentNode(EDepartment department);
}
