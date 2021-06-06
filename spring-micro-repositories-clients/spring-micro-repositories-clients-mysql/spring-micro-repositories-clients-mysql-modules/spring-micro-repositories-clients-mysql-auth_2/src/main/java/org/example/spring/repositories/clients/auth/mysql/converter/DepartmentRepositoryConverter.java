package org.example.spring.repositories.clients.auth.mysql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.auth.vo.DepartmentVo;
import org.example.spring.repositories.mysql.auth.table.dto.TDepartmentDTO;
import org.example.spring.repositories.mysql.auth.table.query.TDepartmentQuery;
import org.example.spring.repositories.mysql.auth.table.vo.TDepartmentVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Stream;

@Mapper(config = BaseBuilder.class)
public interface DepartmentRepositoryConverter {
    DepartmentRepositoryConverter CONVERTER = Mappers.getMapper(DepartmentRepositoryConverter.class);

    TDepartmentVo build(DepartmentVo vo);

    DepartmentDTO build(TDepartmentDTO tDepartmentDTO);

    TDepartmentQuery build(DepartmentQuery query);

    List<DepartmentDTO> build(List<TDepartmentDTO> queryList);

    IPageData<DepartmentDTO> build(IPageData<TDepartmentDTO> queryPage);

    Stream<DepartmentDTO> build(Stream<TDepartmentDTO> queryStream);
}
