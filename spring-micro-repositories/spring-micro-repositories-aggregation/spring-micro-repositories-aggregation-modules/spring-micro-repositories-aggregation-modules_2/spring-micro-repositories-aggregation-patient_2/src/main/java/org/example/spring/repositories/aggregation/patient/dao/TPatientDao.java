package org.example.spring.repositories.aggregation.patient.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.aggregation.patient.table.po.TPatient;
import org.example.spring.repositories.aggregation.patient.table.query.TPatientQuery;

import java.util.List;

public interface TPatientDao extends TkBaseDao<TPatient, TPatientQuery> {
    boolean removeByTeamIds(List<Long> teamIds);

    boolean removeByGroupIds(List<Long> ids);
}
