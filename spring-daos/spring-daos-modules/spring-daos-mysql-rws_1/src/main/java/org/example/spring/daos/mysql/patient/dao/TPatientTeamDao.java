package org.example.spring.daos.mysql.patient.dao;

import org.example.spring.daos.mysql.patient.table.po.TPatientTeam;
import org.example.spring.daos.mysql.patient.table.query.TPatientTeamQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientTeamDao extends TkBaseDao<TPatientTeam, TPatientTeamQuery> {
    boolean existById(Long id);
}