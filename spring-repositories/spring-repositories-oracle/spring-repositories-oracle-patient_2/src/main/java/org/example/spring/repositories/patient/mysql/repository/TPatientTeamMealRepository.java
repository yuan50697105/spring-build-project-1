package org.example.spring.repositories.patient.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientTeamMeal;
import org.example.spring.repositories.patient.oracle.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientTeamMealVo;

public interface TPatientTeamMealRepository extends IBaseRepository<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery> {
}
