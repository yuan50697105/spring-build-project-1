package org.example.spring.infrastructures.mysql.patient.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientDao;
import org.example.spring.infrastructures.mysql.patient.mapper.TPatientMapper;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatient;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TPatientDaoImpl extends TkBaseDaoImpl<TPatient, TPatientQuery, TPatientMapper> implements TPatientDao {
    @Override
    protected Wrapper<TPatient> queryWrapper(TPatientQuery tPatientQuery) {
        return null;
    }
}