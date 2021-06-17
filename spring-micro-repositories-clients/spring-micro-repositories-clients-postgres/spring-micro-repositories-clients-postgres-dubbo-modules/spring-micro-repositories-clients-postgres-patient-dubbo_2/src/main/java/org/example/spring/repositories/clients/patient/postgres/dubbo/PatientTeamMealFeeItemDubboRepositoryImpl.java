package org.example.spring.repositories.clients.patient.postgres.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.clients.dubbo.patient.api.PatientTeamMealFeeItemDubboRepository;
import org.example.spring.repositories.clients.patient.api.PatientTeamMealFeeItemRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealFeeItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMealFeeItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealFeeItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealFeeItemVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class PatientTeamMealFeeItemDubboRepositoryImpl extends CommonsDubboRepositoryImpl<PatientTeamMealFeeItem, PatientTeamMealFeeItemVo, PatientTeamMealFeeItemDTO, PatientTeamMealFeeItemQuery, PatientTeamMealFeeItemRepository> implements PatientTeamMealFeeItemDubboRepository {
    protected PatientTeamMealFeeItemDubboRepositoryImpl(PatientTeamMealFeeItemRepository repository) {
        super(repository);
    }
}