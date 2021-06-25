package org.example.spring.repositories.patient.mssql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientTeamMealCheckItemDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.patient.mssql.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientTeamMealCheckItemVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientTeamMealCheckItemConverter extends IBaseConverter<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemDTO, TPatientTeamMealCheckItemVo, TPatientTeamMealCheckItemQuery> {
}
