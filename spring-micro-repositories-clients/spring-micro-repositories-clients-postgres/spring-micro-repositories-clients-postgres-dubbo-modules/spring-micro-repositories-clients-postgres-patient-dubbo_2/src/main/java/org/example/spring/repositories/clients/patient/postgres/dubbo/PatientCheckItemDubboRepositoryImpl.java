package org.example.spring.repositories.clients.patient.mysql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.clients.dubbo.patient.api.PatientCheckItemDubboRepository;
import org.example.spring.repositories.clients.patient.api.PatientCheckItemRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientCheckItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientCheckItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientCheckItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientCheckItemVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class PatientCheckItemDubboRepositoryImpl extends CommonsDubboRepositoryImpl<PatientCheckItem, PatientCheckItemVo, PatientCheckItemDTO, PatientCheckItemQuery, PatientCheckItemRepository> implements PatientCheckItemDubboRepository {
    protected PatientCheckItemDubboRepositoryImpl(PatientCheckItemRepository repository) {
        super(repository);
    }
}