package org.example.spring.repositories.clients.patient.mysql.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.patient.api.PatientCheckItemRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientCheckItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientCheckItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientCheckItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientCheckItemVo;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.example.spring.repositories.feign.patient.clients.PatientCheckItemRepositoryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class PatientCheckItemRepositoryController extends CommonsFeignClientImpl<PatientCheckItem, PatientCheckItemVo, PatientCheckItemDTO, PatientCheckItemQuery, PatientCheckItemRepository> implements PatientCheckItemRepositoryClient {
    public PatientCheckItemRepositoryController(PatientCheckItemRepository repository) {
        super(repository);
    }
}
