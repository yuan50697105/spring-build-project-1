package org.example.spring.repositories.report.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.report.postgres.table.po.TPersonalReportSummary;
import org.example.spring.repositories.report.postgres.table.query.TPersonalReportSummaryQuery;

public interface TPersonalReportSummaryDao extends TkBaseDao<TPersonalReportSummary, TPersonalReportSummaryQuery> {
}
