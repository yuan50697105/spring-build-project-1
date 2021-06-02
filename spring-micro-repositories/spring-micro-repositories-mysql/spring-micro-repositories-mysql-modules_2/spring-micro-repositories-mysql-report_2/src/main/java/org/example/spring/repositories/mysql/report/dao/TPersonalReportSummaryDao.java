package org.example.spring.repositories.mysql.report.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.mysql.report.table.po.TPersonalReportSummary;
import org.example.spring.repositories.mysql.report.table.query.TPersonalReportSummaryQuery;

public interface TPersonalReportSummaryDao extends TkBaseDao<TPersonalReportSummary, TPersonalReportSummaryQuery> {
}
