package org.example.spring.repositories.clients.patient.mssql.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.patient.api.PatientTeamMealRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMeal;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealVo;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.example.spring.repositories.feign.patient.clients.PatientTeamMealRepositoryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class PatientTeamMealRepositoryController extends CommonsFeignClientImpl<PatientTeamMeal, PatientTeamMealVo, PatientTeamMealDTO, PatientTeamMealQuery, PatientTeamMealRepository> implements PatientTeamMealRepositoryClient {
    public PatientTeamMealRepositoryController(PatientTeamMealRepository repository) {
        super(repository);
    }
}