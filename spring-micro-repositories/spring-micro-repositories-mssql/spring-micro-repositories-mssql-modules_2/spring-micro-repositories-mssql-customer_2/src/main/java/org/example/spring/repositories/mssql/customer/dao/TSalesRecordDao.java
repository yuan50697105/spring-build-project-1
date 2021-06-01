package org.example.spring.repositories.mssql.customer.dao;

import org.example.spring.repositories.mssql.customer.table.po.TSalesRecord;
import org.example.spring.repositories.mssql.customer.table.query.TSalesRecordQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TSalesRecordDao extends TkBaseDao<TSalesRecord, TSalesRecordQuery> {
}
