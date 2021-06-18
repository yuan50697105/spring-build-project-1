package org.example.spring.repositories.clients.patient.oracle.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.patient.dto.PatientFeeItemDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientFeeItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientFeeItemVo;
import org.example.spring.repositories.oracle.patient.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.oracle.patient.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.oracle.patient.table.vo.TPatientFeeItemVo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PatientFeeItemRepositoryConverter {
    TPatientFeeItemVo build(PatientFeeItemVo vo);

    TPatientFeeItemVo[] build(PatientFeeItemVo[] vo);

    List<TPatientFeeItemVo> build(List<PatientFeeItemVo> vo);

    TPatientFeeItemQuery build(PatientFeeItemQuery PatientFeeItemQuery);

    PatientFeeItemDTO buildDTO(TPatientFeeItemDTO tPatientFeeItemDTO);

    List<PatientFeeItemDTO> buildDTO(List<TPatientFeeItemDTO> listByIds);

    IPageData<PatientFeeItemDTO> buildDTO(IPageData<TPatientFeeItemDTO> queryPage);
}
