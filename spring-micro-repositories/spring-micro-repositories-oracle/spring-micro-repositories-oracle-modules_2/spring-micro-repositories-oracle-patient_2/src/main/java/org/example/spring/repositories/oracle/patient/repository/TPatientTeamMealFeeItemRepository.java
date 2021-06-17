package org.example.spring.repositories.oracle.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.oracle.patient.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.oracle.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.oracle.patient.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.oracle.patient.table.vo.TPatientTeamMealFeeItemVo;

public interface TPatientTeamMealFeeItemRepository extends IBaseRepository<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery> {
}
