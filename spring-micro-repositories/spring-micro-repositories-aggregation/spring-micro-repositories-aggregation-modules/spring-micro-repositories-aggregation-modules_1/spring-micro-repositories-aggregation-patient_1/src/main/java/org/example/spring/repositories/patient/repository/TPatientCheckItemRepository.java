package org.example.spring.repositories.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.patient.table.vo.TPatientCheckItemVo;

public interface TPatientCheckItemRepository extends IBaseRepository<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery> {
}
