package org.example.spring.repositories.postgres.report.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.postgres.report.table.po.TPersonalReportCheckItems;
import org.example.spring.repositories.postgres.report.table.query.TPersonalReportCheckItemsQuery;

public interface TPersonalReportCheckItemsDao extends TkBaseDao<TPersonalReportCheckItems, TPersonalReportCheckItemsQuery> {
}
