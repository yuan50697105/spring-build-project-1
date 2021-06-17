package org.example.spring.repositories.clients.patient.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientMealDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientMeal;
import org.example.spring.repositories.commons.entity.patient.query.PatientMealQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientMealVo;

public interface PatientMealRepository extends CommonsRepository<PatientMeal, PatientMealVo, PatientMealDTO, PatientMealQuery> {
}
