package org.example.spring.repositories.patient.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientFeeItem;
import org.example.spring.repositories.patient.mysql.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientFeeItemVo;

public interface TPatientFeeItemRepository extends IBaseRepository<TPatientFeeItem, TPatientFeeItemDTO, TPatientFeeItemVo, TPatientFeeItemQuery> {
}
