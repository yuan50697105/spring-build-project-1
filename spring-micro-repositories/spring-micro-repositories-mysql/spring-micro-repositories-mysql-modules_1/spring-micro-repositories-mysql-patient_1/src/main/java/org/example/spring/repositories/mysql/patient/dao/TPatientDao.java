package org.example.spring.repositories.mysql.patient.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.mysql.patient.table.po.TPatient;
import org.example.spring.repositories.mysql.patient.table.query.TPatientQuery;

import java.util.List;

public interface TPatientDao extends TkBaseDao<TPatient, TPatientQuery> {
    boolean removeByTeamIds(List<Long> teamIds);

    boolean removeByGroupIds(List<Long> ids);
}
