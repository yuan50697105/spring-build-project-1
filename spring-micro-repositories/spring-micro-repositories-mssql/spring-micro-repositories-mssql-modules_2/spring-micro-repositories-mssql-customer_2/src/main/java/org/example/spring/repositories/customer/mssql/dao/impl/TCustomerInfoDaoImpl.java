package org.example.spring.repositories.customer.mssql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.customer.mssql.dao.TCustomerInfoDao;
import org.example.spring.repositories.customer.mssql.mapper.TCustomerInfoMapper;
import org.example.spring.repositories.customer.mssql.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.mssql.table.query.TCustomerInfoQuery;
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