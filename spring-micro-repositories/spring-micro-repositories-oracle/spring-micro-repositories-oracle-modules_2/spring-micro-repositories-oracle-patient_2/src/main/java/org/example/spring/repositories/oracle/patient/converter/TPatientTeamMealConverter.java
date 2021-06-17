package org.example.spring.repositories.oracle.patient.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.oracle.patient.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.oracle.patient.table.po.TPatientTeamMeal;
import org.example.spring.repositories.oracle.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.oracle.patient.table.vo.TPatientTeamMealVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientTeamMealConverter extends IBaseConverter<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery> {
}
