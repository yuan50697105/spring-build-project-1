package org.example.spring.repositories.postgres.customer.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.postgres.customer.table.po.TSalesRecord;
import org.example.spring.repositories.postgres.customer.table.query.TSalesRecordQuery;

public interface TSalesRecordDao extends TkBaseDao<TSalesRecord, TSalesRecordQuery> {
}
