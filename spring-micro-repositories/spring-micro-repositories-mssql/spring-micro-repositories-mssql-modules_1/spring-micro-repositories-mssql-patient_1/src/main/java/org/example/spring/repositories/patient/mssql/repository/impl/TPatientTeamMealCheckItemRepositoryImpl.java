package org.example.spring.repositories.patient.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.mssql.converter.TPatientTeamMealCheckItemConverter;
import org.example.spring.repositories.patient.mssql.dao.TPatientTeamMealCheckItemDao;
import org.example.spring.repositories.patient.mssql.repository.TPatientTeamMealCheckItemRepository;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientTeamMealCheckItemDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.patient.mssql.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientTeamMealCheckItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealCheckItemRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemDTO, TPatientTeamMealCheckItemVo, TPatientTeamMealCheckItemQuery, TPatientTeamMealCheckItemConverter, TPatientTeamMealCheckItemDao> implements TPatientTeamMealCheckItemRepository {
}