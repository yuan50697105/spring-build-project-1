package org.example.spring.repositories.clients.patient.oracle.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealCheckItemDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealCheckItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealCheckItemVo;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientTeamMealCheckItemDTO;
import org.example.spring.repositories.patient.oracle.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientTeamMealCheckItemVo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PatientTeamMealCheckItemRepositoryConverter {
    TPatientTeamMealCheckItemVo build(PatientTeamMealCheckItemVo vo);

    TPatientTeamMealCheckItemVo[] build(PatientTeamMealCheckItemVo[] vo);

    List<TPatientTeamMealCheckItemVo> build(List<PatientTeamMealCheckItemVo> vo);

    TPatientTeamMealCheckItemQuery build(PatientTeamMealCheckItemQuery PatientTeamMealCheckItemQuery);

    PatientTeamMealCheckItemDTO buildDTO(TPatientTeamMealCheckItemDTO tPatientTeamMealCheckItemDTO);

    List<PatientTeamMealCheckItemDTO> buildDTO(List<TPatientTeamMealCheckItemDTO> listByIds);

    IPageData<PatientTeamMealCheckItemDTO> buildDTO(IPageData<TPatientTeamMealCheckItemDTO> queryPage);
}
