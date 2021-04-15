package org.example.spring.models.patient.builder;

import org.example.spring.infrastructures.commons.BaseBuilder;
import org.example.spring.infrastructures.es.patient.entity.po.TPatientGroup;
import org.example.spring.models.patient.entity.query.PatientGroupQuery;
import org.example.spring.models.patient.entity.query.PatientQuery;
import org.example.spring.models.patient.entity.query.PatientTeamMealQuery;
import org.example.spring.models.patient.entity.query.PatientTeamQuery;
import org.example.spring.models.patient.entity.result.*;
import org.example.spring.models.patient.entity.vo.*;
import org.example.spring.infrastructures.es.patient.entity.query.TPatientGroupQuery;
import org.example.spring.infrastructures.es.patient.entity.query.TPatientQuery;
import org.example.spring.infrastructures.es.patient.entity.query.TPatientTeamMealQuery;
import org.example.spring.infrastructures.es.patient.entity.query.TPatientTeamQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.mapstruct.*;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PatientBuilder {
    org.example.spring.infrastructures.es.patient.entity.po.TPatient buildPatient(PatientVo patient);

    void copyPatient(PatientVo patient, @MappingTarget org.example.spring.infrastructures.es.patient.entity.po.TPatient tPatient);

    TPatientQuery buildPatientQuery(PatientQuery patientQuery);

    Patient buildPatientResult(org.example.spring.infrastructures.es.patient.entity.po.TPatient data);

    IPageData<Patient> buildPatientResult(IPageData<org.example.spring.infrastructures.es.patient.entity.po.TPatient> data);

    List<Patient> buildPatientResult(List<org.example.spring.infrastructures.es.patient.entity.po.TPatient> data);

    org.example.spring.infrastructures.es.patient.entity.po.TPatientGroup buildPatientGroup(PatientGroupVo item);

    org.example.spring.infrastructures.es.patient.entity.po.TPatientTeam buildPatientTeam(PatientTeamVo teamVo);

    void copyPatientTeam(PatientTeamVo team, @MappingTarget org.example.spring.infrastructures.es.patient.entity.po.TPatientTeam tPatientTeam);

    PatientTeam buildPatientTeamResult(org.example.spring.infrastructures.es.patient.entity.po.TPatientTeam team);

    TPatientTeamQuery buildPatientTeamQuery(PatientTeamQuery patientTeamQuery);

    IPageData<PatientTeam> buildPatientTeamResult(IPageData<org.example.spring.infrastructures.es.patient.entity.po.TPatientTeam> data);

    List<PatientTeam> buildPatientTeamResult(List<org.example.spring.infrastructures.es.patient.entity.po.TPatientTeam> data);

    void copyPatientGroup(PatientGroupVo group, @MappingTarget org.example.spring.infrastructures.es.patient.entity.po.TPatientGroup tPatientGroup);

    PatientGroup buildPatientGroupResult(org.example.spring.infrastructures.es.patient.entity.po.TPatientGroup group);

    TPatientGroupQuery buildPatientGroupQuery(PatientGroupQuery patientGroupQuery);

    IPageData<PatientGroup> buildPatientGroupResult(IPageData<org.example.spring.infrastructures.es.patient.entity.po.TPatientGroup> queryPage);

    List<PatientGroup> buildPatientGroupResult(List<TPatientGroup> data);

    org.example.spring.infrastructures.es.patient.entity.po.TPatientTeamMeal buildPatientTeamMeal(PatientTeamMealVo meal);

    void copyPatientTeamMeal(PatientTeamMealVo meal, @MappingTarget org.example.spring.infrastructures.es.patient.entity.po.TPatientTeamMeal patientTeamMeal);

    TPatientTeamMealQuery buildPatientTeamMealQuery(PatientTeamMealQuery patientTeamMealQuery);

    PatientTeamMeal buildPatientTeamMealResult(org.example.spring.infrastructures.es.patient.entity.po.TPatientTeamMeal meal);

    List<PatientTeamMeal> buildPatientTeamMealResult(List<org.example.spring.infrastructures.es.patient.entity.po.TPatientTeamMeal> meal);

    IPageData<PatientTeamMeal> buildPatientTeamMealResult(IPageData<org.example.spring.infrastructures.es.patient.entity.po.TPatientTeamMeal> meal);

    org.example.spring.infrastructures.es.patient.entity.po.TPatientTeamMealFeeItem buildPatientTeamMealFeeItem(PatientTeamMealFeeItemVo feeItemVo);

    List<org.example.spring.infrastructures.es.patient.entity.po.TPatientTeamMealCheckItem> buildPatientTeamMealCheckItem(List<PatientTeamMealCheckItemVo> checkItems);

    org.example.spring.infrastructures.es.patient.entity.po.TPatientTeamMealCheckItem buildPatientTeamMealCheckItem(PatientTeamMealCheckItemVo checkItem);

    List<PatientTeamMealFeeItem> buildPatientTeamMealFeeItemResult(List<org.example.spring.infrastructures.es.patient.entity.po.TPatientTeamMealFeeItem> listByTeamMealId);

    org.example.spring.infrastructures.es.patient.entity.po.TPatientFeeItem buildPatientFeeItem(PatientFeeItemVo patientFeeItemVo);

    org.example.spring.infrastructures.es.patient.entity.po.TPatientMeal buildPatientMeal(PatientMealVo meal);

    org.example.spring.infrastructures.es.patient.entity.po.TPatientCheckItem buildPatientCheckItem(PatientCheckItemVo checkItem);
}
