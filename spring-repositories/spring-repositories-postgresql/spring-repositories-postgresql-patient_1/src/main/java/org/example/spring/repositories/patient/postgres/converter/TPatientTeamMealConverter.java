package org.example.spring.repositories.patient.postgres.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientTeamMeal;
import org.example.spring.repositories.patient.postgres.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientTeamMealVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientTeamMealConverter extends IBaseConverter<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery> {
}
