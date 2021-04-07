package org.example.spring.infrastructures.mysql.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.customer.builder.CustomerBuilder;
import org.example.spring.infrastructures.mysql.customer.dao.TCustomerInfoDao;
import org.example.spring.infrastructures.mysql.customer.entity.query.CustomerQuery;
import org.example.spring.infrastructures.mysql.customer.entity.result.Customer;
import org.example.spring.infrastructures.mysql.customer.entity.result.CustomerDetails;
import org.example.spring.infrastructures.mysql.customer.entity.vo.CustomerFormVo;
import org.example.spring.infrastructures.mysql.customer.entity.vo.CustomerVo;
import org.example.spring.infrastructures.mysql.customer.repository.CustomerRepository;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerInfo;
import org.example.spring.infrastructures.mysql.customer.table.query.TCustomerInfoQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
@Transactional
public class CustomerRepositoryImpl extends IBaseRepositoryImpl<Customer, CustomerFormVo, CustomerDetails, CustomerQuery> implements CustomerRepository {
    private final CustomerBuilder customerBuilder;
    private final TCustomerInfoDao customerInfoDao;

    @Override
    public Long saveWithId(CustomerFormVo customerFormVo) {
        CustomerVo customer = customerFormVo.getCustomer();
        TCustomerInfo entity = customerBuilder.buildCustomerInfo(customer);
        customerInfoDao.save(entity);
        return entity.getId();
    }

    @Override
    public void update(CustomerFormVo customerFormVo) {
        Long id = customerFormVo.getId();
        CustomerVo customer = customerFormVo.getCustomer();
        Optional<TCustomerInfo> optional = customerInfoDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TCustomerInfo tCustomerInfo = optional.get();
            customerBuilder.copyCustomerInfo(customer, tCustomerInfo);
            customerInfoDao.updateById(tCustomerInfo);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        customerInfoDao.removeByIds(ids);
    }

    @Override
    public CustomerDetails getById(Long id) {
        CustomerDetails details = new CustomerDetails();
        details.setCustomer(customerBuilder.buildCustomerInfoResult(customerInfoDao.getById(id)));
        return details;
    }

    @Override
    public IPageData<Customer> queryPage(CustomerQuery customerQuery) {
        TCustomerInfoQuery query = customerBuilder.buildCustomerInfoQuery(customerQuery);
        IPageData<TCustomerInfo> customerInfo = customerInfoDao.queryPage(query);
        return customerBuilder.buildCustomerInfoResult(customerInfo);
    }

    @Override
    public List<Customer> queryList(CustomerQuery customerQuery) {
        TCustomerInfoQuery query = customerBuilder.buildCustomerInfoQuery(customerQuery);
        List<TCustomerInfo> customerInfo = customerInfoDao.queryList(query);
        return customerBuilder.buildCustomerInfoResult(customerInfo);
    }

    @Override
    public Customer queryOne(CustomerQuery customerQuery) {
        TCustomerInfoQuery query = customerBuilder.buildCustomerInfoQuery(customerQuery);
        TCustomerInfo customerInfo = customerInfoDao.queryOne(query);
        return customerBuilder.buildCustomerInfoResult(customerInfo);
    }
}