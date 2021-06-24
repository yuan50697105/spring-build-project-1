package org.example.spring.repositories.customer.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.mssql.table.po.TSalesRecord;
import org.example.spring.repositories.customer.mssql.table.query.TSalesRecordQuery;

public interface TSalesRecordDao extends TkBaseDao<TSalesRecord, TSalesRecordQuery> {
}
