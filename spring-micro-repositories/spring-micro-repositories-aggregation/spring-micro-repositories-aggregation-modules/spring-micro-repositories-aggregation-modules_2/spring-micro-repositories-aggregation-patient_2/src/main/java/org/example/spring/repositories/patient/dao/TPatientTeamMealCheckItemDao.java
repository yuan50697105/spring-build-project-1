package org.example.spring.repositories.patient.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.patient.table.query.TPatientTeamMealCheckItemQuery;

import java.util.List;

public interface TPatientTeamMealCheckItemDao extends TkBaseDao<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemQuery> {
    boolean removeByTeamMealIds(List<Long> ids);
}
