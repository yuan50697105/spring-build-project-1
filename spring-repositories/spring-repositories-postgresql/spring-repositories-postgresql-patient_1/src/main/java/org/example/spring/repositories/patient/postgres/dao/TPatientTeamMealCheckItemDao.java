package org.example.spring.repositories.patient.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.patient.postgres.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.patient.postgres.table.query.TPatientTeamMealCheckItemQuery;

import java.util.List;

public interface TPatientTeamMealCheckItemDao extends TkBaseDao<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemQuery> {
    boolean removeByTeamMealIds(List<Long> ids);
}
