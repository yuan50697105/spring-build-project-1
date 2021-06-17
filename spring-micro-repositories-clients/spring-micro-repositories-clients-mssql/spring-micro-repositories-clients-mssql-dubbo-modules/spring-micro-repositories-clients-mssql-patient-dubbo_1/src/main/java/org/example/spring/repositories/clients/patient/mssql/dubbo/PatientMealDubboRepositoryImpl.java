package org.example.spring.repositories.clients.patient.mssql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.clients.dubbo.patient.api.PatientMealDubboRepository;
import org.example.spring.repositories.clients.patient.api.PatientMealRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientMealDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientMeal;
import org.example.spring.repositories.commons.entity.patient.query.PatientMealQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientMealVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class PatientMealDubboRepositoryImpl extends CommonsDubboRepositoryImpl<PatientMeal, PatientMealVo, PatientMealDTO, PatientMealQuery, PatientMealRepository> implements PatientMealDubboRepository {
    protected PatientMealDubboRepositoryImpl(PatientMealRepository repository) {
        super(repository);
    }
}