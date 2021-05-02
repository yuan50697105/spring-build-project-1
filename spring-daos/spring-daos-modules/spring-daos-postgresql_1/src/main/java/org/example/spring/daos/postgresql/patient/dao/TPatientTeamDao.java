package org.example.spring.daos.postgresql.patient.dao;

import org.example.spring.daos.postgresql.patient.table.po.TPatientTeam;
import org.example.spring.daos.postgresql.patient.table.query.TPatientTeamQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientTeamDao extends TkBaseDao<TPatientTeam, TPatientTeamQuery> {
    boolean existById(Long id);
}
