package org.example.spring.repositories.clients.patient.postgres.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.patient.api.PatientMealRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientMealDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientMeal;
import org.example.spring.repositories.commons.entity.patient.query.PatientMealQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientMealVo;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.example.spring.repositories.feign.patient.clients.PatientMealRepositoryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class PatientMealRepositoryController extends CommonsFeignClientImpl<PatientMeal, PatientMealVo, PatientMealDTO, PatientMealQuery, PatientMealRepository> implements PatientMealRepositoryClient {
    public PatientMealRepositoryController(PatientMealRepository repository) {
        super(repository);
    }
}