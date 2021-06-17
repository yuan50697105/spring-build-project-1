package org.example.spring.repositories.oracle.patient.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.oracle.patient.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.oracle.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.oracle.patient.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.oracle.patient.table.vo.TPatientTeamMealFeeItemVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientTeamMealFeeItemConverter extends IBaseConverter<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery> {
}
