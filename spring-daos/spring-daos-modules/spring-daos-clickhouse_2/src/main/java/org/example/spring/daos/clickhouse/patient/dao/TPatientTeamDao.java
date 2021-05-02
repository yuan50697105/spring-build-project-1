package org.example.spring.daos.clickhouse.patient.dao;

import org.example.spring.daos.clickhouse.patient.table.po.TPatientTeam;
import org.example.spring.daos.clickhouse.patient.table.query.TPatientTeamQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientTeamDao extends TkBaseDao<TPatientTeam, TPatientTeamQuery> {
    boolean existById(Long id);
}
