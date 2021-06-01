package org.example.spring.daos.mssql.report.dao;

import org.example.spring.daos.mssql.report.table.po.TReportInfo;
import org.example.spring.daos.mssql.report.table.query.TReportInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TReportInfoDao extends TkBaseDao<TReportInfo, TReportInfoQuery> {
}
