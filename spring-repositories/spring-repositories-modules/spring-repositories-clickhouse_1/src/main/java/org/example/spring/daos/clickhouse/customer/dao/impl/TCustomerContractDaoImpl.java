package org.example.spring.repositories.clickhouse.customer.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.repositories.clickhouse.customer.dao.TCustomerContractDao;
import org.example.spring.repositories.clickhouse.customer.mapper.TCustomerContractMapper;
import org.example.spring.repositories.clickhouse.customer.table.po.TCustomerContract;
import org.example.spring.repositories.clickhouse.customer.table.query.TCustomerContractQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TCustomerContractDaoImpl extends TkBaseDaoImpl<TCustomerContract, TCustomerContractQuery, TCustomerContractMapper> implements TCustomerContractDao {
    @Override
    protected Wrapper<TCustomerContract> queryWrapper(TCustomerContractQuery tCustomerContractQuery) {
        return null;
    }

    @Override
    public void updateFile(Long id, String fileName) {
        lambdaUpdate().eq(IBaseEntity::getId, id).set(TCustomerContract::getFileName, fileName).update();
    }
}