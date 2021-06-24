package org.example.spring.repositories.feign.patient.clients;


import org.example.spring.repositories.commons.entity.patient.dto.PatientGroupDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientGroup;
import org.example.spring.repositories.commons.entity.patient.query.PatientGroupQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientGroupVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("patient/group/repository/client")
public interface PatientGroupRepositoryClient extends CommonsFeignClient<PatientGroup, PatientGroupVo, PatientGroupDTO, PatientGroupQuery> {

}
