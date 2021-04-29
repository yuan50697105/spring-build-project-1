package org.example.spring.infrastructures.postgresql.report.dao;

import org.example.spring.infrastructures.postgresql.report.table.po.TPersonalReportFeeItems;
import org.example.spring.infrastructures.postgresql.report.table.query.TPersonalReportFeeItemsQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPersonalReportFeeItemsDao extends TkBaseDao<TPersonalReportFeeItems, TPersonalReportFeeItemsQuery> {
}
