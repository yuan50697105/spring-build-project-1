package org.example.spring.repositories.patient.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.patient.postgres.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientTeamMealFeeItemVo;

public interface TPatientTeamMealFeeItemRepository extends IBaseRepository<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery> {
}
