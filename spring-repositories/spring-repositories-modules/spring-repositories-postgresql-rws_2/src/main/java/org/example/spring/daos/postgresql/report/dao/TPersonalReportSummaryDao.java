package org.example.spring.daos.postgresql.report.dao;

import org.example.spring.daos.postgresql.report.table.po.TPersonalReportSummary;
import org.example.spring.daos.postgresql.report.table.query.TPersonalReportSummaryQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPersonalReportSummaryDao extends TkBaseDao<TPersonalReportSummary, TPersonalReportSummaryQuery> {
}
