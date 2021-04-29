package org.example.spring.infrastructures.mysql.auth.builder;

import org.example.spring.infrastructures.mysql.auth.entity.ITDepartment;
import org.example.spring.infrastructures.mysql.auth.entity.ITResource;
import org.example.spring.infrastructures.mysql.auth.entity.query.ITDepartmentQuery;
import org.example.spring.infrastructures.mysql.auth.entity.query.ITResourceQuery;
import org.example.spring.infrastructures.mysql.auth.table.po.TDepartment;
import org.example.spring.infrastructures.mysql.auth.table.po.TDepartmentRole;
import org.example.spring.infrastructures.mysql.auth.table.po.TResource;
import org.example.spring.infrastructures.mysql.auth.table.query.TDepartmentQuery;
import org.example.spring.infrastructures.mysql.auth.table.query.TResourceQuery;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface AuthClientBuilder {
    TDepartment createForSave(ITDepartment department);

    default void copy(ITDepartment department, TDepartment tDepartment) {
        if (department != null) {
            tDepartment.copy(department);
        }
    }

    ITDepartment createForGetDepartment(TDepartment department);

    List<ITDepartment> createForGetDepartment(List<TDepartment> list);

    IPageData<ITDepartment> createForGetDepartment(IPageData<TDepartment> data);

    @Mapping(target = "withSize", ignore = true)
    TDepartmentQuery createForQuery(ITDepartmentQuery query);

    default List<TDepartmentRole> createForSave(List<Long> roleIds, Long departmentId) {
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

    TResource createForSave(ITResource resource);

    @Mapping(target = "withSize", ignore = true)
    TResourceQuery createForQuery(ITResourceQuery query);

    ITResource createForGetResource(TResource resource);

    List<ITResource> createForGetResource(List<TResource> queryTop);


    IPageData<ITResource> createForGetResource(IPageData<TDepartment> data);
}
