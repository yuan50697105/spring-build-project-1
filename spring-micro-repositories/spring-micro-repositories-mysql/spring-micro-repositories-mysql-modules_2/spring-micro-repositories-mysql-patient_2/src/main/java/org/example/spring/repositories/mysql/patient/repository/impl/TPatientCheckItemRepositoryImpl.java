package org.example.spring.repositories.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.patient.converter.TPatientCheckItemConverter;
import org.example.spring.repositories.mysql.patient.converter.TPatientConverter;
import org.example.spring.repositories.mysql.patient.dao.TPatientCheckItemDao;
import org.example.spring.repositories.mysql.patient.dao.TPatientDao;
import org.example.spring.repositories.mysql.patient.repository.TPatientCheckItemRepository;
import org.example.spring.repositories.mysql.patient.repository.TPatientRepository;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatient;
import org.example.spring.repositories.mysql.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.mysql.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.mysql.patient.table.query.TPatientQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientCheckItemVo;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientCheckItemRepositoryImpl extends IBaseRepositoryImpl<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery, TPatientCheckItemConverter, TPatientCheckItemDao> implements TPatientCheckItemRepository {
}