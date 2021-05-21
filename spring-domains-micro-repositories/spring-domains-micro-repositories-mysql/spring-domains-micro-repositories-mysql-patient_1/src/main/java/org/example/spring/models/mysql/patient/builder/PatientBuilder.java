package org.example.spring.models.mysql.patient.builder;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface PatientBuilder {
}
