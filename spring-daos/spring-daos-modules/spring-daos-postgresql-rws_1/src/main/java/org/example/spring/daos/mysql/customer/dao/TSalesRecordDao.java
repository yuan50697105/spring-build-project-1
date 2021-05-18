package org.example.spring.daos.mysql.customer.dao;

import org.example.spring.daos.mysql.customer.table.po.TSalesRecord;
import org.example.spring.daos.mysql.customer.table.query.TSalesRecordQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TSalesRecordDao extends TkBaseDao<TSalesRecord, TSalesRecordQuery> {
}
