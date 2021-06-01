package org.example.spring.repositories.postgres.patient.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.postgres.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.postgres.patient.table.query.TPatientTeamMealCheckItemQuery;

import java.util.List;

public interface TPatientTeamMealCheckItemDao extends TkBaseDao<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemQuery> {
    boolean removeByTeamMealIds(List<Long> ids);
}
