package org.example.spring.repositories.patient.mssql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientTeam;
import org.example.spring.repositories.patient.mssql.table.query.TPatientTeamQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientTeamVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TPatientTeamConverter extends IBaseConverter<TPatientTeam, TPatientTeamDTO, TPatientTeamVo, TPatientTeamQuery> {
}
