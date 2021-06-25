package org.example.spring.repositories.patient.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.mssql.converter.TPatientTeamMealFeeItemConverter;
import org.example.spring.repositories.patient.mssql.dao.TPatientTeamMealFeeItemDao;
import org.example.spring.repositories.patient.mssql.repository.TPatientTeamMealFeeItemRepository;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientTeamMealFeeItemDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.patient.mssql.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientTeamMealFeeItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealFeeItemRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemDTO, TPatientTeamMealFeeItemVo, TPatientTeamMealFeeItemQuery, TPatientTeamMealFeeItemConverter, TPatientTeamMealFeeItemDao> implements TPatientTeamMealFeeItemRepository {
}