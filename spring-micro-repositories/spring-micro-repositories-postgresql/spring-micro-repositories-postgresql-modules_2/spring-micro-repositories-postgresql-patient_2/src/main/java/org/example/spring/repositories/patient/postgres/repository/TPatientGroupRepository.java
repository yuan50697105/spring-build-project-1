package org.example.spring.repositories.patient.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientGroupDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientGroup;
import org.example.spring.repositories.patient.postgres.table.query.TPatientGroupQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientGroupVo;

public interface TPatientGroupRepository extends IBaseRepository<TPatientGroup, TPatientGroupDTO, TPatientGroupVo, TPatientGroupQuery> {
}
