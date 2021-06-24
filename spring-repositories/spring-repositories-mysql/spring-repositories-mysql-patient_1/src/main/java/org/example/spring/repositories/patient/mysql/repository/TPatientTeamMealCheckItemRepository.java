package org.example.spring.repositories.patient.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientTeamMealCheckItemDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.patient.mysql.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientTeamMealCheckItemVo;

public interface TPatientTeamMealCheckItemRepository extends IBaseRepository<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemDTO, TPatientTeamMealCheckItemVo, TPatientTeamMealCheckItemQuery> {
}
