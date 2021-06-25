package org.example.spring.repositories.patient.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.patient.postgres.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.patient.postgres.table.query.TPatientTeamMealFeeItemQuery;

import java.util.List;

public interface TPatientTeamMealFeeItemDao extends TkBaseDao<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemQuery> {
    boolean removeByTeamMealIds(List<Long> ids);

    List<TPatientTeamMealFeeItem> listByTeamMealId(Long id);
}
