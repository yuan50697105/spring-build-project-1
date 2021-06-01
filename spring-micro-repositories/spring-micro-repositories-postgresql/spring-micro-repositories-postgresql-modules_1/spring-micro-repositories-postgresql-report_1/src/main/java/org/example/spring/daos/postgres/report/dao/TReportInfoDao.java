package org.example.spring.daos.postgres.report.dao;

import org.example.spring.daos.postgres.report.table.po.TReportInfo;
import org.example.spring.daos.postgres.report.table.query.TReportInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TReportInfoDao extends TkBaseDao<TReportInfo, TReportInfoQuery> {
}
