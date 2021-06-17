package org.example.spring.repositories.mysql.patient.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientGroupDTO;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientMealDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatientGroup;
import org.example.spring.repositories.mysql.patient.table.po.TPatientMeal;
import org.example.spring.repositories.mysql.patient.table.query.TPatientGroupQuery;
import org.example.spring.repositories.mysql.patient.table.query.TPatientMealQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientGroupVo;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientMealVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientMealConverter extends IBaseConverter<TPatientMeal, TPatientMealDTO, TPatientMealVo, TPatientMealQuery> {
}