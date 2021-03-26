package org.example.modules.repository.mysql.repository.impl;

import org.example.modules.repository.mysql.builder.CustomerInfoBuilder;
import org.example.modules.repository.mysql.dao.TCustomerInfoDao;
import org.example.modules.repository.mysql.entity.po.TCustomerInfo;
import org.example.modules.repository.mysql.entity.query.CustomerInfoQuery;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoFormVo;
import org.example.modules.repository.mysql.entity.result.CustomerInfoResult;
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
    public void save(CustomerInfoFormVo customerInfoFormVo) {
        saveWithId(customerInfoFormVo);
    }

    @Override
    public Long saveWithId(CustomerInfoFormVo customerInfoFormVo) {
        TCustomerInfo customerInfo = customerInfoBuilder.generateCustomer(customerInfoFormVo.getCustomer());
        customerInfoDao.save(customerInfo);
        return customerInfo.getId();
    }

    @Override
    public void update(CustomerInfoFormVo customerInfoFormVo) {
        TCustomerInfo tCustomerInfo = customerInfoDao.getById(customerInfoFormVo.getId());
        CustomerInfoVo customer = customerInfoFormVo.getCustomer();
        customerInfoBuilder.copyCustomer(customer, tCustomerInfo);
    }

    @Override
    public void update(Long id, CustomerInfoFormVo formVo) {

    }

    @Override
    public void delete(List<Long> ids) {
        customerInfoDao.removeByIds(ids);
    }

    @Override
    public CustomerInfoResult getById(Long id) {
        return null;
    }

    @Override
    public IPageData<CustomerInfoResult> queryPage(CustomerInfoQuery customerInfoQuery) {
        return null;
    }

    @Override
    public List<CustomerInfoResult> queryList(CustomerInfoQuery customerInfoQuery) {
        return null;
    }

    @Override
    public CustomerInfoResult queryOne(CustomerInfoQuery customerInfoQuery) {
        return null;
    }
}