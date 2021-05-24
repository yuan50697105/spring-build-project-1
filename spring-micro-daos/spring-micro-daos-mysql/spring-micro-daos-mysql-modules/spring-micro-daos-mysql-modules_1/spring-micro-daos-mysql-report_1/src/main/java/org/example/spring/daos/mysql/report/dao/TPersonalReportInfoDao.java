package org.example.spring.daos.mysql.report.dao;

import org.example.spring.daos.mysql.report.table.po.TPersonalReportInfo;
import org.example.spring.daos.mysql.report.table.query.TPersonalReportInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPersonalReportInfoDao extends TkBaseDao<TPersonalReportInfo, TPersonalReportInfoQuery> {
}
