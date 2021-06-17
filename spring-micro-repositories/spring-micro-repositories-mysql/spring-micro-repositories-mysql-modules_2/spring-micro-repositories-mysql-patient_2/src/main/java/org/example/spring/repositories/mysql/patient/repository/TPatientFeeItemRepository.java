package org.example.spring.repositories.mysql.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatientFeeItem;
import org.example.spring.repositories.mysql.patient.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientFeeItemVo;

public interface TPatientFeeItemRepository extends IBaseRepository<TPatientFeeItem, TPatientFeeItemDTO, TPatientFeeItemVo, TPatientFeeItemQuery> {
}
