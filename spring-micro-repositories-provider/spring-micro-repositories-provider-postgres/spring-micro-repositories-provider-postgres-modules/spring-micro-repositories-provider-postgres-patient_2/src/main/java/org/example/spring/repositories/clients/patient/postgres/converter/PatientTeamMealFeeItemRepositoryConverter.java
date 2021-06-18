package org.example.spring.repositories.clients.patient.postgres.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealFeeItemDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealFeeItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealFeeItemVo;
import org.example.spring.repositories.postgres.patient.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.postgres.patient.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.postgres.patient.table.vo.TPatientTeamMealFeeItemVo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PatientTeamMealFeeItemRepositoryConverter {
    TPatientTeamMealFeeItemVo build(PatientTeamMealFeeItemVo vo);

    TPatientTeamMealFeeItemVo[] build(PatientTeamMealFeeItemVo[] vo);

    List<TPatientTeamMealFeeItemVo> build(List<PatientTeamMealFeeItemVo> vo);

    TPatientTeamMealFeeItemQuery build(PatientTeamMealFeeItemQuery PatientTeamMealFeeItemQuery);

    PatientTeamMealFeeItemDTO buildDTO(TPatientTeamMealFeeItemDTO tPatientTeamMealFeeItemDTO);

    List<PatientTeamMealFeeItemDTO> buildDTO(List<TPatientTeamMealFeeItemDTO> listByIds);

    IPageData<PatientTeamMealFeeItemDTO> buildDTO(IPageData<TPatientTeamMealFeeItemDTO> queryPage);
}
