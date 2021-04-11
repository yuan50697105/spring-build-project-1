package org.example.spring.infrastructures.mysql.patient.builder;

import org.example.spring.infrastructures.commons.BaseBuilder;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.Patient;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientGroupItemVo;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientVo;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatient;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroupItem;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.mapstruct.*;

import java.util.List;
import java.util.Optional;

@Mapper(config = BaseBuilder.class)
public interface PatientBuilder {
    TPatient buildPatient(PatientVo patient);

    void copyPatient(PatientVo patient, @MappingTarget TPatient tPatient);

    Patient buildPatientResult(TPatient patient);

    TPatientQuery buildPatientQuery(PatientQuery patientQuery);

    IPageData<Patient> buildPatientResult(IPageData<TPatient> queryPage);

    List<Patient> buildPatientResult(List<TPatient> queryPage);

    TPatientGroupItem buildPatientGroupItem(PatientGroupItemVo item);
}
