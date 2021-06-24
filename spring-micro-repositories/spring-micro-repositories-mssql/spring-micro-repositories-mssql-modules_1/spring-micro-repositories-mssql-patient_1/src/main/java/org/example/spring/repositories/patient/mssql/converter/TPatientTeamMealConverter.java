package org.example.spring.repositories.patient.mssql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientTeamMeal;
import org.example.spring.repositories.patient.mssql.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientTeamMealVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientTeamMealConverter extends IBaseConverter<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery> {
}
