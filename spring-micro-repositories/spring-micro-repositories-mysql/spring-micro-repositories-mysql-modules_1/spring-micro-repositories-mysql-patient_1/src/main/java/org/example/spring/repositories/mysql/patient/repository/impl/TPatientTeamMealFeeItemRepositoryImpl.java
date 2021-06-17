package org.example.spring.repositories.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.patient.converter.TPatientTeamConverter;
import org.example.spring.repositories.mysql.patient.converter.TPatientTeamMealFeeItemConverter;
import org.example.spring.repositories.mysql.patient.dao.TPatientTeamDao;
import org.example.spring.repositories.mysql.patient.dao.TPatientTeamMealFeeItemDao;
import org.example.spring.repositories.mysql.patient.repository.TPatientTeamMealFeeItemRepository;
import org.example.spring.repositories.mysql.patient.repository.TPatientTeamRepository;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeam;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientTeamMealFeeItemVo;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientTeamVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealFeeItemRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery, TPatientTeamMealFeeItemConverter, TPatientTeamMealFeeItemDao> implements TPatientTeamMealFeeItemRepository {
}