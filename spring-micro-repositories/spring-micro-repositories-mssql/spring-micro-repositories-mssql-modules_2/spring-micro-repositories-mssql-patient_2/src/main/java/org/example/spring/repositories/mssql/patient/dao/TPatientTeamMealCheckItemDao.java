package org.example.spring.repositories.mssql.patient.dao;

import org.example.spring.repositories.mssql.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.mssql.patient.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TPatientTeamMealCheckItemDao extends TkBaseDao<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemQuery> {
    boolean removeByTeamMealIds(List<Long> ids);
}
