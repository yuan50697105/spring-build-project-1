package org.example.spring.domains.patient.service;

import org.checkerframework.checker.nullness.Opt;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.Patient;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientFormVo;
import org.example.spring.plugins.mybatis.entity.IPageData;

import java.util.List;
import java.util.Optional;

/**
 * 体检人服务
 * @author yuane
 */
public interface PatientService {
    IPageData<Patient> selectPage(PatientQuery query);

    List<Patient> selectList(PatientQuery query);

    Patient selectOne(PatientQuery query);

    Optional<Patient> selectOneOpt(PatientQuery query);

    PatientDetails get(Long id);

    void save(PatientFormVo formVo);

    void update(PatientFormVo formVo);

    void delete(List<Long> ids);
}
