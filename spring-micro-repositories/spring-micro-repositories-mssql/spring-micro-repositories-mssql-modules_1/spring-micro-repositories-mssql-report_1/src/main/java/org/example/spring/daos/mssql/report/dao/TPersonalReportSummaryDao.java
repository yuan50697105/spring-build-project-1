package org.example.spring.daos.mssql.report.dao;

import org.example.spring.daos.mssql.report.table.po.TPersonalReportSummary;
import org.example.spring.daos.mssql.report.table.query.TPersonalReportSummaryQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPersonalReportSummaryDao extends TkBaseDao<TPersonalReportSummary, TPersonalReportSummaryQuery> {
}
