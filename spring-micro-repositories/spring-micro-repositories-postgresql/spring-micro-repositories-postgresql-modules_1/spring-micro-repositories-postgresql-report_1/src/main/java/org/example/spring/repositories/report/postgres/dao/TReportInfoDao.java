package org.example.spring.repositories.report.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.report.postgres.table.po.TReportInfo;
import org.example.spring.repositories.report.postgres.table.query.TReportInfoQuery;

public interface TReportInfoDao extends TkBaseDao<TReportInfo, TReportInfoQuery> {
}
