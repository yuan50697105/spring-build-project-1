package org.example.spring.repositories.mssql.patient.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.mssql.patient.table.po.TPatientTeam;
import org.example.spring.repositories.mssql.patient.table.query.TPatientTeamQuery;

public interface TPatientTeamDao extends TkBaseDao<TPatientTeam, TPatientTeamQuery> {
    boolean existById(Long id);
}
