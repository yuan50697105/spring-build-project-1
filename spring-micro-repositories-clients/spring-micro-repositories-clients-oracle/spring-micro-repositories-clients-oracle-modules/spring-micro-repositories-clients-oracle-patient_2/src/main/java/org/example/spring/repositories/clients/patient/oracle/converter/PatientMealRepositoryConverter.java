package org.example.spring.repositories.clients.patient.oracle.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.patient.dto.PatientMealDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientMealQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientMealVo;
import org.example.spring.repositories.oracle.patient.table.dto.TPatientMealDTO;
import org.example.spring.repositories.oracle.patient.table.query.TPatientMealQuery;
import org.example.spring.repositories.oracle.patient.table.vo.TPatientMealVo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PatientMealRepositoryConverter {
    TPatientMealVo build(PatientMealVo vo);

    TPatientMealVo[] build(PatientMealVo[] vo);

    List<TPatientMealVo> build(List<PatientMealVo> vo);

    TPatientMealQuery build(PatientMealQuery PatientMealQuery);

    PatientMealDTO buildDTO(TPatientMealDTO tPatientMealDTO);

    List<PatientMealDTO> buildDTO(List<TPatientMealDTO> listByIds);

    IPageData<PatientMealDTO> buildDTO(IPageData<TPatientMealDTO> queryPage);
}
