package org.example.spring.infrastructures.mysql.patient.builder;

import org.example.spring.infrastructures.commons.BaseBuilder;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.Patient;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientGroupVo;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientVo;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatient;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroup;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.mapstruct.*;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PatientBuilder {
    TPatient buildPatient(PatientVo patient);

    void copyPatient(PatientVo patient, @MappingTarget TPatient tPatient);

    Patient buildPatientResult(TPatient patient);

    TPatientQuery buildPatientQuery(PatientQuery patientQuery);

    IPageData<Patient> buildPatientResult(IPageData<TPatient> queryPage);

    List<Patient> buildPatientResult(List<TPatient> queryPage);

    TPatientGroup buildPatientGroupItem(PatientGroupVo item);
}
