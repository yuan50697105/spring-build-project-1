package org.example.spring.repositories.clients.auth.postgres.converter;


import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.auth.postgres.table.dto.TDepartmentDTO;
import org.example.spring.repositories.auth.postgres.table.dto.TDepartmentRoleDTO;
import org.example.spring.repositories.auth.postgres.table.query.TDepartmentQuery;
import org.example.spring.repositories.auth.postgres.table.vo.TDepartmentVo;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentRoleDTO;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Stream;

@Mapper(config = BaseBuilder.class)
public interface DepartmentRepositoryConverter {
    DepartmentRepositoryConverter CONVERTER = Mappers.getMapper(DepartmentRepositoryConverter.class);

    TDepartmentVo buildVo(DepartmentVo vo);

    DepartmentDTO build(TDepartmentDTO tDepartmentDTO);

    TDepartmentQuery build(DepartmentQuery query);

    List<DepartmentDTO> build(List<TDepartmentDTO> queryList);

    IPageData<DepartmentDTO> build(IPageData<TDepartmentDTO> queryPage);

    Stream<DepartmentDTO> build(Stream<TDepartmentDTO> queryStream);

    List<TDepartmentVo> buildVo(List<DepartmentVo> list);

    DepartmentRoleDTO build2(TDepartmentRoleDTO details);
}
