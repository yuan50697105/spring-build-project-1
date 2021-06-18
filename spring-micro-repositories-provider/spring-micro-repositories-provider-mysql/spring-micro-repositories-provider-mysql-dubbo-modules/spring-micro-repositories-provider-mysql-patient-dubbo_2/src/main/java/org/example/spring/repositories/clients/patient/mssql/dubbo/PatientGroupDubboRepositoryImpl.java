package org.example.spring.repositories.clients.patient.mssql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.clients.dubbo.patient.api.PatientGroupDubboRepository;
import org.example.spring.repositories.clients.patient.api.PatientGroupRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientGroupDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientGroup;
import org.example.spring.repositories.commons.entity.patient.query.PatientGroupQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientGroupVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class PatientGroupDubboRepositoryImpl extends CommonsDubboRepositoryImpl<PatientGroup, PatientGroupVo, PatientGroupDTO, PatientGroupQuery, PatientGroupRepository> implements PatientGroupDubboRepository {
    protected PatientGroupDubboRepositoryImpl(PatientGroupRepository repository) {
        super(repository);
    }
}