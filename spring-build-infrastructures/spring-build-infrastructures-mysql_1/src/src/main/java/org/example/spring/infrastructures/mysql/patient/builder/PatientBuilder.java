package org.example.spring.infrastructures.mysql.patient.builder;

import org.example.spring.infrastructures.mysql.patient.entity.query.PatientGroupQuery;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.Patient;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroup;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroupItem;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientGroupVo;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientVo;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatient;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroup;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroupItem;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientGroupQuery;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface PatientBuilder {
    TPatient buildPatient(PatientVo patient);

    void copyPatient(PatientVo patient, @MappingTarget TPatient tPatient);

    Patient buildPatientResult(TPatient patient);

    TPatientQuery buildPatientQuery(PatientQuery patientQuery);

    IPageData<Patient> buildPatientResult(IPageData<TPatient> queryPage);

    List<Patient> buildPatientResult(List<TPatient> queryPage);

    TPatientGroup buildPatientGroup(PatientGroupVo group);

    @Mapping(target = "id", ignore = true)
    void copyPatientGroup(PatientGroupVo group, @MappingTarget TPatientGroup tPatientGroup);

    PatientGroup buildPatientGroupResult(TPatientGroup group);

    List<PatientGroupItem> buildPatientGroupItemResult(List<TPatientGroupItem> items);

    TPatientGroupQuery buildPatientGroupQuery(PatientGroupQuery patientGroupQuery);

    IPageData<PatientGroup> buildPatientGroupResult(IPageData<TPatientGroup> data);

    List<PatientGroup> buildPatientGroupResult(List<TPatientGroup> data);
}
