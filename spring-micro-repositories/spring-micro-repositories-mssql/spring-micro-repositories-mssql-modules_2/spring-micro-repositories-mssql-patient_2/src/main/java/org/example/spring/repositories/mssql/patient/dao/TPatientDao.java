package org.example.spring.repositories.mssql.patient.dao;

import org.example.spring.repositories.mssql.patient.table.po.TPatient;
import org.example.spring.repositories.mssql.patient.table.query.TPatientQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TPatientDao extends TkBaseDao<TPatient, TPatientQuery> {
    boolean removeByTeamIds(List<Long> teamIds);

    boolean removeByGroupIds(List<Long> ids);
}
