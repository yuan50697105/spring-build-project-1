package org.example.spring.repositories.report.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.report.mysql.table.po.TPersonalReportFeeItems;
import org.example.spring.repositories.report.mysql.table.query.TPersonalReportFeeItemsQuery;

public interface TPersonalReportFeeItemsDao extends TkBaseDao<TPersonalReportFeeItems, TPersonalReportFeeItemsQuery> {
}
