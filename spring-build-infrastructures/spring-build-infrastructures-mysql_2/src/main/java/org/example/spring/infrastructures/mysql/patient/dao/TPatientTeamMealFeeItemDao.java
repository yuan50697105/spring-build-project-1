package org.example.spring.infrastructures.mysql.patient.dao;

import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientTeamMealFeeItemDao extends TkBaseDao<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemQuery> {
}
