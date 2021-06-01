package org.example.spring.daos.mssql.customer.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.daos.mssql.customer.dao.TCustomerOrderDao;
import org.example.spring.daos.mssql.customer.mapper.TCustomerOrderMapper;
import org.example.spring.daos.mssql.customer.table.po.TCustomerOrder;
import org.example.spring.daos.mssql.customer.table.query.TCustomerOrderQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TCustomerOrderDaoImpl extends TkBaseDaoImpl<TCustomerOrder, TCustomerOrderQuery, TCustomerOrderMapper> implements TCustomerOrderDao {
    @Override
    protected Wrapper<TCustomerOrder> queryWrapper(TCustomerOrderQuery tCustomerOrderQuery) {
        return null;
    }
}