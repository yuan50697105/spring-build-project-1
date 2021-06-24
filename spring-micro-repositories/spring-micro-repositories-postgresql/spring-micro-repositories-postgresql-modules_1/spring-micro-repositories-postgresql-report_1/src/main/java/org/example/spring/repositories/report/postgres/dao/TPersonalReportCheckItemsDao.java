package org.example.spring.repositories.report.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.report.postgres.table.po.TPersonalReportCheckItems;
import org.example.spring.repositories.report.postgres.table.query.TPersonalReportCheckItemsQuery;

public interface TPersonalReportCheckItemsDao extends TkBaseDao<TPersonalReportCheckItems, TPersonalReportCheckItemsQuery> {
}
