package org.example.spring.infrastructures.mysql.patient.builder;

import org.example.spring.infrastructures.commons.BaseBuilder;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientGroupQuery;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientQuery;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientTeamQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.Patient;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroup;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientTeam;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientGroupVo;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientTeamVo;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientVo;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatient;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroup;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeam;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientGroupQuery;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientQuery;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientTeamQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.mapstruct.*;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PatientBuilder {
    TPatient buildPatient(PatientVo patient);

    void copyPatient(PatientVo patient, @MappingTarget TPatient tPatient);

    TPatientQuery buildPatientQuery(PatientQuery patientQuery);

    Patient buildPatientResult(TPatient data);

    IPageData<Patient> buildPatientResult(IPageData<TPatient> data);

    List<Patient> buildPatientResult(List<TPatient> data);

    TPatientGroup buildPatientGroup(PatientGroupVo item);

    TPatientTeam buildPatientTeam(PatientTeamVo teamVo);

    void copyPatientTeam(PatientTeamVo team, @MappingTarget TPatientTeam tPatientTeam);

    PatientTeam buildPatientTeamResult(TPatientTeam team);

    TPatientTeamQuery buildPatientTeamQuery(PatientTeamQuery patientTeamQuery);

    IPageData<PatientTeam> buildPatientTeamResult(IPageData<TPatientTeam> data);

    List<PatientTeam> buildPatientTeamResult(List<TPatientTeam> data);

    void copyPatientGroup(PatientGroupVo group, @MappingTarget TPatientGroup tPatientGroup);

    PatientGroup buildPatientGroupResult(TPatientGroup group);

    TPatientGroupQuery buildPatientGroupQuery(PatientGroupQuery patientGroupQuery);

    IPageData<PatientGroup> buildPatientGroupResult(IPageData<TPatientGroup> queryPage);

    List<PatientGroup> buildPatientGroupResult(List<TPatientGroup> data);

}
