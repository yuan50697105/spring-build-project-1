package org.example.spring.infrastructures.postgresql.patient.dao;

import org.example.spring.infrastructures.postgresql.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.infrastructures.postgresql.patient.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TPatientTeamMealFeeItemDao extends TkBaseDao<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemQuery> {
    boolean removeByTeamMealIds(List<Long> ids);

    List<TPatientTeamMealFeeItem> listByTeamMealId(Long id);
}
