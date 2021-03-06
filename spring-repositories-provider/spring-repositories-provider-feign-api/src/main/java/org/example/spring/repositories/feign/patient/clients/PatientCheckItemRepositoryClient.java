package org.example.spring.repositories.feign.patient.clients;


import org.example.spring.repositories.commons.entity.patient.dto.PatientCheckItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientCheckItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientCheckItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientCheckItemVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("patient/check/item/repository/client")
public interface PatientCheckItemRepositoryClient extends CommonsFeignClient<PatientCheckItem, PatientCheckItemVo, PatientCheckItemDTO, PatientCheckItemQuery> {

}
