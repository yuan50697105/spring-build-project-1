package org.example.spring.daos.clickhouse.customer.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.daos.clickhouse.customer.dao.TCustomerInfoDao;
import org.example.spring.daos.clickhouse.customer.mapper.TCustomerInfoMapper;
import org.example.spring.daos.clickhouse.customer.table.po.TCustomerInfo;
import org.example.spring.daos.clickhouse.customer.table.query.TCustomerInfoQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TCustomerInfoDaoImpl extends TkBaseDaoImpl<TCustomerInfo, TCustomerInfoQuery, TCustomerInfoMapper> implements TCustomerInfoDao {
    @Override
    protected Wrapper<TCustomerInfo> queryWrapper(TCustomerInfoQuery tCustomerInfoQuery) {
        return null;
    }
}