package org.example.spring.repositories.clients.patient.oracle.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.clients.dubbo.patient.api.PatientFeeItemDubboRepository;
import org.example.spring.repositories.clients.patient.api.PatientFeeItemRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientFeeItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientFeeItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientFeeItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientFeeItemVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class PatientFeeItemDubboRepositoryImpl extends CommonsDubboRepositoryImpl<PatientFeeItem, PatientFeeItemVo, PatientFeeItemDTO, PatientFeeItemQuery, PatientFeeItemRepository> implements PatientFeeItemDubboRepository {
    protected PatientFeeItemDubboRepositoryImpl(PatientFeeItemRepository repository) {
        super(repository);
    }
}