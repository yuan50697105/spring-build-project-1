package org.example.spring.repositories.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.patient.converter.TPatientTeamConverter;
import org.example.spring.repositories.mysql.patient.converter.TPatientTeamMealCheckItemConverter;
import org.example.spring.repositories.mysql.patient.dao.TPatientTeamDao;
import org.example.spring.repositories.mysql.patient.dao.TPatientTeamMealCheckItemDao;
import org.example.spring.repositories.mysql.patient.repository.TPatientTeamMealCheckItemRepository;
import org.example.spring.repositories.mysql.patient.repository.TPatientTeamRepository;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientTeamMealCheckItemDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeam;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientTeamMealCheckItemVo;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientTeamVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealCheckItemRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemDTO, TPatientTeamMealCheckItemVo, TPatientTeamMealCheckItemQuery, TPatientTeamMealCheckItemConverter, TPatientTeamMealCheckItemDao> implements TPatientTeamMealCheckItemRepository {
}