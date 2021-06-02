package org.example.spring.repositories.mysql.customer.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.mysql.customer.table.po.TSalesRecord;
import org.example.spring.repositories.mysql.customer.table.query.TSalesRecordQuery;

public interface TSalesRecordDao extends TkBaseDao<TSalesRecord, TSalesRecordQuery> {
}
