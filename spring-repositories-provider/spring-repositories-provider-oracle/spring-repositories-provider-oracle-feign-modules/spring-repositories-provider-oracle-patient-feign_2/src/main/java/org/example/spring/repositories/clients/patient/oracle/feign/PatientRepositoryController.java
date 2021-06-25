package org.example.spring.repositories.clients.patient.oracle.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.patient.api.PatientRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientDTO;
import org.example.spring.repositories.commons.entity.patient.po.Patient;
import org.example.spring.repositories.commons.entity.patient.query.PatientQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientVo;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.example.spring.repositories.feign.patient.clients.PatientRepositoryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class PatientRepositoryController extends CommonsFeignClientImpl<Patient, PatientVo, PatientDTO, PatientQuery, PatientRepository> implements PatientRepositoryClient {
    public PatientRepositoryController(PatientRepository repository) {
        super(repository);
    }
}