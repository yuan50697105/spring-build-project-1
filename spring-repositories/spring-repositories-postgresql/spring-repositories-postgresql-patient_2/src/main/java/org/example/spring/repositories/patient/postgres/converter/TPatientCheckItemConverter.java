package org.example.spring.repositories.patient.postgres.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientCheckItem;
import org.example.spring.repositories.patient.postgres.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientCheckItemVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientCheckItemConverter extends IBaseConverter<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery> {
}
