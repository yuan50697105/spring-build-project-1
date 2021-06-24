package org.example.spring.repositories.patient.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientGroupDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientGroup;
import org.example.spring.repositories.patient.mysql.table.query.TPatientGroupQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientGroupVo;

public interface TPatientGroupRepository extends IBaseRepository<TPatientGroup, TPatientGroupDTO, TPatientGroupVo, TPatientGroupQuery> {
}
