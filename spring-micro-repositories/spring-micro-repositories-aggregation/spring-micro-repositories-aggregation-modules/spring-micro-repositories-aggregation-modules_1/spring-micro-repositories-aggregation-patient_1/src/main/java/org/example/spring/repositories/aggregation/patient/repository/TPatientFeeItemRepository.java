package org.example.spring.repositories.aggregation.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.aggregation.patient.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.aggregation.patient.table.po.TPatientFeeItem;
import org.example.spring.repositories.aggregation.patient.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.aggregation.patient.table.vo.TPatientFeeItemVo;

public interface TPatientFeeItemRepository extends IBaseRepository<TPatientFeeItem, TPatientFeeItemDTO, TPatientFeeItemVo, TPatientFeeItemQuery> {
}
