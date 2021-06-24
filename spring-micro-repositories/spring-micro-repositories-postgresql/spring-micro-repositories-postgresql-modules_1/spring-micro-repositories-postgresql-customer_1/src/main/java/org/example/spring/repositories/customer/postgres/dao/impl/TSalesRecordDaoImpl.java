package org.example.spring.repositories.customer.postgres.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.customer.postgres.dao.TSalesRecordDao;
import org.example.spring.repositories.customer.postgres.mapper.TSalesRecordMapper;
import org.example.spring.repositories.customer.postgres.table.po.TSalesRecord;
import org.example.spring.repositories.customer.postgres.table.query.TSalesRecordQuery;
import org.springframework.stereotype.Repository;

@Repository
public class TSalesRecordDaoImpl extends TkBaseDaoImpl<TSalesRecord, TSalesRecordQuery, TSalesRecordMapper> implements TSalesRecordDao {
    @Override
    protected Wrapper<TSalesRecord> queryWrapper(TSalesRecordQuery tSalesRecordQuery) {
        return null;
    }
}