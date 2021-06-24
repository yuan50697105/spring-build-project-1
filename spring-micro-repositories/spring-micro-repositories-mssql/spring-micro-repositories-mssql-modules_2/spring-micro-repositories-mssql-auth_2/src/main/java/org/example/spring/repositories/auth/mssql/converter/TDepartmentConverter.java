package org.example.spring.repositories.auth.mssql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.auth.mssql.table.dto.TDepartmentDTO;
import org.example.spring.repositories.auth.mssql.table.dto.TDepartmentRoleDTO;
import org.example.spring.repositories.auth.mssql.table.po.TDepartment;
import org.example.spring.repositories.auth.mssql.table.po.TDepartmentRole;
import org.example.spring.repositories.auth.mssql.table.query.TDepartmentQuery;
import org.example.spring.repositories.auth.mssql.table.vo.TDepartmentVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper(config = BaseBuilder.class)
@Deprecated
public interface TDepartmentConverter extends IBaseConverter<TDepartment, TDepartmentDTO, TDepartmentVo, TDepartmentQuery> {
    TDepartmentConverter instance = Mappers.getMapper(TDepartmentConverter.class);

    default List<TDepartmentRole> roles(Long id, List<Long> roleIds) {
        List<TDepartmentRole> departmentRoles = new ArrayList<>(roleIds.size());
        for (Long roleId : roleIds) {
            departmentRoles.add(role(id, roleId));
        }
        return departmentRoles;
    }

    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "departmentId", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    TDepartmentRole role(Long userId, Long roleId);

    void departmentCopy(TDepartmentVo tDepartmentVo, @MappingTarget TDepartment tDepartment);

    @Mapping(target = "roles", ignore = true)
    void copyDepartmentRoleDTO(TDepartment byId, @MappingTarget TDepartmentRoleDTO dto);
}
