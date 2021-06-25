package org.example.spring.repositories.clients.patient.oracle.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.clients.dubbo.patient.api.PatientTeamDubboRepository;
import org.example.spring.repositories.clients.patient.api.PatientTeamRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeam;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class PatientTeamDubboRepositoryImpl extends CommonsDubboRepositoryImpl<PatientTeam, PatientTeamVo, PatientTeamDTO, PatientTeamQuery, PatientTeamRepository> implements PatientTeamDubboRepository {
    protected PatientTeamDubboRepositoryImpl(PatientTeamRepository repository) {
        super(repository);
    }
}