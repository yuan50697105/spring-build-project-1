package org.example.spring.domains.patient.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.patient.service.PatientGroupService;
import org.example.spring.models.patient.entity.query.PatientGroupQuery;
import org.example.spring.models.patient.entity.result.*;
import org.example.spring.models.patient.entity.vo.PatientGroupFormVo;
import org.example.spring.models.patient.entity.vo.PatientGroupVo;
import org.example.spring.models.patient.repository.PatientGroupRepository;
import org.example.spring.models.patient.repository.PatientTeamMealRepository;
import org.example.spring.models.patient.repository.PatientTeamRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
public class PatientGroupServiceImpl implements PatientGroupService {
    private final PatientTeamRepository patientTeamRepository;
    private final PatientTeamMealRepository patientTeamMealRepository;
    private final PatientGroupRepository patientGroupRepository;

    @Override
    public void save(PatientGroupFormVo formVo) {
        PatientGroupVo group = formVo.getGroup();
        Optional<PatientTeamDetails> patientTeamDetails = patientTeamRepository.getDetailsByIdOpt(group.getTeamId());
        PatientTeam patientTeam = patientTeamDetails.map(PatientTeamDetails::getTeam).orElse(new PatientTeam());
        group.setTeamId(patientTeam.getId());
        Optional<PatientTeamMealDetails> patientTeamMealDetails = patientTeamMealRepository.getDetailsByIdOpt(group.getTeamMealId());
        PatientTeamMeal patientTeamMeal = patientTeamMealDetails.map(PatientTeamMealDetails::getMeal).orElse(new PatientTeamMeal());
        patientGroupRepository.save(formVo);
    }

    @Override
    public void update(PatientGroupFormVo formVo) {
        patientGroupRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        patientGroupRepository.delete(ids);
    }

    @Override
    public PatientGroupDetails getById(Long id) {
        return patientGroupRepository.getDetailsById(id);
    }

    @Override
    public Optional<PatientGroupDetails> getByIdOpt(Long id) {
        return patientGroupRepository.getDetailsByIdOpt(id);
    }

    @Override
    public PatientGroup selectOne(PatientGroupQuery query) {
        return patientGroupRepository.queryFirst(query);
    }

    public Optional<PatientGroup> selectOneOpt(PatientGroupQuery query) {
        return patientGroupRepository.queryFirstOpt(query);
    }

    @Override
    public List<PatientGroup> selectList(PatientGroupQuery query) {
        return patientGroupRepository.queryList(query);
    }

    @Override
    public List<PatientGroup> selectTop(PatientGroupQuery query) {
        return patientGroupRepository.queryTop(query, query.getSize());
    }

    @Override
    public IPageData<PatientGroup> selectPage(PatientGroupQuery query) {
        return patientGroupRepository.queryPage(query);
    }


}