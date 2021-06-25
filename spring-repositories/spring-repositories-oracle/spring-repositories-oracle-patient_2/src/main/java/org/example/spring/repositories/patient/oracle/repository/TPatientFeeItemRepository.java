package org.example.spring.repositories.patient.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientFeeItem;
import org.example.spring.repositories.patient.oracle.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientFeeItemVo;

public interface TPatientFeeItemRepository extends IBaseRepository<TPatientFeeItem, TPatientFeeItemDTO, TPatientFeeItemVo, TPatientFeeItemQuery> {
}
