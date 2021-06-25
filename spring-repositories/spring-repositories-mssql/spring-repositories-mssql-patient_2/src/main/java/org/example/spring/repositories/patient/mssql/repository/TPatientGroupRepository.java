package org.example.spring.repositories.patient.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientGroupDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientGroup;
import org.example.spring.repositories.patient.mssql.table.query.TPatientGroupQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientGroupVo;

public interface TPatientGroupRepository extends IBaseRepository<TPatientGroup, TPatientGroupDTO, TPatientGroupVo, TPatientGroupQuery> {
}
