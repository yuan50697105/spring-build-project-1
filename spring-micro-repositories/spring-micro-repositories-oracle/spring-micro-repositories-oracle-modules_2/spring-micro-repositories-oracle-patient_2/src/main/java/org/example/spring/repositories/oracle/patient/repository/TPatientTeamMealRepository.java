package org.example.spring.repositories.oracle.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.oracle.patient.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.oracle.patient.table.po.TPatientTeamMeal;
import org.example.spring.repositories.oracle.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.oracle.patient.table.vo.TPatientTeamMealVo;

public interface TPatientTeamMealRepository extends IBaseRepository<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery> {
}
