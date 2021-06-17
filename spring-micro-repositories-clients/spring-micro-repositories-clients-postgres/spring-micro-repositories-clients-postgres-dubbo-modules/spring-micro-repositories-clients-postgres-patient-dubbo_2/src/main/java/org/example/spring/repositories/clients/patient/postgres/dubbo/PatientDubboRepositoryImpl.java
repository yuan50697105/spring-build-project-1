package org.example.spring.repositories.clients.patient.mysql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.clients.dubbo.patient.api.PatientDubboRepository;
import org.example.spring.repositories.clients.patient.api.PatientRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientDTO;
import org.example.spring.repositories.commons.entity.patient.po.Patient;
import org.example.spring.repositories.commons.entity.patient.query.PatientQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class PatientDubboRepositoryImpl extends CommonsDubboRepositoryImpl<Patient, PatientVo, PatientDTO, PatientQuery, PatientRepository> implements PatientDubboRepository {
    protected PatientDubboRepositoryImpl(PatientRepository repository) {
        super(repository);
    }
}