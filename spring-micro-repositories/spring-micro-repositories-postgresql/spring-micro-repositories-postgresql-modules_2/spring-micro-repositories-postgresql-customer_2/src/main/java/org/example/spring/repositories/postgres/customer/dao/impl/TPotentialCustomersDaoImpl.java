package org.example.spring.repositories.postgres.customer.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.repositories.postgres.customer.dao.TPotentialCustomersDao;
import org.example.spring.repositories.postgres.customer.mapper.TPotentialCustomersMapper;
import org.example.spring.repositories.postgres.customer.table.po.TPotentialCustomers;
import org.example.spring.repositories.postgres.customer.table.query.TPotentialCustomersQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TPotentialCustomersDaoImpl extends TkBaseDaoImpl<TPotentialCustomers, TPotentialCustomersQuery, TPotentialCustomersMapper> implements TPotentialCustomersDao {
    @Override
    protected Wrapper<TPotentialCustomers> queryWrapper(TPotentialCustomersQuery tPotentialCustomersQuery) {
        return null;
    }
}