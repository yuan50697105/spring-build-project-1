package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.dao.TCustomerStaffInfoDao;
import org.example.modules.repository.mysql.entity.po.TCustomerStaffInfo;
import org.example.modules.repository.mysql.entity.query.TCustomerStaffInfoQuery;
import org.example.modules.repository.mysql.mapper.TCustomerStaffInfoMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@AllArgsConstructor
@Transactional
public class TCustomerStaffInfoDaoImpl extends TkBaseDaoImpl<TCustomerStaffInfo, TCustomerStaffInfoQuery, TCustomerStaffInfoMapper> implements TCustomerStaffInfoDao {
    @Override
    protected Wrapper<TCustomerStaffInfo> queryWrapper(TCustomerStaffInfoQuery tCustomerStaffInfoQuery) {
        return null;
    }
}