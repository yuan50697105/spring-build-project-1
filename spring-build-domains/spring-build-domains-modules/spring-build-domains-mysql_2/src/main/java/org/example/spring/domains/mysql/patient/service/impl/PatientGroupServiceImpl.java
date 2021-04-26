package org.example.spring.domains.mysql.patient.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.mysql.patient.service.PatientGroupService;
import org.example.spring.models.mysql.patient.entity.query.PatientGroupQuery;
import org.example.spring.models.mysql.patient.entity.result.PatientGroup;
import org.example.spring.models.mysql.patient.entity.result.PatientGroupDetails;
import org.example.spring.models.mysql.patient.entity.vo.PatientGroupFormVo;
import org.example.spring.models.mysql.patient.repository.PatientGroupRepository;
import org.example.spring.models.mysql.patient.repository.PatientTeamMealRepository;
import org.example.spring.models.mysql.patient.repository.PatientTeamRepository;
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