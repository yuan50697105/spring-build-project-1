package org.example.spring.repositories.mssql.report.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.mssql.report.table.po.TPersonalReportCheckItems;
import org.example.spring.repositories.mssql.report.table.query.TPersonalReportCheckItemsQuery;

public interface TPersonalReportCheckItemsDao extends TkBaseDao<TPersonalReportCheckItems, TPersonalReportCheckItemsQuery> {
}
