package org.example.spring.repositories.oracle.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.oracle.patient.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.oracle.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.oracle.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.oracle.patient.table.vo.TPatientCheckItemVo;

public interface TPatientCheckItemRepository extends IBaseRepository<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery> {
}
