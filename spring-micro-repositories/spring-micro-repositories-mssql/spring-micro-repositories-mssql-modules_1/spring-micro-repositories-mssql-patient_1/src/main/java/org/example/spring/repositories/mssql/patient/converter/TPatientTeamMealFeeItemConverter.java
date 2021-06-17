package org.example.spring.repositories.mssql.patient.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.mssql.patient.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.mssql.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.mssql.patient.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.mssql.patient.table.vo.TPatientTeamMealFeeItemVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientTeamMealFeeItemConverter extends IBaseConverter<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery> {
}
