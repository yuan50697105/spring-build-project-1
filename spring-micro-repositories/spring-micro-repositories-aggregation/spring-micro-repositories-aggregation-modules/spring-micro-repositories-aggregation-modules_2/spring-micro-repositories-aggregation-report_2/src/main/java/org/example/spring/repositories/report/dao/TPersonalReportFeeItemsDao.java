package org.example.spring.repositories.report.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.report.table.po.TPersonalReportFeeItems;
import org.example.spring.repositories.report.table.query.TPersonalReportFeeItemsQuery;

public interface TPersonalReportFeeItemsDao extends TkBaseDao<TPersonalReportFeeItems, TPersonalReportFeeItemsQuery> {
}
