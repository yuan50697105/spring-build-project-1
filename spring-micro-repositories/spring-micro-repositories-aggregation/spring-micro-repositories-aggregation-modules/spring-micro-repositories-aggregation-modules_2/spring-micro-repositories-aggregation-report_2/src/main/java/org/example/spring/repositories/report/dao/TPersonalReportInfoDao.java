package org.example.spring.repositories.report.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.report.table.po.TPersonalReportInfo;
import org.example.spring.repositories.report.table.query.TPersonalReportInfoQuery;

public interface TPersonalReportInfoDao extends TkBaseDao<TPersonalReportInfo, TPersonalReportInfoQuery> {
}
