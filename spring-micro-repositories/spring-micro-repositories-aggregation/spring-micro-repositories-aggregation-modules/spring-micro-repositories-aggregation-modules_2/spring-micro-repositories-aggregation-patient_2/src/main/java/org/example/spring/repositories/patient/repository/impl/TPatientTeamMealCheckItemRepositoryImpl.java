package org.example.spring.repositories.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.converter.TPatientTeamMealCheckItemConverter;
import org.example.spring.repositories.patient.dao.TPatientTeamMealCheckItemDao;
import org.example.spring.repositories.patient.repository.TPatientTeamMealCheckItemRepository;
import org.example.spring.repositories.patient.table.dto.TPatientTeamMealCheckItemDTO;
import org.example.spring.repositories.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.patient.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.repositories.patient.table.vo.TPatientTeamMealCheckItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealCheckItemRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemDTO, TPatientTeamMealCheckItemVo, TPatientTeamMealCheckItemQuery, TPatientTeamMealCheckItemConverter, TPatientTeamMealCheckItemDao> implements TPatientTeamMealCheckItemRepository {
}