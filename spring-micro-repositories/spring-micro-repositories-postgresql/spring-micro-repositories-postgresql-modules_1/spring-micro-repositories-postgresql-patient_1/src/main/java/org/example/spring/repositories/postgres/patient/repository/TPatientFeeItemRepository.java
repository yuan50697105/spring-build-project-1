package org.example.spring.repositories.postgres.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.postgres.patient.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.postgres.patient.table.po.TPatientFeeItem;
import org.example.spring.repositories.postgres.patient.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.postgres.patient.table.vo.TPatientFeeItemVo;

public interface TPatientFeeItemRepository extends IBaseRepository<TPatientFeeItem, TPatientFeeItemDTO, TPatientFeeItemVo, TPatientFeeItemQuery> {
}
