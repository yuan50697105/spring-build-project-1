package org.example.spring.repositories.postgres.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.postgres.patient.table.dto.TPatientTeamMealCheckItemDTO;
import org.example.spring.repositories.postgres.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.postgres.patient.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.repositories.postgres.patient.table.vo.TPatientTeamMealCheckItemVo;

public interface TPatientTeamMealCheckItemRepository extends IBaseRepository<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemDTO, TPatientTeamMealCheckItemVo, TPatientTeamMealCheckItemQuery> {
}
