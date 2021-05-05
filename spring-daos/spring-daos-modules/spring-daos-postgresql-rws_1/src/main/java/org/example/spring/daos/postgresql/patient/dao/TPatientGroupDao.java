package org.example.spring.daos.postgresql.patient.dao;

import org.example.spring.daos.postgresql.patient.table.po.TPatientGroup;
import org.example.spring.daos.postgresql.patient.table.query.TPatientGroupQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TPatientGroupDao extends TkBaseDao<TPatientGroup, TPatientGroupQuery> {
    boolean existById(Long id);

    boolean removeByTeamIds(List<Long> teamIds);
}