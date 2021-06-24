package org.example.spring.repositories.patient.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.postgres.converter.TPatientTeamMealFeeItemConverter;
import org.example.spring.repositories.patient.postgres.dao.TPatientTeamMealFeeItemDao;
import org.example.spring.repositories.patient.postgres.repository.TPatientTeamMealFeeItemRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.patient.postgres.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientTeamMealFeeItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealFeeItemRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery, TPatientTeamMealFeeItemConverter, TPatientTeamMealFeeItemDao> implements TPatientTeamMealFeeItemRepository {
}