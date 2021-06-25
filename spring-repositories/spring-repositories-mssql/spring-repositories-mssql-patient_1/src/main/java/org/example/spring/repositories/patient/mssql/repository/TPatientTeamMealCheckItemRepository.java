package org.example.spring.repositories.patient.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientTeamMealCheckItemDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.patient.mssql.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientTeamMealCheckItemVo;

public interface TPatientTeamMealCheckItemRepository extends IBaseRepository<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemDTO, TPatientTeamMealCheckItemVo, TPatientTeamMealCheckItemQuery> {
}
