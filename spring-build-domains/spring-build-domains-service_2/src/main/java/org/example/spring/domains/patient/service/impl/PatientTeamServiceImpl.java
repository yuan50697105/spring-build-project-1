package org.example.spring.domains.patient.service.impl;

import lombok.AllArgsConstructor;
import org.checkerframework.checker.nullness.Opt;
import org.example.spring.domains.patient.service.PatientTeamService;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientTeamQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientTeam;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientTeamDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientTeamFormVo;
import org.example.spring.infrastructures.mysql.patient.repository.PatientTeamRepository;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
public class PatientTeamServiceImpl implements PatientTeamService {
    private final PatientTeamRepository patientTeamRepository;

    @Override
    public IPageData<PatientTeam> selectPage(PatientTeamQuery query) {
        return patientTeamRepository.queryPage(query);
    }

    @Override
    public List<PatientTeam> selectList(PatientTeamQuery query) {
        return patientTeamRepository.queryTop(query, query.getSize());
    }

    @Override
    public PatientTeam selectOne(PatientTeamQuery query) {
        return patientTeamRepository.queryFirst(query);
    }

    @Override
    public Optional<PatientTeam> selectOneOpt(PatientTeamQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public void save(PatientTeamFormVo formVo) {
        patientTeamRepository.save(formVo);
    }

    @Override
    public void update(PatientTeamFormVo formVo) {
        patientTeamRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        patientTeamRepository.delete(ids);
    }

    @Override
    public PatientTeamDetails get(Long id) {
        return patientTeamRepository.getById(id);
    }
}