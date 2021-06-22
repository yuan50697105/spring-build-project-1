package org.example.spring.repositories.patient.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.patient.table.po.TPatientTeam;
import org.example.spring.repositories.patient.table.query.TPatientTeamQuery;

public interface TPatientTeamDao extends TkBaseDao<TPatientTeam, TPatientTeamQuery> {
    boolean existById(Long id);
}
