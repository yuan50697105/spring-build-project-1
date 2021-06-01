package org.example.spring.repositories.postgres.report.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.postgres.report.table.po.TReportInfo;
import org.example.spring.repositories.postgres.report.table.query.TReportInfoQuery;

public interface TReportInfoDao extends TkBaseDao<TReportInfo, TReportInfoQuery> {
}
