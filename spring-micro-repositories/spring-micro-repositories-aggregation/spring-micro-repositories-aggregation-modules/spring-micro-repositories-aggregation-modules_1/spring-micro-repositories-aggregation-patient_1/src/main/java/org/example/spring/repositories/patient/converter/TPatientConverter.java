package org.example.spring.repositories.patient.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.patient.table.dto.TPatientDTO;
import org.example.spring.repositories.patient.table.po.TPatient;
import org.example.spring.repositories.patient.table.query.TPatientQuery;
import org.example.spring.repositories.patient.table.vo.TPatientVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TPatientConverter extends IBaseConverter<TPatient, TPatientDTO, TPatientVo, TPatientQuery> {
    TPatientConverter CONVERTER = Mappers.getMapper(TPatientConverter.class);
}
