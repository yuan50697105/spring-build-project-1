package org.example.spring.domains.postgresql.patient.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.postgresql.patient.service.PatientService;
import org.example.spring.models.postgresql.patient.entity.query.PatientQuery;
import org.example.spring.models.postgresql.patient.entity.result.Patient;
import org.example.spring.models.postgresql.patient.entity.result.PatientDetails;
import org.example.spring.models.postgresql.patient.entity.vo.PatientFormVo;
import org.example.spring.models.postgresql.patient.repository.PatientRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * 体检人服务实现
 *
 * @author yuane
 */
@Service
@AllArgsConstructor
@Transactional
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;

    @Override
    public IPageData<Patient> selectPage(PatientQuery query) {
        return patientRepository.queryPage(query);
    }

    @Override
    public List<Patient> selectList(PatientQuery query) {
        return patientRepository.queryTop(query, query.getSize());
    }

    @Override
    public Patient selectOne(PatientQuery query) {
        return patientRepository.queryFirst(query);
    }

    @Override
    public Optional<Patient> selectOneOpt(PatientQuery query) {
        return patientRepository.queryFirstOpt(query);
    }

    @Override
    public PatientDetails get(Long id) {
        return patientRepository.getDetailsById(id);
    }

    @Override
    public void save(PatientFormVo formVo) {
        patientRepository.save(formVo);
    }

    @Override
    public void update(PatientFormVo formVo) {
        patientRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        patientRepository.delete(ids);
    }
}