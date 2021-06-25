package org.example.spring.repositories.report.oracle.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.report.oracle.table.po.TPersonalReportSummary;
import org.example.spring.repositories.report.oracle.table.query.TPersonalReportSummaryQuery;

public interface TPersonalReportSummaryDao extends TkBaseDao<TPersonalReportSummary, TPersonalReportSummaryQuery> {
}
