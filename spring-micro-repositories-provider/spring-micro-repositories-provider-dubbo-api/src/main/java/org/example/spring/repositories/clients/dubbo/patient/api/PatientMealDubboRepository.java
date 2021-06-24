package org.example.spring.repositories.clients.dubbo.patient.api;

import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientMealDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientMeal;
import org.example.spring.repositories.commons.entity.patient.query.PatientMealQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientMealVo;

public interface PatientMealDubboRepository extends CommonsDubboRepository<PatientMeal, PatientMealVo, PatientMealDTO, PatientMealQuery> {
}
