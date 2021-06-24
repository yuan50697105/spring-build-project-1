package org.example.spring.repositories.patient.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.patient.mssql.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientTeamMealFeeItemVo;

public interface TPatientTeamMealFeeItemRepository extends IBaseRepository<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery> {
}
