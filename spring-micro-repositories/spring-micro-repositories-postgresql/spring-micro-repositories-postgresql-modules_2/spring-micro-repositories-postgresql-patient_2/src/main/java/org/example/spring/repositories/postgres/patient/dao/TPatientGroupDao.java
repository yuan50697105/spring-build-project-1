package org.example.spring.repositories.postgres.patient.dao;

import org.example.spring.repositories.postgres.patient.table.po.TPatientGroup;
import org.example.spring.repositories.postgres.patient.table.query.TPatientGroupQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TPatientGroupDao extends TkBaseDao<TPatientGroup, TPatientGroupQuery> {
    boolean existById(Long id);

    boolean removeByTeamIds(List<Long> teamIds);
}
