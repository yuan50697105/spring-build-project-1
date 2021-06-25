package org.example.spring.repositories.patient.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientCheckItem;
import org.example.spring.repositories.patient.postgres.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientCheckItemVo;

public interface TPatientCheckItemRepository extends IBaseRepository<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery> {
}
