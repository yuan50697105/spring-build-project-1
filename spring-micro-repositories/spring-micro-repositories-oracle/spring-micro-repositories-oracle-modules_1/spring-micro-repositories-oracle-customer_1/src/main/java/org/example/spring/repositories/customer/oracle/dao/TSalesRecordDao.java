package org.example.spring.repositories.customer.oracle.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.oracle.table.po.TSalesRecord;
import org.example.spring.repositories.customer.oracle.table.query.TSalesRecordQuery;

public interface TSalesRecordDao extends TkBaseDao<TSalesRecord, TSalesRecordQuery> {
}
