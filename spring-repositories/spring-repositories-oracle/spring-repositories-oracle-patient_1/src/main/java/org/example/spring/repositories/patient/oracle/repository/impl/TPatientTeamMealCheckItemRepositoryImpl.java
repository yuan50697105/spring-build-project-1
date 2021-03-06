package org.example.spring.repositories.patient.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.oracle.converter.TPatientTeamMealCheckItemConverter;
import org.example.spring.repositories.patient.oracle.dao.TPatientTeamMealCheckItemDao;
import org.example.spring.repositories.patient.oracle.repository.TPatientTeamMealCheckItemRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientTeamMealCheckItemDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.patient.oracle.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientTeamMealCheckItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealCheckItemRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemDTO, TPatientTeamMealCheckItemVo, TPatientTeamMealCheckItemQuery, TPatientTeamMealCheckItemConverter, TPatientTeamMealCheckItemDao> implements TPatientTeamMealCheckItemRepository {
}