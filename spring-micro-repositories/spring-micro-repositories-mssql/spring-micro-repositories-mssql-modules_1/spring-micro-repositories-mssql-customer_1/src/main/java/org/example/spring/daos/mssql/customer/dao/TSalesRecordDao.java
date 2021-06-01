package org.example.spring.daos.mssql.customer.dao;

import org.example.spring.daos.mssql.customer.table.po.TSalesRecord;
import org.example.spring.daos.mssql.customer.table.query.TSalesRecordQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TSalesRecordDao extends TkBaseDao<TSalesRecord, TSalesRecordQuery> {
}
