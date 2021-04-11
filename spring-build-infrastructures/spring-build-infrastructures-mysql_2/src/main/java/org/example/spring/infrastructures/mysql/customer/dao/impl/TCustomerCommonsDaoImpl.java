package org.example.spring.infrastructures.mysql.customer.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.customer.dao.TCustomerCommonsDao;
import org.example.spring.infrastructures.mysql.customer.mapper.TCustomerCommonsMapper;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerCommons;
import org.example.spring.infrastructures.mysql.customer.table.query.TCustomerCommonsQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TCustomerCommonsDaoImpl extends TkBaseDaoImpl<TCustomerCommons, TCustomerCommonsQuery, TCustomerCommonsMapper> implements TCustomerCommonsDao {
    @Override
    protected Wrapper<TCustomerCommons> queryWrapper(TCustomerCommonsQuery tCustomerCommonsQuery) {
        return null;
    }
}