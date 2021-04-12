package org.example.spring.infrastructures.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.builder.PatientBuilder;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientDao;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientGroupDao;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientGroupQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroup;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroupItemDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientGroupFormVo;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientGroupVo;
import org.example.spring.infrastructures.mysql.patient.repository.PatientGroupItemRepository;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroup;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class PatientGroupItemRepositoryImpl extends IBaseRepositoryImpl<PatientGroup, PatientGroupFormVo, PatientGroupItemDetails, PatientGroupQuery> implements PatientGroupItemRepository {
    private final PatientBuilder patientBuilder;
    private final TPatientGroupDao patientGroupItemDao;
    private final TPatientDao patientDao;

    @Override
    public Long saveWithId(PatientGroupFormVo patientGroupFormVo) {
        PatientGroupVo item = patientGroupFormVo.getItem();
        TPatientGroup entity = patientBuilder.buildPatientGroupItem(item);
        patientGroupItemDao.save(entity);
        return entity.getId();
    }

    @Override
    public void update(PatientGroupFormVo patientGroupFormVo) {

    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public PatientGroupItemDetails getById(Long id) {
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