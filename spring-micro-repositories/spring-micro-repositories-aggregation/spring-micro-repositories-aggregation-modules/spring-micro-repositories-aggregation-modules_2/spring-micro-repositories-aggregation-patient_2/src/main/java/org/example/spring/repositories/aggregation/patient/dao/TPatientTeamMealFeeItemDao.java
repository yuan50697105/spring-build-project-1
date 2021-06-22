package org.example.spring.repositories.aggregation.patient.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.aggregation.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.aggregation.patient.table.query.TPatientTeamMealFeeItemQuery;

import java.util.List;

public interface TPatientTeamMealFeeItemDao extends TkBaseDao<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemQuery> {
    boolean removeByTeamMealIds(List<Long> ids);

    List<TPatientTeamMealFeeItem> listByTeamMealId(Long id);
}
