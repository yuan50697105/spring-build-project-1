package org.example.spring.repositories.mysql.customer.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.mysql.customer.dao.TCustomerOrderDao;
import org.example.spring.repositories.mysql.customer.mapper.TCustomerOrderMapper;
import org.example.spring.repositories.mysql.customer.table.po.TCustomerOrder;
import org.example.spring.repositories.mysql.customer.table.query.TCustomerOrderQuery;
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