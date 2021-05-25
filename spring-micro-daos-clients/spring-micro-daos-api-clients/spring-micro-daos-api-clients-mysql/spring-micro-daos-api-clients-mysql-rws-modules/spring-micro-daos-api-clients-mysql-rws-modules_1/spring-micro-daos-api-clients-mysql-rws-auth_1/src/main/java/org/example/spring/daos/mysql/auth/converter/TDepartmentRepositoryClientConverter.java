package org.example.spring.daos.mysql.auth.converter;

import org.example.spring.daos.mysql.auth.entity.dto.DepartmentDTO;
import org.example.spring.daos.mysql.auth.entity.query.DepartmentQuery;
import org.example.spring.daos.mysql.auth.entity.vo.DepartmentVo;
import org.example.spring.daos.mysql.auth.table.dto.TDepartmentDTO;
import org.example.spring.daos.mysql.auth.table.query.TDepartmentQuery;
import org.example.spring.daos.mysql.auth.table.vo.TDepartmentVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TDepartmentRepositoryClientConverter {
    TDepartmentRepositoryClientConverter instance = Mappers.getMapper(TDepartmentRepositoryClientConverter.class);

    TDepartmentVo build(DepartmentVo departmentVo);

    DepartmentDTO build(TDepartmentDTO tDepartmentDTO);

    TDepartmentQuery build(DepartmentQuery query);

    IPageData<DepartmentDTO> build(IPageData<TDepartmentDTO> data);

    List<DepartmentDTO> build(List<TDepartmentDTO> list);
}
