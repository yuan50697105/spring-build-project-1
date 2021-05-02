package org.example.spring.models.clickhouse.patient.builder;

import org.example.spring.daos.clickhouse.patient.table.po.*;
import org.example.spring.daos.clickhouse.patient.table.query.TPatientGroupQuery;
import org.example.spring.daos.clickhouse.patient.table.query.TPatientQuery;
import org.example.spring.daos.clickhouse.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.daos.clickhouse.patient.table.query.TPatientTeamQuery;
import org.example.spring.daos.clickhouse.patient.table.vo.*;
import org.example.spring.models.clickhouse.patient.entity.query.PatientGroupQuery;
import org.example.spring.models.clickhouse.patient.entity.query.PatientQuery;
import org.example.spring.models.clickhouse.patient.entity.query.PatientTeamMealQuery;
import org.example.spring.models.clickhouse.patient.entity.query.PatientTeamQuery;
import org.example.spring.models.clickhouse.patient.entity.result.*;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PatientModelBuilder {
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

    TPatientTeamMeal buildPatientTeamMeal(PatientTeamMealVo meal);

    void copyPatientTeamMeal(PatientTeamMealVo meal, @MappingTarget TPatientTeamMeal patientTeamMeal);

    TPatientTeamMealQuery buildPatientTeamMealQuery(PatientTeamMealQuery patientTeamMealQuery);

    PatientTeamMeal buildPatientTeamMealResult(TPatientTeamMeal meal);

    List<PatientTeamMeal> buildPatientTeamMealResult(List<TPatientTeamMeal> meal);

    IPageData<PatientTeamMeal> buildPatientTeamMealResult(IPageData<TPatientTeamMeal> meal);

    TPatientTeamMealFeeItem buildPatientTeamMealFeeItem(PatientTeamMealFeeItemVo feeItemVo);

    TPatientTeamMealCheckItem buildPatientTeamMealCheckItem(PatientTeamMealCheckItemVo checkItem);

    List<PatientTeamMealFeeItem> buildPatientTeamMealFeeItemResult(List<TPatientTeamMealFeeItem> listByTeamMealId);

    TPatientFeeItem buildPatientFeeItem(PatientFeeItemVo patientFeeItemVo);

    TPatientMeal buildPatientMeal(PatientMealVo meal);

    TPatientCheckItem buildPatientCheckItem(PatientCheckItemVo checkItem);


}
