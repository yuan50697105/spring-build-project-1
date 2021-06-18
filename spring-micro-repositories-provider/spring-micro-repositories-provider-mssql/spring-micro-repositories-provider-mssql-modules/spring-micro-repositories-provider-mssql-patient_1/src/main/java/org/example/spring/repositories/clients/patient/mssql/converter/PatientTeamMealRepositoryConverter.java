package org.example.spring.repositories.clients.patient.mssql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealVo;
import org.example.spring.repositories.mssql.patient.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.mssql.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.mssql.patient.table.vo.TPatientTeamMealVo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PatientTeamMealRepositoryConverter {
    TPatientTeamMealVo build(PatientTeamMealVo vo);

    TPatientTeamMealVo[] build(PatientTeamMealVo[] vo);

    List<TPatientTeamMealVo> build(List<PatientTeamMealVo> vo);

    TPatientTeamMealQuery build(PatientTeamMealQuery PatientTeamMealQuery);

    PatientTeamMealDTO buildDTO(TPatientTeamMealDTO tPatientTeamMealDTO);

    List<PatientTeamMealDTO> buildDTO(List<TPatientTeamMealDTO> listByIds);

    IPageData<PatientTeamMealDTO> buildDTO(IPageData<TPatientTeamMealDTO> queryPage);
}
