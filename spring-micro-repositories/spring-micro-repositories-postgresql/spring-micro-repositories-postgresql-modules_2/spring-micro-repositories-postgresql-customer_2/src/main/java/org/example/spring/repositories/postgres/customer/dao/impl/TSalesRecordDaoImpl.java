package org.example.spring.repositories.postgres.customer.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.spring.repositories.postgres.customer.dao.TSalesRecordDao;
import org.example.spring.repositories.postgres.customer.mapper.TSalesRecordMapper;
import org.example.spring.repositories.postgres.customer.table.po.TSalesRecord;
import org.example.spring.repositories.postgres.customer.table.query.TSalesRecordQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class TSalesRecordDaoImpl extends TkBaseDaoImpl<TSalesRecord, TSalesRecordQuery, TSalesRecordMapper> implements TSalesRecordDao {
    @Override
    protected Wrapper<TSalesRecord> queryWrapper(TSalesRecordQuery tSalesRecordQuery) {
        return null;
    }
}