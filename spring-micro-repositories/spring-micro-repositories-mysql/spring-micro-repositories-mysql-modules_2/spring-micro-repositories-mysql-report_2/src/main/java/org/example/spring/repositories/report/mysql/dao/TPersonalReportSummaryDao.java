package org.example.spring.repositories.report.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.report.mysql.table.po.TPersonalReportSummary;
import org.example.spring.repositories.report.mysql.table.query.TPersonalReportSummaryQuery;

public interface TPersonalReportSummaryDao extends TkBaseDao<TPersonalReportSummary, TPersonalReportSummaryQuery> {
}
