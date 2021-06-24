package org.example.spring.repositories.patient.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.patient.mysql.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientTeamMealFeeItemVo;

public interface TPatientTeamMealFeeItemRepository extends IBaseRepository<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery> {
}
