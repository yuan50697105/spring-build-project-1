package org.example.spring.repositories.clients.patient.mysql.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.patient.api.PatientTeamMealCheckItemRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealCheckItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMealCheckItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealCheckItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealCheckItemVo;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.example.spring.repositories.feign.patient.clients.PatientTeamMealCheckItemRepositoryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class PatientTeamMealCheckItemRepositoryController extends CommonsFeignClientImpl<PatientTeamMealCheckItem, PatientTeamMealCheckItemVo, PatientTeamMealCheckItemDTO, PatientTeamMealCheckItemQuery, PatientTeamMealCheckItemRepository> implements PatientTeamMealCheckItemRepositoryClient {
    public PatientTeamMealCheckItemRepositoryController(PatientTeamMealCheckItemRepository repository) {
        super(repository);
    }
}