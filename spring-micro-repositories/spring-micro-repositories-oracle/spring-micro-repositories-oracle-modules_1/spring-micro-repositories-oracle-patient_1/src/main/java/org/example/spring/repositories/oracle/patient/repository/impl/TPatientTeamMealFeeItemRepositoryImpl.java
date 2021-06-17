package org.example.spring.repositories.oracle.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.oracle.patient.converter.TPatientTeamMealFeeItemConverter;
import org.example.spring.repositories.oracle.patient.dao.TPatientTeamMealFeeItemDao;
import org.example.spring.repositories.oracle.patient.repository.TPatientTeamMealFeeItemRepository;
import org.example.spring.repositories.oracle.patient.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.oracle.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.oracle.patient.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.oracle.patient.table.vo.TPatientTeamMealFeeItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealFeeItemRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery, TPatientTeamMealFeeItemConverter, TPatientTeamMealFeeItemDao> implements TPatientTeamMealFeeItemRepository {
}