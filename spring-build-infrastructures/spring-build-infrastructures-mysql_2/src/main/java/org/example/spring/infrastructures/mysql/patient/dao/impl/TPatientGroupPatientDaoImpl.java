package org.example.spring.infrastructures.mysql.patient.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientGroupPatientDao;
import org.example.spring.infrastructures.mysql.patient.mapper.TPatientGroupPatientMapper;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroupPatient;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientGroupPatientQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class TPatientGroupPatientDaoImpl extends TkBaseDaoImpl<TPatientGroupPatient, TPatientGroupPatientQuery, TPatientGroupPatientMapper> implements TPatientGroupPatientDao {
    @Override
    protected Wrapper<TPatientGroupPatient> queryWrapper(TPatientGroupPatientQuery tPatientGroupPatientQuery) {
        return null;
    }
}