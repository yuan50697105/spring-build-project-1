package org.example.spring.repositories.mysql.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeam;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientTeamMealFeeItemVo;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientTeamVo;

public interface TPatientTeamMealFeeItemRepository extends IBaseRepository<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery> {
}
