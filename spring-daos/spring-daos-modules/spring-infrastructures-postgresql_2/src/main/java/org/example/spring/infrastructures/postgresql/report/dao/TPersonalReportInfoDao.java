package org.example.spring.infrastructures.postgresql.report.dao;

import org.example.spring.infrastructures.postgresql.report.table.po.TPersonalReportInfo;
import org.example.spring.infrastructures.postgresql.report.table.query.TPersonalReportInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPersonalReportInfoDao extends TkBaseDao<TPersonalReportInfo, TPersonalReportInfoQuery> {
}
