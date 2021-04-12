package org.example.spring.infrastructures.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.builder.PatientBuilder;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientTeamDao;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientTeamQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientTeam;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroupDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientTeamFormVo;
import org.example.spring.infrastructures.mysql.patient.repository.PatientTeamRepository;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class PatientTeamRepositoryImpl extends IBaseRepositoryImpl<PatientTeam, PatientTeamFormVo, PatientGroupDetails, PatientTeamQuery> implements PatientTeamRepository {
    private final PatientBuilder patientBuilder;
    private final TPatientTeamDao patientGroupDao;

    @Override
    public Long saveWithId(PatientTeamFormVo patientTeamFormVo) {
        return null;
    }

    @Override
    public void update(PatientTeamFormVo patientTeamFormVo) {

    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public PatientGroupDetails getById(Long id) {
        return null;
    }

    @Override
    public IPageData<PatientTeam> queryPage(PatientTeamQuery patientTeamQuery) {
        return null;
    }

    @Override
    public List<PatientTeam> queryList(PatientTeamQuery patientTeamQuery) {
        return null;
    }

    @Override
    public PatientTeam queryOne(PatientTeamQuery patientTeamQuery) {
        return null;
    }
}