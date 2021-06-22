package org.example.spring.repositories.aggregation.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.aggregation.patient.table.dto.TPatientTeamMealCheckItemDTO;
import org.example.spring.repositories.aggregation.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.aggregation.patient.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.repositories.aggregation.patient.table.vo.TPatientTeamMealCheckItemVo;

public interface TPatientTeamMealCheckItemRepository extends IBaseRepository<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemDTO, TPatientTeamMealCheckItemVo, TPatientTeamMealCheckItemQuery> {
}
