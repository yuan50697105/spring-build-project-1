package org.example.modules.repository.mysql.repository.impl;

import org.example.modules.repository.mysql.builder.CustomerInfoBuilder;
import org.example.modules.repository.mysql.dao.TCustomerInfoDao;
import org.example.modules.repository.mysql.entity.po.TCustomerInfo;
import org.example.modules.repository.mysql.entity.query.CustomerInfoQuery;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.modules.repository.mysql.repository.TCustomerInfoRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class TCustomerInfoRepositoryImpl implements TCustomerInfoRepository {
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
    public void update(Long id, CustomerInfoVo formVo) {

    }

    @Override
    public void delete(List<Long> ids) {
        customerInfoDao.removeByIds(ids);
    }

    @Override
    public CustomerInfoVo getById(Long id) {
        return null;
    }

    @Override
    public IPageData<CustomerInfoVo> queryPage(CustomerInfoQuery customerInfoQuery) {
        return null;
    }

    @Override
    public Iterable<CustomerInfoVo> queryList(CustomerInfoQuery customerInfoQuery) {
        return null;
    }

    @Override
    public CustomerInfoVo queryOne(CustomerInfoQuery customerInfoQuery) {
        return null;
    }
}