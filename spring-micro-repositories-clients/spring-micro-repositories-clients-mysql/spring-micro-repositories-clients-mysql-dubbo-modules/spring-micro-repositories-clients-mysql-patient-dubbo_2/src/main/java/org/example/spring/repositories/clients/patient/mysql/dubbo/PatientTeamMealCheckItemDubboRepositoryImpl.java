package org.example.spring.repositories.clients.patient.mysql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.clients.dubbo.patient.api.PatientTeamMealCheckItemDubboRepository;
import org.example.spring.repositories.clients.dubbo.patient.api.PatientTeamMealDubboRepository;
import org.example.spring.repositories.clients.patient.api.PatientTeamMealCheckItemRepository;
import org.example.spring.repositories.clients.patient.api.PatientTeamMealRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealCheckItemDTO;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMeal;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMealCheckItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealCheckItemQuery;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealCheckItemVo;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class PatientTeamMealCheckItemDubboRepositoryImpl extends CommonsDubboRepositoryImpl<PatientTeamMealCheckItem, PatientTeamMealCheckItemVo, PatientTeamMealCheckItemDTO, PatientTeamMealCheckItemQuery, PatientTeamMealCheckItemRepository> implements PatientTeamMealCheckItemDubboRepository {
    protected PatientTeamMealCheckItemDubboRepositoryImpl(PatientTeamMealCheckItemRepository repository) {
        super(repository);
    }
}