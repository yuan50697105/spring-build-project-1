package org.example.spring.repositories.clients.dubbo.patient.api;

import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientCheckItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientCheckItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientCheckItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientCheckItemVo;

public interface PatientCheckItemDubboRepository extends CommonsDubboRepository<PatientCheckItem, PatientCheckItemVo, PatientCheckItemDTO, PatientCheckItemQuery> {
}
