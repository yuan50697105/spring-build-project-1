package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.modules.repository.mysql.dao.TCustomerInfoDao;
import org.example.modules.repository.mysql.table.po.TCustomerInfo;
import org.example.modules.repository.mysql.table.query.TCustomerInfoQuery;
import org.example.modules.repository.mysql.mapper.TCustomerInfoMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class TCustomerInfoDaoImpl extends TkBaseDaoImpl<TCustomerInfo, TCustomerInfoQuery, TCustomerInfoMapper> implements TCustomerInfoDao {
    @Override
    protected Wrapper<TCustomerInfo> queryWrapper(TCustomerInfoQuery tCustomerInfoQuery) {
        return null;
    }
}