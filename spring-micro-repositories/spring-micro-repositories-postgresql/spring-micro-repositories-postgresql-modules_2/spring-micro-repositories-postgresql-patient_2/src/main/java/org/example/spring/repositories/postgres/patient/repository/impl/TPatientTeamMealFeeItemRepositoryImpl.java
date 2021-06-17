package org.example.spring.repositories.postgres.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.postgres.patient.converter.TPatientTeamMealFeeItemConverter;
import org.example.spring.repositories.postgres.patient.dao.TPatientTeamMealFeeItemDao;
import org.example.spring.repositories.postgres.patient.repository.TPatientTeamMealFeeItemRepository;
import org.example.spring.repositories.postgres.patient.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.postgres.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.postgres.patient.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.postgres.patient.table.vo.TPatientTeamMealFeeItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealFeeItemRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery, TPatientTeamMealFeeItemConverter, TPatientTeamMealFeeItemDao> implements TPatientTeamMealFeeItemRepository {
}