package org.example.spring.repositories.clients.patient.mssql.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.patient.api.PatientFeeItemRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientFeeItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientFeeItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientFeeItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientFeeItemVo;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.example.spring.repositories.feign.patient.clients.PatientFeeItemRepositoryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class PatientFeeItemRepositoryController extends CommonsFeignClientImpl<PatientFeeItem, PatientFeeItemVo, PatientFeeItemDTO, PatientFeeItemQuery, PatientFeeItemRepository> implements PatientFeeItemRepositoryClient {
    public PatientFeeItemRepositoryController(PatientFeeItemRepository repository) {
        super(repository);
    }
}