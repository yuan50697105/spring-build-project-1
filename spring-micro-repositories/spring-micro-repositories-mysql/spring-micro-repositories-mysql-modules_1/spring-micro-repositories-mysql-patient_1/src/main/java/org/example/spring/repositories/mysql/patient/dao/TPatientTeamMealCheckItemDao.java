package org.example.spring.repositories.mysql.patient.dao;

import org.example.spring.repositories.mysql.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TPatientTeamMealCheckItemDao extends TkBaseDao<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemQuery> {
    boolean removeByTeamMealIds(List<Long> ids);
}
