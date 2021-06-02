package org.example.spring.repositories.oracle.customer.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.oracle.customer.table.po.TSalesRecord;
import org.example.spring.repositories.oracle.customer.table.query.TSalesRecordQuery;

public interface TSalesRecordDao extends TkBaseDao<TSalesRecord, TSalesRecordQuery> {
}
