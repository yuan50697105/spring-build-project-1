package org.example.spring.repositories.clients.dubbo.patient.api;

import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientMealDTO;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientMeal;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeam;
import org.example.spring.repositories.commons.entity.patient.query.PatientMealQuery;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientMealVo;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamVo;

public interface PatientTeamDubboRepository extends CommonsDubboRepository<PatientTeam, PatientTeamVo, PatientTeamDTO, PatientTeamQuery> {
}
