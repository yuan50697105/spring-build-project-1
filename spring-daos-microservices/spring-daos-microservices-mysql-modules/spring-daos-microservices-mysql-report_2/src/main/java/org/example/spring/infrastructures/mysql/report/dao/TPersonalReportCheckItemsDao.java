package org.example.spring.infrastructures.mysql.report.dao;

import org.example.spring.infrastructures.mysql.report.table.po.TPersonalReportCheckItems;
import org.example.spring.infrastructures.mysql.report.table.query.TPersonalReportCheckItemsQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPersonalReportCheckItemsDao extends TkBaseDao<TPersonalReportCheckItems, TPersonalReportCheckItemsQuery> {
}
