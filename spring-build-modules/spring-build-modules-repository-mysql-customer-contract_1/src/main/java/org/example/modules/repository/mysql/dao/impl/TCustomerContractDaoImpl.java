package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.modules.repository.mysql.dao.TCustomerContractDao;
import org.example.modules.repository.mysql.entity.po.TCustomerContract;
import org.example.modules.repository.mysql.entity.query.TCustomerContractQuery;
import org.example.modules.repository.mysql.mapper.TCustomerContractMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class TCustomerContractDaoImpl extends TkBaseDaoImpl<TCustomerContract, TCustomerContractQuery, TCustomerContractMapper> implements TCustomerContractDao {
    @Override
    protected Wrapper<TCustomerContract> queryWrapper(TCustomerContractQuery tCustomerContractQuery) {
        return null;
    }
}