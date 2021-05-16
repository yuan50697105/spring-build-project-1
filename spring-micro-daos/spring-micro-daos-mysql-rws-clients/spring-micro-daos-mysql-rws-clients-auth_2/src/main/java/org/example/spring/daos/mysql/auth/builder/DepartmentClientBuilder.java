package org.example.spring.daos.mysql.auth.builder;

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
public interface DepartmentClientBuilder {
    DepartmentClientBuilder INSTANCE = Mappers.getMapper(DepartmentClientBuilder.class);

    TDepartmentVo build(DepartmentVo departmentVo);

    TDepartmentQuery query(DepartmentQuery query);

    DepartmentDTO buildDTO(TDepartmentDTO tDepartmentDTO);

    List<DepartmentDTO> buildDTO(List<TDepartmentDTO> list);

    IPageData<DepartmentDTO> buildDTO(IPageData<TDepartmentDTO> data);
}
