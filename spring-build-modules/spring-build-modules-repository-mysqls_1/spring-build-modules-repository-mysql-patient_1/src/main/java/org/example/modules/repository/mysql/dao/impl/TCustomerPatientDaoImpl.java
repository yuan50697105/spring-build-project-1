package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.dao.TCustomerPatientDao;
import org.example.modules.repository.mysql.table.po.TCustomerPatient;
import org.example.modules.repository.mysql.table.query.TCustomerPatientQuery;
import org.example.modules.repository.mysql.mapper.TCustomerPatientMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@AllArgsConstructor
@Transactional
public class TCustomerPatientDaoImpl extends TkBaseDaoImpl<TCustomerPatient, TCustomerPatientQuery, TCustomerPatientMapper> implements TCustomerPatientDao {
    @Override
    protected Wrapper<TCustomerPatient> queryWrapper(TCustomerPatientQuery tCustomerPatientQuery) {
        return null;
    }
}