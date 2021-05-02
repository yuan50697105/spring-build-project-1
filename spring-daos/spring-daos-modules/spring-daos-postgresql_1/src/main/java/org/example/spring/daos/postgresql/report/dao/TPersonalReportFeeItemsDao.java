package org.example.spring.daos.postgresql.report.dao;

import org.example.spring.daos.postgresql.report.table.po.TPersonalReportFeeItems;
import org.example.spring.daos.postgresql.report.table.query.TPersonalReportFeeItemsQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPersonalReportFeeItemsDao extends TkBaseDao<TPersonalReportFeeItems, TPersonalReportFeeItemsQuery> {
}
