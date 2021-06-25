package org.example.spring.repositories.patient.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.patient.oracle.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientTeamMealFeeItemVo;

public interface TPatientTeamMealFeeItemRepository extends IBaseRepository<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery> {
}
