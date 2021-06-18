package org.example.spring.repositories.clients.patient.mysql.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.patient.api.PatientTeamRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeam;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamVo;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.example.spring.repositories.feign.patient.clients.PatientTeamRepositoryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class PatientTeamRepositoryController extends CommonsFeignClientImpl<PatientTeam, PatientTeamVo, PatientTeamDTO, PatientTeamQuery, PatientTeamRepository> implements PatientTeamRepositoryClient {
    public PatientTeamRepositoryController(PatientTeamRepository repository) {
        super(repository);
    }
}