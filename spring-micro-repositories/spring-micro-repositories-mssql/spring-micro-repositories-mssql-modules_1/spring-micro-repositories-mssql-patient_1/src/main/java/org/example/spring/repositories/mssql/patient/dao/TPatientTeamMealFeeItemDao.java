package org.example.spring.repositories.mssql.patient.dao;

import org.example.spring.repositories.mssql.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.mssql.patient.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TPatientTeamMealFeeItemDao extends TkBaseDao<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemQuery> {
    boolean removeByTeamMealIds(List<Long> ids);

    List<TPatientTeamMealFeeItem> listByTeamMealId(Long id);
}
