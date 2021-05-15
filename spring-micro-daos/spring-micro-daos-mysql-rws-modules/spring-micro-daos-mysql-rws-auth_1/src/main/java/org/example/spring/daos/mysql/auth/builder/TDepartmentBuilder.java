package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.po.TDepartment;
import org.example.spring.daos.mysql.auth.table.vo.TDepartmentVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TDepartmentBuilder {
    TDepartmentBuilder INSTANCE = Mappers.getMapper(TDepartmentBuilder.class);

    TDepartment buildDepartment(TDepartmentVo tDepartmentVo);
}
