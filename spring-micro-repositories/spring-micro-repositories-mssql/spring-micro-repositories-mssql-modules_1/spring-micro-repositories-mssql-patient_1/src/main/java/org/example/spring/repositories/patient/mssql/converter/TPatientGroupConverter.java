package org.example.spring.repositories.patient.mssql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientGroupDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientGroup;
import org.example.spring.repositories.patient.mssql.table.query.TPatientGroupQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientGroupVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientGroupConverter extends IBaseConverter<TPatientGroup, TPatientGroupDTO, TPatientGroupVo, TPatientGroupQuery> {
}
