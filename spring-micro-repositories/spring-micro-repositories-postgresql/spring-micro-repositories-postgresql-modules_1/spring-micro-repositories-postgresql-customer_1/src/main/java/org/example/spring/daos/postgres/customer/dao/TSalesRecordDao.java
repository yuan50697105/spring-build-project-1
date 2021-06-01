package org.example.spring.daos.postgres.customer.dao;

import org.example.spring.daos.postgres.customer.table.po.TSalesRecord;
import org.example.spring.daos.postgres.customer.table.query.TSalesRecordQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TSalesRecordDao extends TkBaseDao<TSalesRecord, TSalesRecordQuery> {
}
