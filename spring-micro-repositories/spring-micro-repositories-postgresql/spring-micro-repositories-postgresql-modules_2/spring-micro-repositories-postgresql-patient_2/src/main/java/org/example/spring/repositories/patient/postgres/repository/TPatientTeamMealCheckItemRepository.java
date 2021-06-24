package org.example.spring.repositories.patient.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientTeamMealCheckItemDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.patient.postgres.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientTeamMealCheckItemVo;

public interface TPatientTeamMealCheckItemRepository extends IBaseRepository<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemDTO, TPatientTeamMealCheckItemVo, TPatientTeamMealCheckItemQuery> {
}
