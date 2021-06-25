package org.example.spring.repositories.patient.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.oracle.converter.TPatientTeamMealFeeItemConverter;
import org.example.spring.repositories.patient.oracle.dao.TPatientTeamMealFeeItemDao;
import org.example.spring.repositories.patient.oracle.repository.TPatientTeamMealFeeItemRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.patient.oracle.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientTeamMealFeeItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealFeeItemRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery, TPatientTeamMealFeeItemConverter, TPatientTeamMealFeeItemDao> implements TPatientTeamMealFeeItemRepository {
}