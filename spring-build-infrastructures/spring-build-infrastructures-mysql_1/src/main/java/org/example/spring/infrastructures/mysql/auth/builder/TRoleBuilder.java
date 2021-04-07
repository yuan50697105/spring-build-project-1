package org.example.spring.infrastructures.mysql.auth.builder;

import org.example.spring.infrastructures.mysql.auth.entity.query.RoleQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Role;
import org.example.spring.infrastructures.mysql.auth.entity.vo.RoleVo;
import org.example.spring.infrastructures.mysql.auth.table.po.TRole;
import org.example.spring.infrastructures.mysql.auth.table.query.TRoleQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TRoleBuilder {
    TRole buildRole(RoleVo role);

    void copyRole(RoleVo role,@MappingTarget TRole tRole);

    TRoleQuery buildRoleQuery(RoleQuery roleQuery);

    Role buildRoleResult(TRole role);

    List<Role> buildRoleListResult(List<TRole> role);

    IPageData<Role> buildRolePageResult(IPageData<TRole> role);
}
