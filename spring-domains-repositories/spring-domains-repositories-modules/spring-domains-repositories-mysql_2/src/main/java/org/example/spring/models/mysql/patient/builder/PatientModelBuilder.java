package org.example.spring.models.mysql.patient.builder;

import org.example.spring.daos.mysql.patient.table.po.*;
import org.example.spring.daos.mysql.patient.table.query.TPatientGroupQuery;
import org.example.spring.daos.mysql.patient.table.query.TPatientQuery;
import org.example.spring.daos.mysql.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.daos.mysql.patient.table.query.TPatientTeamQuery;
import org.example.spring.daos.mysql.patient.table.vo.*;
import org.example.spring.models.mysql.patient.entity.query.PatientGroupQuery;
import org.example.spring.models.mysql.patient.entity.query.PatientQuery;
import org.example.spring.models.mysql.patient.entity.query.PatientTeamMealQuery;
import org.example.spring.models.mysql.patient.entity.query.PatientTeamQuery;
import org.example.spring.models.mysql.patient.entity.result.*;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PatientModelBuilder {
    TPatient buildPatient(TPatientVo patient);

    void copyPatient(TPatientVo patient, @MappingTarget TPatient tPatient);

    TPatientQuery buildPatientQuery(PatientQuery patientQuery);

    Patient buildPatientResult(TPatient data);

    IPageData<Patient> buildPatientResult(IPageData<TPatient> data);

    List<Patient> buildPatientResult(List<TPatient> data);

    TPatientGroup buildPatientGroup(TPatientGroupVo item);

    TPatientTeam buildPatientTeam(TPatientTeamVo teamVo);

    void copyPatientTeam(TPatientTeamVo team, @MappingTarget TPatientTeam tPatientTeam);

    PatientTeam buildPatientTeamResult(TPatientTeam team);

    TPatientTeamQuery buildPatientTeamQuery(PatientTeamQuery patientTeamQuery);

    IPageData<PatientTeam> buildPatientTeamResult(IPageData<TPatientTeam> data);

    List<PatientTeam> buildPatientTeamResult(List<TPatientTeam> data);

    void copyPatientGroup(TPatientGroupVo group, @MappingTarget TPatientGroup tPatientGroup);

    PatientGroup buildPatientGroupResult(TPatientGroup group);

    TPatientGroupQuery buildPatientGroupQuery(PatientGroupQuery patientGroupQuery);

    IPageData<PatientGroup> buildPatientGroupResult(IPageData<TPatientGroup> queryPage);

    List<PatientGroup> buildPatientGroupResult(List<TPatientGroup> data);

    TPatientTeamMeal buildPatientTeamMeal(TPatientTeamMealVo meal);

    void copyPatientTeamMeal(TPatientTeamMealVo meal, @MappingTarget TPatientTeamMeal patientTeamMeal);

    TPatientTeamMealQuery buildPatientTeamMealQuery(PatientTeamMealQuery patientTeamMealQuery);

    PatientTeamMeal buildPatientTeamMealResult(TPatientTeamMeal meal);

    List<PatientTeamMeal> buildPatientTeamMealResult(List<TPatientTeamMeal> meal);

    IPageData<PatientTeamMeal> buildPatientTeamMealResult(IPageData<TPatientTeamMeal> meal);

    TPatientTeamMealFeeItem buildPatientTeamMealFeeItem(TPatientTeamMealFeeItemVo feeItemVo);

    TPatientTeamMealCheckItem buildPatientTeamMealCheckItem(TPatientTeamMealCheckItemVo checkItem);

    List<PatientTeamMealFeeItem> buildPatientTeamMealFeeItemResult(List<TPatientTeamMealFeeItem> listByTeamMealId);

    TPatientFeeItem buildPatientFeeItem(TPatientFeeItemVo patientFeeItemVo);

    TPatientMeal buildPatientMeal(PatientMealVo meal);

    TPatientCheckItem buildPatientCheckItem(TPatientCheckItemVo checkItem);


}
