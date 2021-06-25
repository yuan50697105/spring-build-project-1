package org.example.spring.repositories.clients.patient.mysql.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.patient.api.PatientTeamMealFeeItemRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealFeeItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMealFeeItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealFeeItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealFeeItemVo;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.example.spring.repositories.feign.patient.clients.PatientTeamMealFeeItemRepositoryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class PatientTeamMealFeeItemRepositoryController extends CommonsFeignClientImpl<PatientTeamMealFeeItem, PatientTeamMealFeeItemVo, PatientTeamMealFeeItemDTO, PatientTeamMealFeeItemQuery, PatientTeamMealFeeItemRepository> implements PatientTeamMealFeeItemRepositoryClient {
    public PatientTeamMealFeeItemRepositoryController(PatientTeamMealFeeItemRepository repository) {
        super(repository);
    }
}