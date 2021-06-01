package org.example.spring.repositories.mysql.patient.dao;

import org.example.spring.daos.mysql.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.daos.mysql.patient.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamMealFeeItemQuery;

import java.util.List;

public interface TPatientTeamMealFeeItemDao extends TkBaseDao<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemQuery> {
    boolean removeByTeamMealIds(List<Long> ids);

    List<TPatientTeamMealFeeItem> listByTeamMealId(Long id);
}
