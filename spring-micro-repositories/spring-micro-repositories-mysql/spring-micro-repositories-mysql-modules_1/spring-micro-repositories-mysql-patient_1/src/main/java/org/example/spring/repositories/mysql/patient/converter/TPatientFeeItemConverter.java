package org.example.spring.repositories.mysql.patient.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.mysql.patient.table.po.TPatientFeeItem;
import org.example.spring.repositories.mysql.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.mysql.patient.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientCheckItemVo;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientFeeItemVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientFeeItemConverter extends IBaseConverter<TPatientFeeItem, TPatientFeeItemDTO, TPatientFeeItemVo, TPatientFeeItemQuery> {
}
