package org.example.spring.repositories.patient.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientTeamMealCheckItemDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.patient.oracle.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientTeamMealCheckItemVo;

public interface TPatientTeamMealCheckItemRepository extends IBaseRepository<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemDTO, TPatientTeamMealCheckItemVo, TPatientTeamMealCheckItemQuery> {
}
