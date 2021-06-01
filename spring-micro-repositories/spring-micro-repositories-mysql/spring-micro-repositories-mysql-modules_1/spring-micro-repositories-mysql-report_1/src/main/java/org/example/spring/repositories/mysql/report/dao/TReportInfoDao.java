package org.example.spring.repositories.mysql.report.dao;

import org.example.spring.repositories.mysql.report.table.po.TReportInfo;
import org.example.spring.repositories.mysql.report.table.query.TReportInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TReportInfoDao extends TkBaseDao<TReportInfo, TReportInfoQuery> {
}
