package org.example.spring.repositories.patient.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientFeeItem;
import org.example.spring.repositories.patient.postgres.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientFeeItemVo;

public interface TPatientFeeItemRepository extends IBaseRepository<TPatientFeeItem, TPatientFeeItemDTO, TPatientFeeItemVo, TPatientFeeItemQuery> {
}
