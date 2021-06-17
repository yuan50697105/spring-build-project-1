package org.example.spring.repositories.oracle.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.oracle.patient.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.oracle.patient.table.po.TPatientFeeItem;
import org.example.spring.repositories.oracle.patient.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.oracle.patient.table.vo.TPatientFeeItemVo;

public interface TPatientFeeItemRepository extends IBaseRepository<TPatientFeeItem, TPatientFeeItemDTO, TPatientFeeItemVo, TPatientFeeItemQuery> {
}
