package org.example.spring.domains.patient.service;

import org.example.spring.models.patient.entity.query.PatientTeamQuery;
import org.example.spring.models.patient.entity.result.PatientTeam;
import org.example.spring.models.patient.entity.result.PatientTeamDetails;
import org.example.spring.models.patient.entity.vo.PatientTeamFormVo;
import org.example.spring.plugins.mybatis.entity.IPageData;

import java.util.List;
import java.util.Optional;

public interface PatientTeamService {
    IPageData<PatientTeam> selectPage(PatientTeamQuery query);

    List<PatientTeam> selectList(PatientTeamQuery query);

    PatientTeam selectOne(PatientTeamQuery query);

    Optional<PatientTeam> selectOneOpt(PatientTeamQuery query);

    PatientTeamDetails get(Long id);

    void save(PatientTeamFormVo formVo);

    void update(PatientTeamFormVo formVo);

    void delete(List<Long> ids);
}
