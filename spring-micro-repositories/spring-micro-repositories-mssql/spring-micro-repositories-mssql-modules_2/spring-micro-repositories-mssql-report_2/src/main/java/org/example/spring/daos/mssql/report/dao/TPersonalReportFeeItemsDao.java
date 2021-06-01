package org.example.spring.daos.mssql.report.dao;

import org.example.spring.daos.mssql.report.table.po.TPersonalReportFeeItems;
import org.example.spring.daos.mssql.report.table.query.TPersonalReportFeeItemsQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPersonalReportFeeItemsDao extends TkBaseDao<TPersonalReportFeeItems, TPersonalReportFeeItemsQuery> {
}
