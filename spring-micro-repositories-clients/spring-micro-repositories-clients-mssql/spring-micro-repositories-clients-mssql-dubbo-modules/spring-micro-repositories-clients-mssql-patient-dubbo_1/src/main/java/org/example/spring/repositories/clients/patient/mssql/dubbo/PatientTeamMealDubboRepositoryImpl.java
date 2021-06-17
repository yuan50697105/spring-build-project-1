package org.example.spring.repositories.clients.patient.mssql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.clients.dubbo.patient.api.PatientTeamMealDubboRepository;
import org.example.spring.repositories.clients.patient.api.PatientTeamMealRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMeal;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class PatientTeamMealDubboRepositoryImpl extends CommonsDubboRepositoryImpl<PatientTeamMeal, PatientTeamMealVo, PatientTeamMealDTO, PatientTeamMealQuery, PatientTeamMealRepository> implements PatientTeamMealDubboRepository {
    protected PatientTeamMealDubboRepositoryImpl(PatientTeamMealRepository repository) {
        super(repository);
    }
}