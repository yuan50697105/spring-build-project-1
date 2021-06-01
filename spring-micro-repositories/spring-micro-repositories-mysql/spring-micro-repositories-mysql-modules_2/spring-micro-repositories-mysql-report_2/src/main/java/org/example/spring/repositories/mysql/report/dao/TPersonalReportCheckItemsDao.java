package org.example.spring.repositories.mysql.report.dao;

import org.example.spring.repositories.mysql.report.table.po.TPersonalReportCheckItems;
import org.example.spring.repositories.mysql.report.table.query.TPersonalReportCheckItemsQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPersonalReportCheckItemsDao extends TkBaseDao<TPersonalReportCheckItems, TPersonalReportCheckItemsQuery> {
}
