package org.example.spring.repositories.postgres.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.postgres.patient.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.postgres.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.postgres.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.postgres.patient.table.vo.TPatientCheckItemVo;

public interface TPatientCheckItemRepository extends IBaseRepository<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery> {
}
