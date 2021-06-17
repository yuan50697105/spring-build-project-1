package org.example.spring.repositories.mysql.patient.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeam;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeamMeal;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientTeamMealVo;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientTeamVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientTeamMealConverter extends IBaseConverter<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery> {
}
