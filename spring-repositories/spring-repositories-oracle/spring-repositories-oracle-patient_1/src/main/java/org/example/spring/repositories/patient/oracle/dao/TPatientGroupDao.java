package org.example.spring.repositories.patient.oracle.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.patient.oracle.table.po.TPatientGroup;
import org.example.spring.repositories.patient.oracle.table.query.TPatientGroupQuery;

import java.util.List;

public interface TPatientGroupDao extends TkBaseDao<TPatientGroup, TPatientGroupQuery> {
    boolean existById(Long id);

    boolean removeByTeamIds(List<Long> teamIds);
}
