package org.example.spring.infrastructures.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.builder.PatientBuilder;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientDao;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientGroupDao;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientGroupItemDao;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientGroupQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroup;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroupDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientGroupFormVo;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientGroupVo;
import org.example.spring.infrastructures.mysql.patient.repository.PatientGroupRepository;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatient;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroup;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroupItem;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientGroupQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
@Transactional
public class PatientGroupRepositoryImpl implements PatientGroupRepository {
    private final PatientBuilder patientBuilder;
    private final TPatientGroupDao patientGroupDao;
    private final TPatientGroupItemDao patientGroupItemDao;
    private final TPatientDao patientDao;

    @Override
    public Long saveWithId(PatientGroupFormVo patientGroupFormVo) {
        PatientGroupVo group = patientGroupFormVo.getGroup();
        TPatientGroup entity = patientBuilder.buildPatientGroup(group);
        patientGroupDao.save(entity);
        return entity.getId();
    }

    @Override
    public void update(PatientGroupFormVo patientGroupFormVo) {
        Long id = patientGroupFormVo.getId();
        PatientGroupVo group = patientGroupFormVo.getGroup();
        Optional<TPatientGroup> optional = patientGroupDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TPatientGroup tPatientGroup = optional.get();
            patientBuilder.copyPatientGroup(group, tPatientGroup);
            patientGroupDao.updateById(tPatientGroup);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        patientGroupDao.removeByIds(ids);
        patientGroupItemDao.removeByGroupIds(ids);
        patientDao.removeByGroupIds(ids);
    }

    @Override
    public PatientGroupDetails getById(Long id) {
        PatientGroupDetails details = new PatientGroupDetails();
        TPatientGroup group = patientGroupDao.getById(id);
        List<TPatientGroupItem> items = patientGroupItemDao.listByGroupId(id);
        List<TPatient> patients = patientDao.listByGroupId(id);
        details.setId(group.getId());
        details.setGroup(patientBuilder.buildPatientGroupResult(group));
        details.setItems(patientBuilder.buildPatientGroupItemResult(items));
        details.setPatients(patientBuilder.buildPatientResult(patients));
        return details;
    }

    @Override
    public IPageData<PatientGroup> queryPage(PatientGroupQuery patientGroupQuery) {
        TPatientGroupQuery query = patientBuilder.buildPatientGroupQuery(patientGroupQuery);
        IPageData<TPatientGroup> data = patientGroupDao.queryPage(query);
        return patientBuilder.buildPatientGroupResult(data);
    }

    @Override
    public List<PatientGroup> queryList(PatientGroupQuery patientGroupQuery) {
        TPatientGroupQuery query = patientBuilder.buildPatientGroupQuery(patientGroupQuery);
        List<TPatientGroup> data = patientGroupDao.queryList(query);
        return patientBuilder.buildPatientGroupResult(data);
    }

    @Override
    public PatientGroup queryOne(PatientGroupQuery patientGroupQuery) {
        TPatientGroupQuery query = patientBuilder.buildPatientGroupQuery(patientGroupQuery);
        Optional<TPatientGroup> data = patientGroupDao.queryFirst(query);
        return patientBuilder.buildPatientGroupResult(data.orElse(new PatientGroup()));
    }
}