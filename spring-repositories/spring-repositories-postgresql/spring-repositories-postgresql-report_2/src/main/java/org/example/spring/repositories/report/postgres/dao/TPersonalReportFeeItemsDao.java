package org.example.spring.repositories.report.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.report.postgres.table.po.TPersonalReportFeeItems;
import org.example.spring.repositories.report.postgres.table.query.TPersonalReportFeeItemsQuery;

public interface TPersonalReportFeeItemsDao extends TkBaseDao<TPersonalReportFeeItems, TPersonalReportFeeItemsQuery> {
}
