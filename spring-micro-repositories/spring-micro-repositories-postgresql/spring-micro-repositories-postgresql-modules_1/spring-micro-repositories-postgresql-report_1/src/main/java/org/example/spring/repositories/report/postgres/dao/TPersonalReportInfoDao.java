package org.example.spring.repositories.report.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.report.postgres.table.po.TPersonalReportInfo;
import org.example.spring.repositories.report.postgres.table.query.TPersonalReportInfoQuery;

public interface TPersonalReportInfoDao extends TkBaseDao<TPersonalReportInfo, TPersonalReportInfoQuery> {
}
