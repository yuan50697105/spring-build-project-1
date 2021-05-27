package org.example.spring.daos.postgresql.report.dao;

import org.example.spring.daos.postgresql.report.table.po.TPersonalReportInfo;
import org.example.spring.daos.postgresql.report.table.query.TPersonalReportInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPersonalReportInfoDao extends TkBaseDao<TPersonalReportInfo, TPersonalReportInfoQuery> {
}
