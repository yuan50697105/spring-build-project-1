package org.example.spring.models.mysql.patient.builder;

import org.example.spring.daos.mysql.patient.table.po.TPatientGroup;
import org.example.spring.daos.mysql.patient.table.query.TPatientGroupQuery;
import org.example.spring.daos.mysql.patient.table.vo.TPatientGroupVo;
import org.example.spring.daos.mysql.patient.table.vo.TPatientTeamMealVo;
import org.example.spring.models.mysql.patient.entity.query.PatientGroupQuery;
import org.example.spring.models.mysql.patient.entity.result.PatientGroup;
import org.example.spring.models.mysql.patient.entity.result.PatientGroupDetails;
import org.example.spring.models.mysql.patient.entity.vo.PatientGroupFormVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PatientGroupBuilder {
    TPatientGroup buildPatientGroup(TPatientGroupVo group);

    void copyPatientGroup(TPatientGroupVo group, @MappingTarget TPatientGroup tPatientGroup);

    PatientGroup buildPatientGroupResult(TPatientGroup byId);

    TPatientGroupQuery buildPatientGroupQuery(PatientGroupQuery patientGroupQuery);

    IPageData<PatientGroup> buildPatientGroupResult(IPageData<TPatientGroup> data);

    List<PatientGroup> buildPatientGroupResult(List<TPatientGroup> data);

    TPatientGroupVo buildPatientGroup2(PatientGroupFormVo patientGroupFormVo);

    PatientGroupDetails buildPatientGroupResult2(TPatientGroup byId);

    TPatientTeamMealVo buildPatientGroup3(PatientGroupFormVo patientGroupFormVo);
}
