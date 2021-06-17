package org.example.spring.repositories.postgres.patient.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.postgres.patient.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.postgres.patient.table.po.TPatientFeeItem;
import org.example.spring.repositories.postgres.patient.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.postgres.patient.table.vo.TPatientFeeItemVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientFeeItemConverter extends IBaseConverter<TPatientFeeItem, TPatientFeeItemDTO, TPatientFeeItemVo, TPatientFeeItemQuery> {
}
