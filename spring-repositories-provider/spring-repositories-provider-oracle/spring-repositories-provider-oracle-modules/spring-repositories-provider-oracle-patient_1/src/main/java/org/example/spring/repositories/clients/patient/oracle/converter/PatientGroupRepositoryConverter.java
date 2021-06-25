package org.example.spring.repositories.clients.patient.oracle.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.patient.dto.PatientGroupDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientGroupQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientGroupVo;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientGroupDTO;
import org.example.spring.repositories.patient.oracle.table.query.TPatientGroupQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientGroupVo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PatientGroupRepositoryConverter {
    TPatientGroupVo build(PatientGroupVo vo);

    TPatientGroupVo[] build(PatientGroupVo[] vo);

    List<TPatientGroupVo> build(List<PatientGroupVo> vo);

    TPatientGroupQuery build(PatientGroupQuery PatientGroupQuery);

    PatientGroupDTO buildDTO(TPatientGroupDTO tPatientGroupDTO);

    List<PatientGroupDTO> buildDTO(List<TPatientGroupDTO> listByIds);

    IPageData<PatientGroupDTO> buildDTO(IPageData<TPatientGroupDTO> queryPage);
}
