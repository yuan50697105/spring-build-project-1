package org.example.spring.repositories.patient.mysql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientCheckItem;
import org.example.spring.repositories.patient.mysql.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientCheckItemVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientCheckItemConverter extends IBaseConverter<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery> {
}
