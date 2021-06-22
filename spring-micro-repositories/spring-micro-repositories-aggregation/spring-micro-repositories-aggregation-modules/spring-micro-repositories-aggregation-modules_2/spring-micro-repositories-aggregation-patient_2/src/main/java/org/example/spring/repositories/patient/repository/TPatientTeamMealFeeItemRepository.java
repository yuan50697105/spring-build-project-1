package org.example.spring.repositories.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.patient.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.patient.table.vo.TPatientTeamMealFeeItemVo;

public interface TPatientTeamMealFeeItemRepository extends IBaseRepository<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery> {
}
