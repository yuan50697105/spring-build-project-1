package org.example.spring.repositories.clients.patient.mysql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamVo;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.patient.mysql.table.query.TPatientTeamQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientTeamVo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PatientTeamRepositoryConverter {
    TPatientTeamVo build(PatientTeamVo vo);

    TPatientTeamVo[] build(PatientTeamVo[] vo);

    List<TPatientTeamVo> build(List<PatientTeamVo> vo);

    TPatientTeamQuery build(PatientTeamQuery PatientTeamQuery);

    PatientTeamDTO buildDTO(TPatientTeamDTO tPatientTeamDTO);

    List<PatientTeamDTO> buildDTO(List<TPatientTeamDTO> listByIds);

    IPageData<PatientTeamDTO> buildDTO(IPageData<TPatientTeamDTO> queryPage);
}
