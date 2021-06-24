package org.example.spring.repositories.report.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.report.mysql.table.po.TPersonalReportInfo;
import org.example.spring.repositories.report.mysql.table.query.TPersonalReportInfoQuery;

public interface TPersonalReportInfoDao extends TkBaseDao<TPersonalReportInfo, TPersonalReportInfoQuery> {
}
