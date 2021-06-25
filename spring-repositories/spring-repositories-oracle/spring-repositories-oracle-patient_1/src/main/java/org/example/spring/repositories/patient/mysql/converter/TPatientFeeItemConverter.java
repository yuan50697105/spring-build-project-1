package org.example.spring.repositories.patient.oracle.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientFeeItem;
import org.example.spring.repositories.patient.oracle.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientFeeItemVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientFeeItemConverter extends IBaseConverter<TPatientFeeItem, TPatientFeeItemDTO, TPatientFeeItemVo, TPatientFeeItemQuery> {
}
