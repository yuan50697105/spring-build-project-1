package org.example.spring.repositories.clients.patient.oracle.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.patient.dto.PatientCheckItemDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientCheckItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientCheckItemVo;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.patient.oracle.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientCheckItemVo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PatientCheckItemRepositoryConverter {
    TPatientCheckItemVo build(PatientCheckItemVo vo);

    TPatientCheckItemVo[] build(PatientCheckItemVo[] vo);

    List<TPatientCheckItemVo> build(List<PatientCheckItemVo> vo);

    TPatientCheckItemQuery build(PatientCheckItemQuery PatientCheckItemQuery);

    PatientCheckItemDTO buildDTO(TPatientCheckItemDTO tPatientCheckItemDTO);

    List<PatientCheckItemDTO> buildDTO(List<TPatientCheckItemDTO> listByIds);

    IPageData<PatientCheckItemDTO> buildDTO(IPageData<TPatientCheckItemDTO> queryPage);
}
