package org.example.spring.repositories.mssql.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mssql.patient.table.dto.TPatientGroupDTO;
import org.example.spring.repositories.mssql.patient.table.po.TPatientGroup;
import org.example.spring.repositories.mssql.patient.table.query.TPatientGroupQuery;
import org.example.spring.repositories.mssql.patient.table.vo.TPatientGroupVo;

public interface TPatientGroupRepository extends IBaseRepository<TPatientGroup, TPatientGroupDTO, TPatientGroupVo, TPatientGroupQuery> {
}
