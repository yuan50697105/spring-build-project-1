package org.example.spring.infrastructures.postgresql.report.dao;

import org.example.spring.infrastructures.postgresql.report.table.po.TReportInfo;
import org.example.spring.infrastructures.postgresql.report.table.query.TReportInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TReportInfoDao extends TkBaseDao<TReportInfo, TReportInfoQuery> {
}
