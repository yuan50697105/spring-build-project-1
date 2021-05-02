package org.example.spring.infrastructures.postgresql.report.dao;

import org.example.spring.infrastructures.postgresql.report.table.po.TPersonalReportCheckItems;
import org.example.spring.infrastructures.postgresql.report.table.query.TPersonalReportCheckItemsQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPersonalReportCheckItemsDao extends TkBaseDao<TPersonalReportCheckItems, TPersonalReportCheckItemsQuery> {
}
