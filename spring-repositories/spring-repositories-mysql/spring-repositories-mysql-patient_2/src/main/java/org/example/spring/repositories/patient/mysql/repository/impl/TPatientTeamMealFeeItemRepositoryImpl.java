package org.example.spring.repositories.patient.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.mysql.converter.TPatientTeamMealFeeItemConverter;
import org.example.spring.repositories.patient.mysql.dao.TPatientTeamMealFeeItemDao;
import org.example.spring.repositories.patient.mysql.repository.TPatientTeamMealFeeItemRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.patient.mysql.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientTeamMealFeeItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealFeeItemRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery, TPatientTeamMealFeeItemConverter, TPatientTeamMealFeeItemDao> implements TPatientTeamMealFeeItemRepository {
}