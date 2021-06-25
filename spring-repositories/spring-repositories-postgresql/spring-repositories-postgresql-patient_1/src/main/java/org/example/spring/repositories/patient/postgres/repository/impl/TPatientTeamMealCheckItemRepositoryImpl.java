package org.example.spring.repositories.patient.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.postgres.converter.TPatientTeamMealCheckItemConverter;
import org.example.spring.repositories.patient.postgres.dao.TPatientTeamMealCheckItemDao;
import org.example.spring.repositories.patient.postgres.repository.TPatientTeamMealCheckItemRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientTeamMealCheckItemDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.patient.postgres.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientTeamMealCheckItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealCheckItemRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemDTO, TPatientTeamMealCheckItemVo, TPatientTeamMealCheckItemQuery, TPatientTeamMealCheckItemConverter, TPatientTeamMealCheckItemDao> implements TPatientTeamMealCheckItemRepository {
}