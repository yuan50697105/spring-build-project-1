package org.example.spring.repositories.customer.mssql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.customer.mssql.dao.TPotentialCustomersDao;
import org.example.spring.repositories.customer.mssql.mapper.TPotentialCustomersMapper;
import org.example.spring.repositories.customer.mssql.table.po.TPotentialCustomers;
import org.example.spring.repositories.customer.mssql.table.query.TPotentialCustomersQuery;
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