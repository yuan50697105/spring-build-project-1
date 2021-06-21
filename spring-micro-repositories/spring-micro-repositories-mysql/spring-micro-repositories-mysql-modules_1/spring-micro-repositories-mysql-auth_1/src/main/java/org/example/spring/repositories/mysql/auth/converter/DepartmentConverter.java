package org.example.spring.repositories.mysql.auth.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.ICommonsConverter;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentRoleDTO;
import org.example.spring.repositories.commons.entity.auth.po.Department;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;
import org.example.spring.repositories.mysql.auth.table.po.TDepartment;
import org.example.spring.repositories.mysql.auth.table.query.TDepartmentQuery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface DepartmentConverter extends ICommonsConverter<Department, TDepartment, DepartmentQuery, TDepartmentQuery, DepartmentVo, DepartmentDTO> {
    DepartmentConverter CONVERTER = Mappers.getMapper(DepartmentConverter.class);

    @Mapping(target = "roles", ignore = true)
    DepartmentRoleDTO buildDepartmentRoleDTO(TDepartment byId);
}