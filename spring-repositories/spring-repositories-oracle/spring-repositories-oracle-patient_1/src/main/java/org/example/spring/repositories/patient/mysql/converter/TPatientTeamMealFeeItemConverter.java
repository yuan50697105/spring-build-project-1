package org.example.spring.repositories.patient.mysql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.patient.mysql.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientTeamMealFeeItemVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientTeamMealFeeItemConverter extends IBaseConverter<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery> {
}
