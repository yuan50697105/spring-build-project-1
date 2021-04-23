package org.example.spring.models.clickhouse.auth.builder;

import org.example.spring.models.clickhouse.auth.entity.dto.DepartmentNode;
import org.example.spring.models.clickhouse.auth.entity.dto.ResourceNode;
import org.example.spring.models.clickhouse.auth.entity.query.AccountQuery;
import org.example.spring.models.clickhouse.auth.entity.query.DepartmentQuery;
import org.example.spring.models.clickhouse.auth.entity.query.ResourceQuery;
import org.example.spring.models.clickhouse.auth.entity.query.RoleQuery;
import org.example.spring.models.clickhouse.auth.entity.result.Account;
import org.example.spring.models.clickhouse.auth.entity.result.Department;
import org.example.spring.models.clickhouse.auth.entity.result.Resource;
import org.example.spring.models.clickhouse.auth.entity.result.Role;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.infrastructures.clickhouse.auth.table.po.*;
import org.example.spring.infrastructures.clickhouse.auth.table.query.TDepartmentQuery;
import org.example.spring.infrastructures.clickhouse.auth.table.query.TResourceQuery;
import org.example.spring.infrastructures.clickhouse.auth.table.query.TRoleQuery;
import org.example.spring.infrastructures.clickhouse.auth.table.query.TUserQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.*;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface AuthModelBuilder {

    @Mapping(target = "username", ignore = true)
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "status", ignore = true)
    void copyUser(TUser account, @MappingTarget TUser tUser);

    TUserQuery buildAccountQuery(AccountQuery accountQuery);

    Account buildAccount(TUser user);

    IPageData<Account> buildAccounts(IPageData<TUser> data);

    List<Account> buildAccounts(List<TUser> data);

    void copyRole(TRole role, @MappingTarget TRole tRole);

    TRoleQuery buildRoleQuery(RoleQuery roleQuery);

    Role buildRoleResult(TRole role);

    List<Role> buildRoleResult(List<TRole> role);

    IPageData<Role> buildRoleResult(IPageData<TRole> role);

    List<Resource> buildResourceResult(List<TResource> listByRoleId);

    void copyResource(TResource permission, @MappingTarget TResource tResource);

    Resource buildResourceResult(TResource permission);

    TResourceQuery buildPermissionQuery(ResourceQuery resourceQuery);

    IPageData<Resource> buildResourceResult(IPageData<TResource> data);


    List<ResourceNode> buildPermissionToResrouceNode(List<TResource> permissions);

    @Mapping(target = "parentId", source = "pid")
    @Mapping(target = "extra", ignore = true)
    ResourceNode buildPermissionToResrouceNode(TResource permissions);

    void copyDepartment(TDepartment department, @MappingTarget TDepartment tDepartment);

    Department buildDepartmentResult(TDepartment department);

    TDepartmentQuery buildDepartmentQuery(DepartmentQuery departmentQuery);

    IPageData<Department> buildDepartmentResult(IPageData<TDepartment> queryPage);

    List<Department> buildDepartmentResult(List<TDepartment> data);

    List<DepartmentNode> buildDepartmentToDepartmentNode(List<TDepartment> departments);


    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    TDepartmentRole buildDepartmentRole(Long departmentId, Long roleId);
}
