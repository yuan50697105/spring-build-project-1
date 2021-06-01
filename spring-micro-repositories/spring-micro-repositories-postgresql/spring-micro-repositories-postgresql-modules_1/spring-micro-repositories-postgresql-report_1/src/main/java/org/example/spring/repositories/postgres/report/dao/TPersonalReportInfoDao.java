package org.example.spring.repositories.postgres.report.dao;

import org.example.spring.repositories.postgres.report.table.po.TPersonalReportInfo;
import org.example.spring.repositories.postgres.report.table.query.TPersonalReportInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPersonalReportInfoDao extends TkBaseDao<TPersonalReportInfo, TPersonalReportInfoQuery> {
}
