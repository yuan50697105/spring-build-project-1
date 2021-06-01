package org.example.spring.daos.mssql.report.dao;

import org.example.spring.daos.mssql.report.table.po.TPersonalReportCheckItems;
import org.example.spring.daos.mssql.report.table.query.TPersonalReportCheckItemsQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPersonalReportCheckItemsDao extends TkBaseDao<TPersonalReportCheckItems, TPersonalReportCheckItemsQuery> {
}
