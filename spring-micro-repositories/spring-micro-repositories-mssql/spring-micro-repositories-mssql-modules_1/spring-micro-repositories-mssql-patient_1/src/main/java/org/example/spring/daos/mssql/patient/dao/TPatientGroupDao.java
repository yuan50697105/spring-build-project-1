package org.example.spring.daos.mssql.patient.dao;

import org.example.spring.daos.mssql.patient.table.po.TPatientGroup;
import org.example.spring.daos.mssql.patient.table.query.TPatientGroupQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TPatientGroupDao extends TkBaseDao<TPatientGroup, TPatientGroupQuery> {
    boolean existById(Long id);

    boolean removeByTeamIds(List<Long> teamIds);
}
