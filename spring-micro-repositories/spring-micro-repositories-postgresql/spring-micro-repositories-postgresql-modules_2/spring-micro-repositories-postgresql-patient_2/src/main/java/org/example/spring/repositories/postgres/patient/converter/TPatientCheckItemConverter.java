package org.example.spring.repositories.postgres.patient.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.postgres.patient.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.postgres.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.postgres.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.postgres.patient.table.vo.TPatientCheckItemVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientCheckItemConverter extends IBaseConverter<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery> {
}
