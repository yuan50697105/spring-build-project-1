package org.example.spring.repositories.oracle.auth.converter;

import org.example.spring.repositories.oracle.auth.table.dto.TDepartmentDTO;
import org.example.spring.repositories.oracle.auth.table.dto.TDepartmentRoleDTO;
import org.example.spring.repositories.oracle.auth.table.po.TDepartment;
import org.example.spring.repositories.oracle.auth.table.po.TDepartmentRole;
import org.example.spring.repositories.oracle.auth.table.query.TDepartmentQuery;
import org.example.spring.repositories.oracle.auth.table.vo.TDepartmentVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TDepartmentConverter extends IBaseConverter<TDepartment, TDepartmentDTO, TDepartmentVo, TDepartmentQuery> {
    TDepartmentConverter instance = Mappers.getMapper(TDepartmentConverter.class);

    TDepartment department(TDepartmentVo tDepartmentVo);

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

    TDepartmentRoleDTO department(TDepartmentDTO tDepartmentDTO);
}
