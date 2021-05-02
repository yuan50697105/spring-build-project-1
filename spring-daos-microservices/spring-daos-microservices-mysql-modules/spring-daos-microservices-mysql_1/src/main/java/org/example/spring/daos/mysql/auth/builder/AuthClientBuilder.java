package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.entity.Department;
import org.example.spring.daos.mysql.auth.entity.Resource;
import org.example.spring.daos.mysql.auth.entity.Role;
import org.example.spring.daos.mysql.auth.entity.User;
import org.example.spring.daos.mysql.auth.entity.query.DepartmentQuery;
import org.example.spring.daos.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.daos.mysql.auth.entity.query.RoleQuery;
import org.example.spring.daos.mysql.auth.entity.query.UserQuery;
import org.example.spring.daos.mysql.auth.table.po.*;
import org.example.spring.daos.mysql.auth.table.query.TDepartmentQuery;
import org.example.spring.daos.mysql.auth.table.query.TResourceQuery;
import org.example.spring.daos.mysql.auth.table.query.TRoleQuery;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface AuthClientBuilder {
    TDepartment createForSave(Department department);

    default void copy(Department department, TDepartment tDepartment) {
        if (department != null) {
            tDepartment.copy(department);
        }
    }

    Department createForGetDepartment(TDepartment department);

    List<Department> createForGetDepartment(List<TDepartment> list);

    IPageData<Department> createForGetDepartment(IPageData<TDepartment> data);

    @Mapping(target = "withSize", ignore = true)
    TDepartmentQuery createForQuery(DepartmentQuery query);

    @SuppressWarnings("unchecked")
    default List<TDepartmentRole> createForSaveDepartmentRole(List<Long> roleIds, Long departmentId) {
        if (roleIds != null && departmentId != null) {
            List<TDepartmentRole> departmentRoles = new ArrayList<>(roleIds.size());
            for (Long roleId : roleIds) {
                departmentRoles.add(new TDepartmentRole(departmentId, roleId));
            }
            return departmentRoles;
        } else {
            return Collections.EMPTY_LIST;
        }
    }

    TResource createForSave(Resource resource);

    @Mapping(target = "withSize", ignore = true)
    TResourceQuery createForQuery(ResourceQuery query);

    Resource createForGetResource(TResource resource);

    List<Resource> createForGetResource(List<TResource> queryTop);


    IPageData<Resource> createForGetResource(IPageData<TResource> data);

    TUser createForSave(User user);

    @SuppressWarnings("unchecked")
    default List<TUserRole> createForSaveUserRole(List<Long> roleIds, Long userId) {
        if (roleIds != null && userId != null) {
            ArrayList<TUserRole> userRoles = new ArrayList<>(roleIds.size());
            for (Long roleId : roleIds) {
                userRoles.add(new TUserRole(userId, roleId));
            }
            return userRoles;
        } else {
            return Collections.EMPTY_LIST;
        }
    }

    User createForGetUser(TUser user);

    TUserQuery createForQuery(UserQuery query);

    List<User> createForGetUser(List<TUser> queryTop);

    IPageData<User> createForGetUser(IPageData<TUser> queryTop);

    TRole createForSave(Role role);

    Role createForGetRole(TRole tRole);

    TRoleQuery createForQuery(RoleQuery query);

    List<Role> createForGetRole(List<TRole> queryTop);

    IPageData<Role> createForGetRole(IPageData<TRole> list);
}
