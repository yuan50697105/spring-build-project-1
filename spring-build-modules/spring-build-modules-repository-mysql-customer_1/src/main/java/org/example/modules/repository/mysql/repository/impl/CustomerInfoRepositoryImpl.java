package org.example.modules.repository.mysql.repository.impl;

import org.example.modules.repository.mysql.builder.CustomerInfoBuilder;
import org.example.modules.repository.mysql.dao.TCustomerInfoDao;
import org.example.modules.repository.mysql.entity.po.TCustomerInfo;
import org.example.modules.repository.mysql.entity.query.CustomerInfoQuery;
import org.example.modules.repository.mysql.entity.query.TCustomerInfoQuery;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoFormVo;
import org.example.modules.repository.mysql.entity.result.CustomerInfo;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.modules.repository.mysql.repository.CustomerInfoRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CustomerInfoRepositoryImpl implements CustomerInfoRepository {
    @Autowired
    private CustomerInfoBuilder customerInfoBuilder;
    @Autowired
    private TCustomerInfoDao customerInfoDao;

    @Override
    public Long saveWithId(CustomerInfoVo customer) {
        TCustomerInfo customerInfo = customerInfoBuilder.generateCustomer(customer);
        customerInfoDao.save(customerInfo);
        return customerInfo.getId();
    }

    @Override
    public void save(CustomerInfoVo customer) {
        saveWithId(customer);
    }
    @Override
    public void save(CustomerInfoFormVo customerInfoFormVo) {
        saveWithId(customerInfoFormVo);
    }

    @Override
    public Long saveWithId(CustomerInfoFormVo customerInfoFormVo) {
        return saveWithId(customerInfoFormVo.getCustomer());
    }

    @Override
    public void update(CustomerInfoFormVo customerInfoFormVo) {
        TCustomerInfo tCustomerInfo = customerInfoDao.getById(customerInfoFormVo.getId());
        CustomerInfoVo customer = customerInfoFormVo.getCustomer();
        customerInfoBuilder.copyCustomer(customer, tCustomerInfo);
        customerInfoDao.updateById(tCustomerInfo);
    }

    @Override
    public void delete(List<Long> ids) {
        customerInfoDao.removeByIds(ids);
    }

    @Override
    public CustomerInfo getById(Long id) {
        TCustomerInfo customerInfo = customerInfoDao.getById(id);
        return customerInfoBuilder.generateCustomerResult(customerInfo);
    }

    @Override
    public CustomerInfo queryOne(CustomerInfoQuery customerInfoQuery) {
        TCustomerInfoQuery query = customerInfoBuilder.generateCustomerQuery(customerInfoQuery);
        TCustomerInfo customerInfo = customerInfoDao.queryOne(query);
        return customerInfoBuilder.generateCustomerResult(customerInfo);
    }

    @Override
    public List<CustomerInfo> queryList(CustomerInfoQuery customerInfoQuery) {
        TCustomerInfoQuery query = customerInfoBuilder.generateCustomerQuery(customerInfoQuery);
        List<TCustomerInfo> customerInfo = customerInfoDao.queryList(query);
        return customerInfoBuilder.generateCustomerResult(customerInfo);
    }

    @Override
    public IPageData<CustomerInfo> queryPage(CustomerInfoQuery customerInfoQuery) {
        TCustomerInfoQuery query = customerInfoBuilder.generateCustomerQuery(customerInfoQuery);
        IPageData<TCustomerInfo> customerInfo = customerInfoDao.queryPage(query);
        return customerInfoBuilder.generateCustomerResult(customerInfo);
    }
}