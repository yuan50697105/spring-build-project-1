package org.example.spring.repositories.report.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.report.mysql.table.po.TPersonalReportCheckItems;
import org.example.spring.repositories.report.mysql.table.query.TPersonalReportCheckItemsQuery;

public interface TPersonalReportCheckItemsDao extends TkBaseDao<TPersonalReportCheckItems, TPersonalReportCheckItemsQuery> {
}
