package org.example.spring.repositories.customer.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.postgres.table.po.TSalesRecord;
import org.example.spring.repositories.customer.postgres.table.query.TSalesRecordQuery;

public interface TSalesRecordDao extends TkBaseDao<TSalesRecord, TSalesRecordQuery> {
}
