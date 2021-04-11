package org.example.spring.infrastructures.mysql.patient.repository;

import org.example.spring.infrastructures.mysql.patient.entity.query.PatientGroupItemQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroupItem;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroupItemDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientGroupItemFormVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface PatientGroupItemRepository extends IBaseRepository<PatientGroupItem, PatientGroupItemFormVo, PatientGroupItemDetails, PatientGroupItemQuery> {
}