package org.example.spring.repositories.mysql.patient.dao;

import org.example.spring.repositories.mysql.patient.table.po.TPatientTeam;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientTeamDao extends TkBaseDao<TPatientTeam, TPatientTeamQuery> {
    boolean existById(Long id);
}
