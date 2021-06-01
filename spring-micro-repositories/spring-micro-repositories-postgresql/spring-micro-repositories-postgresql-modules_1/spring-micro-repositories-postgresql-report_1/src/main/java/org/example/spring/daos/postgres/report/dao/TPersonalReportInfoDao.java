package org.example.spring.daos.postgres.report.dao;

import org.example.spring.daos.postgres.report.table.po.TPersonalReportInfo;
import org.example.spring.daos.postgres.report.table.query.TPersonalReportInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPersonalReportInfoDao extends TkBaseDao<TPersonalReportInfo, TPersonalReportInfoQuery> {
}
