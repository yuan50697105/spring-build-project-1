package org.example.spring.repositories.feign.patient.clients;


import org.example.spring.repositories.commons.entity.patient.dto.PatientFeeItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientFeeItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientFeeItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientFeeItemVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("patient/fee/item/repository/client")
public interface PatientFeeItemRepositoryClient extends CommonsFeignClient<PatientFeeItem, PatientFeeItemVo, PatientFeeItemDTO, PatientFeeItemQuery> {

}
