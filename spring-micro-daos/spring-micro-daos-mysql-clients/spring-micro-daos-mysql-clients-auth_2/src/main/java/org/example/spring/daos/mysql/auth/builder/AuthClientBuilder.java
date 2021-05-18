package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.entity.query.DepartmentQuery;
import org.example.spring.daos.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.daos.mysql.auth.entity.query.RoleQuery;
import org.example.spring.daos.mysql.auth.entity.query.UserQuery;
import org.example.spring.daos.mysql.auth.entity.vo.DepartmentVo;
import org.example.spring.daos.mysql.auth.entity.vo.ResourceVo;
import org.example.spring.daos.mysql.auth.entity.vo.RoleVo;
import org.example.spring.daos.mysql.auth.entity.vo.UserVo;
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
    TDepartment createForSave(DepartmentVo departmentVo);

    default void copy(DepartmentVo departmentVo, TDepartment tDepartment) {
        if (departmentVo != null) {
            tDepartment.copy(departmentVo);
        }
    }

    DepartmentVo createForGetDepartment(TDepartment department);

    List<DepartmentVo> createForGetDepartment(List<TDepartment> list);

    IPageData<DepartmentVo> createForGetDepartment(IPageData<TDepartment> data);

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

    TResource createForSave(ResourceVo resourceVo);

    @Mapping(target = "withSize", ignore = true)
    TResourceQuery createForQuery(ResourceQuery query);

    ResourceVo createForGetResource(TResource resource);

    List<ResourceVo> createForGetResource(List<TResource> queryTop);


    IPageData<ResourceVo> createForGetResource(IPageData<TResource> data);

    TUser createForSave(UserVo userVo);

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

    UserVo createForGetUser(TUser user);

    TUserQuery createForQuery(UserQuery query);

    List<UserVo> createForGetUser(List<TUser> queryTop);

    IPageData<UserVo> createForGetUser(IPageData<TUser> queryTop);

    TRole createForSave(RoleVo roleVo);

    RoleVo createForGetRole(TRole tRole);

    TRoleQuery createForQuery(RoleQuery query);

    List<RoleVo> createForGetRole(List<TRole> queryTop);

    IPageData<RoleVo> createForGetRole(IPageData<TRole> list);
}
