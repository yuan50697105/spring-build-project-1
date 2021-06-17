package org.example.spring.repositories.mysql.patient.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientGroupDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatientFeeItem;
import org.example.spring.repositories.mysql.patient.table.po.TPatientGroup;
import org.example.spring.repositories.mysql.patient.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.mysql.patient.table.query.TPatientGroupQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientFeeItemVo;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientGroupVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientGroupConverter extends IBaseConverter<TPatientGroup, TPatientGroupDTO, TPatientGroupVo, TPatientGroupQuery> {
}
