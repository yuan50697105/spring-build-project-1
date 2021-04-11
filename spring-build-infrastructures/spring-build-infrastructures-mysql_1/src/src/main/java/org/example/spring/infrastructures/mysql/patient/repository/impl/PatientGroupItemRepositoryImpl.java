package org.example.spring.infrastructures.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.builder.PatientBuilder;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientDao;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientGroupItemDao;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientGroupItemQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroupItem;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroupItemDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientGroupItemFormVo;
import org.example.spring.infrastructures.mysql.patient.repository.PatientGroupItemRepository;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class PatientGroupItemRepositoryImpl implements PatientGroupItemRepository {
    private final PatientBuilder patientBuilder;
    private final TPatientGroupItemDao patientGroupItemDao;
    private final TPatientDao patientDao;

    @Override
    public Long saveWithId(PatientGroupItemFormVo patientGroupItemFormVo) {
        return null;
    }

    @Override
    public void update(PatientGroupItemFormVo patientGroupItemFormVo) {

    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public PatientGroupItemDetails getById(Long id) {
        return null;
    }

    @Override
    public IPageData<PatientGroupItem> queryPage(PatientGroupItemQuery patientGroupItemQuery) {
        return null;
    }

    @Override
    public List<PatientGroupItem> queryList(PatientGroupItemQuery patientGroupItemQuery) {
        return null;
    }

    @Override
    public PatientGroupItem queryOne(PatientGroupItemQuery patientGroupItemQuery) {
        return null;
    }
}