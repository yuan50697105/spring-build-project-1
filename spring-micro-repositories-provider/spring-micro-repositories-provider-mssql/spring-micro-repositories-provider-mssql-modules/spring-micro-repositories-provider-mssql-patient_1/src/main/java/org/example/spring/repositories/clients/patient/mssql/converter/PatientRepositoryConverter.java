package org.example.spring.repositories.clients.patient.mssql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.patient.dto.PatientDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientVo;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientDTO;
import org.example.spring.repositories.patient.mssql.table.query.TPatientQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientVo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PatientRepositoryConverter {
    TPatientVo build(PatientVo vo);

    TPatientVo[] build(PatientVo[] vo);

    List<TPatientVo> build(List<PatientVo> vo);

    TPatientQuery build(PatientQuery patientQuery);

    PatientDTO buildDTO(TPatientDTO tPatientDTO);

    List<PatientDTO> buildDTO(List<TPatientDTO> listByIds);

    IPageData<PatientDTO> buildDTO(IPageData<TPatientDTO> queryPage);
}
