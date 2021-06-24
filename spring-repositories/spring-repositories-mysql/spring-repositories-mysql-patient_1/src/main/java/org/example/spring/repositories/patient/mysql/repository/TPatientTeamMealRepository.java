package org.example.spring.repositories.patient.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientTeamMeal;
import org.example.spring.repositories.patient.mysql.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientTeamMealVo;

public interface TPatientTeamMealRepository extends IBaseRepository<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery> {
}
