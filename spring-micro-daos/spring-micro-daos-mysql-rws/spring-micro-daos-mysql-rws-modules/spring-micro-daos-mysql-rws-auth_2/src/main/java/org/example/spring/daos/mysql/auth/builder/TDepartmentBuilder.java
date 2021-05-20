package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.dto.TDepartmentDTO;
import org.example.spring.daos.mysql.auth.table.dto.TDepartmentRoleDTO;
import org.example.spring.daos.mysql.auth.table.po.TDepartment;
import org.example.spring.daos.mysql.auth.table.vo.TDepartmentVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Stream;

@Mapper(config = BaseBuilder.class)
public interface TDepartmentBuilder {
    TDepartmentBuilder instance = Mappers.getMapper(TDepartmentBuilder.class);

    TDepartment toPo(TDepartmentVo vo);

    void copy(TDepartment department, @MappingTarget TDepartment tDepartment);

    @Mapping(target = "roles", ignore = true)
    TDepartmentRoleDTO toDTO(TDepartmentDTO tDepartmentDTO);

    TDepartmentDTO toDTO(TDepartment byId);

    List<TDepartmentDTO> toDTO(List<TDepartment> queryList);

    Stream<TDepartmentDTO> toDTO(Stream<TDepartment> queryListStream);

    IPageData<TDepartmentDTO> toDTO(IPageData<TDepartment> selectPage);
}
