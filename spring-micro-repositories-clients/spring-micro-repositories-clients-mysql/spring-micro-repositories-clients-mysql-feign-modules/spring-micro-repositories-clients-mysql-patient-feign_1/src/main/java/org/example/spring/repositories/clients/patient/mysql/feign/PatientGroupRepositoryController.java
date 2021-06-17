package org.example.spring.repositories.clients.patient.mysql.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.patient.api.PatientGroupRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientGroupDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientGroup;
import org.example.spring.repositories.commons.entity.patient.query.PatientGroupQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientGroupVo;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.example.spring.repositories.feign.patient.clients.PatientGroupRepositoryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class PatientGroupRepositoryController extends CommonsFeignClientImpl<PatientGroup, PatientGroupVo, PatientGroupDTO, PatientGroupQuery, PatientGroupRepository> implements PatientGroupRepositoryClient {
    public PatientGroupRepositoryController(PatientGroupRepository repository) {
        super(repository);
    }
}