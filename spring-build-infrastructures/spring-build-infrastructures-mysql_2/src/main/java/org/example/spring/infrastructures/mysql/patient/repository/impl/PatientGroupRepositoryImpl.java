package org.example.spring.infrastructures.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.builder.PatientBuilder;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientGroupDao;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientGroupQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroup;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroupDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientGroupFormVo;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientGroupItemVo;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientVo;
import org.example.spring.infrastructures.mysql.patient.repository.PatientGroupRepository;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class PatientGroupRepositoryImpl extends IBaseRepositoryImpl<PatientGroup, PatientGroupFormVo, PatientGroupDetails, PatientGroupQuery> implements PatientGroupRepository {
    private final PatientBuilder patientBuilder;
    private final TPatientGroupDao patientGroupDao;

    @Override
    public Long saveWithId(PatientGroupFormVo patientGroupFormVo) {
        return null;
    }

    @Override
    public void update(PatientGroupFormVo patientGroupFormVo) {

    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public PatientGroupDetails getById(Long id) {
        return null;
    }

    @Override
    public IPageData<PatientGroup> queryPage(PatientGroupQuery patientGroupQuery) {
        return null;
    }

    @Override
    public List<PatientGroup> queryList(PatientGroupQuery patientGroupQuery) {
        return null;
    }

    @Override
    public PatientGroup queryOne(PatientGroupQuery patientGroupQuery) {
        return null;
    }
}