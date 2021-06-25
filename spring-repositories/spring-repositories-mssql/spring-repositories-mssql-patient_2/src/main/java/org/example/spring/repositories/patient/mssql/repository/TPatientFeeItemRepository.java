package org.example.spring.repositories.patient.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientFeeItem;
import org.example.spring.repositories.patient.mssql.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientFeeItemVo;

public interface TPatientFeeItemRepository extends IBaseRepository<TPatientFeeItem, TPatientFeeItemDTO, TPatientFeeItemVo, TPatientFeeItemQuery> {
}
