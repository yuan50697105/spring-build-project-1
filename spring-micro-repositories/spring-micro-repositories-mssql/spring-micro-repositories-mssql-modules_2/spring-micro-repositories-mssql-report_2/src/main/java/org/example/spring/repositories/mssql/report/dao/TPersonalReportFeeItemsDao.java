package org.example.spring.repositories.mssql.report.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.mssql.report.table.po.TPersonalReportFeeItems;
import org.example.spring.repositories.mssql.report.table.query.TPersonalReportFeeItemsQuery;

public interface TPersonalReportFeeItemsDao extends TkBaseDao<TPersonalReportFeeItems, TPersonalReportFeeItemsQuery> {
}
