package org.example.spring.repositories.patient.oracle.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.patient.oracle.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientTeamMealFeeItemVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientTeamMealFeeItemConverter extends IBaseConverter<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery> {
}
