package org.example.spring.repositories.patient.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientCheckItem;
import org.example.spring.repositories.patient.oracle.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientCheckItemVo;

public interface TPatientCheckItemRepository extends IBaseRepository<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery> {
}
