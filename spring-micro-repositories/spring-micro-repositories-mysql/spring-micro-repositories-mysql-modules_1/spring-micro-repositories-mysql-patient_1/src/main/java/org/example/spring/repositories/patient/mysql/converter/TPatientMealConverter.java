package org.example.spring.repositories.patient.mysql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientMealDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientMeal;
import org.example.spring.repositories.patient.mysql.table.query.TPatientMealQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientMealVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientMealConverter extends IBaseConverter<TPatientMeal, TPatientMealDTO, TPatientMealVo, TPatientMealQuery> {
}
