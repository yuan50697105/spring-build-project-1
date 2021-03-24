package org.example.modules.repository.mysql.repository.impl;

import org.example.modules.repository.mysql.builder.CustomerInfoBuilder;
import org.example.modules.repository.mysql.dao.TCustomerInfoDao;
import org.example.modules.repository.mysql.entity.po.TCustomerInfo;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.modules.repository.mysql.repository.TCustomerInfoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class TCustomerInfoRespositoryImpl implements TCustomerInfoRespository {
    @Autowired
    private CustomerInfoBuilder customerInfoBuilder;
    @Autowired
    private TCustomerInfoDao customerInfoDao;

    @Override
    public void save(CustomerInfoVo customerInfoVo) {
        TCustomerInfo customerInfo = customerInfoBuilder.generateCustomer(customerInfoVo.getCustomer());
        customerInfoDao.save(customerInfo);
    }

    @Override
    public void update(CustomerInfoVo customerInfoVo) {
        TCustomerInfo tCustomerInfo = customerInfoDao.getById(customerInfoVo.getId());
        CustomerInfoVo.CustomerInfo customer = customerInfoVo.getCustomer();
        customerInfoBuilder.copyCustomer(customer, tCustomerInfo);
    }

    @Override
    public void delete(List<Long> ids) {
        customerInfoDao.removeByIds(ids);
    }
}