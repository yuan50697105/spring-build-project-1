package org.example.spring.domains.mysql.patient.service;

import org.example.spring.models.mysql.patient.entity.query.PatientGroupQuery;
import org.example.spring.models.mysql.patient.entity.result.PatientGroup;
import org.example.spring.models.mysql.patient.entity.result.PatientGroupDetails;
import org.example.spring.models.mysql.patient.entity.vo.PatientGroupFormVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;
import java.util.Optional;

public interface PatientGroupService {
    void save(PatientGroupFormVo formVo);

    void update(PatientGroupFormVo formVo);

    void delete(List<Long> ids);

    PatientGroupDetails getById(Long id);

    Optional<PatientGroupDetails> getByIdOpt(Long id);

    PatientGroup selectOne(PatientGroupQuery query);

    List<PatientGroup> selectList(PatientGroupQuery query);

    List<PatientGroup> selectTop(PatientGroupQuery query);

    IPageData<PatientGroup> selectPage(PatientGroupQuery query);
}
