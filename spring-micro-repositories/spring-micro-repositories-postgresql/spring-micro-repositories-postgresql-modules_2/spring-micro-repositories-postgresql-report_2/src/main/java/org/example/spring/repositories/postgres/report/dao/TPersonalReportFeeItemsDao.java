package org.example.spring.repositories.postgres.report.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.postgres.report.table.po.TPersonalReportFeeItems;
import org.example.spring.repositories.postgres.report.table.query.TPersonalReportFeeItemsQuery;

public interface TPersonalReportFeeItemsDao extends TkBaseDao<TPersonalReportFeeItems, TPersonalReportFeeItemsQuery> {
}
