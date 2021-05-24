package org.example.spring.daos.mssql.auth.converter;

import org.example.spring.daos.mssql.auth.table.dto.TDepartmentDto;
import org.example.spring.daos.mssql.auth.table.po.TDepartment;
import org.example.spring.daos.mssql.auth.table.query.TDepartmentQuery;
import org.example.spring.daos.mssql.auth.table.vo.TDepartmentVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TDepartmentConverter extends IBaseConverter<TDepartment, TDepartmentDto, TDepartmentVo, TDepartmentQuery> {
    TDepartmentConverter CONVERTER = Mappers.getMapper(TDepartmentConverter.class);
}
