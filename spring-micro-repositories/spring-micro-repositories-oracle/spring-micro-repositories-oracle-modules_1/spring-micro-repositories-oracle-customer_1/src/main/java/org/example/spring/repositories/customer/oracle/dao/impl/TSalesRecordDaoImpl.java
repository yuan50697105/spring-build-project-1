package org.example.spring.repositories.customer.oracle.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.customer.oracle.dao.TSalesRecordDao;
import org.example.spring.repositories.customer.oracle.mapper.TSalesRecordMapper;
import org.example.spring.repositories.customer.oracle.table.po.TSalesRecord;
import org.example.spring.repositories.customer.oracle.table.query.TSalesRecordQuery;
import org.springframework.stereotype.Repository;

@Repository
public class TSalesRecordDaoImpl extends TkBaseDaoImpl<TSalesRecord, TSalesRecordQuery, TSalesRecordMapper> implements TSalesRecordDao {
    @Override
    protected Wrapper<TSalesRecord> queryWrapper(TSalesRecordQuery tSalesRecordQuery) {
        return null;
    }
}