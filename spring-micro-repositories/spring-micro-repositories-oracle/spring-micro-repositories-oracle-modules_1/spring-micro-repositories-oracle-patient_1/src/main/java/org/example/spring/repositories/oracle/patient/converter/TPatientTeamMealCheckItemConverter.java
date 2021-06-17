package org.example.spring.repositories.oracle.patient.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.oracle.patient.table.dto.TPatientTeamMealCheckItemDTO;
import org.example.spring.repositories.oracle.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.oracle.patient.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.repositories.oracle.patient.table.vo.TPatientTeamMealCheckItemVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientTeamMealCheckItemConverter extends IBaseConverter<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemDTO, TPatientTeamMealCheckItemVo, TPatientTeamMealCheckItemQuery> {
}
