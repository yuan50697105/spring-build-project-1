package org.example.spring.repositories.postgres.report.dao;

import org.example.spring.repositories.postgres.report.table.po.TPersonalReportSummary;
import org.example.spring.repositories.postgres.report.table.query.TPersonalReportSummaryQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPersonalReportSummaryDao extends TkBaseDao<TPersonalReportSummary, TPersonalReportSummaryQuery> {
}
