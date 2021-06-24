package org.example.spring.repositories.patient.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientGroupDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientGroup;
import org.example.spring.repositories.patient.oracle.table.query.TPatientGroupQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientGroupVo;

public interface TPatientGroupRepository extends IBaseRepository<TPatientGroup, TPatientGroupDTO, TPatientGroupVo, TPatientGroupQuery> {
}
