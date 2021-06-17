package org.example.spring.repositories.clients.dubbo.patient.api;

import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealCheckItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMealCheckItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealCheckItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealCheckItemVo;

public interface PatientTeamMealCheckItemDubboRepository extends CommonsDubboRepository<PatientTeamMealCheckItem, PatientTeamMealCheckItemVo, PatientTeamMealCheckItemDTO, PatientTeamMealCheckItemQuery> {
}
