package org.example.spring.models.postgresql.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.models.postgresql.customer.builder.CustomerModelBuilder;
import org.example.spring.infrastructures.postgresql.customer.dao.TCustomerContractDao;
import org.example.spring.infrastructures.postgresql.customer.dao.TCustomerInfoDao;
import org.example.spring.models.postgresql.customer.entity.query.CustomerQuery;
import org.example.spring.models.postgresql.customer.entity.result.Customer;
import org.example.spring.models.postgresql.customer.entity.result.CustomerDetails;
import org.example.spring.models.postgresql.customer.entity.vo.CustomerModelVo;
import org.example.spring.models.postgresql.customer.repository.CustomerRepository;
import org.example.spring.infrastructures.postgresql.customer.table.po.TCustomerInfo;
import org.example.spring.infrastructures.postgresql.customer.table.query.TCustomerInfoQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.models.commons.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
@Repository
@AllArgsConstructor
@Transactional
public class CustomerRepositoryImpl extends IBaseRepositoryImpl<Customer, CustomerModelVo, CustomerDetails, CustomerQuery> implements CustomerRepository {
    private final CustomerModelBuilder customerModelBuilder;
    private final TCustomerInfoDao customerInfoDao;
    private final TCustomerContractDao customerContractDao;

    @SuppressWarnings("AlibabaSwitchStatement")
    @Override
    public Long saveWithId(CustomerModelVo customerModelVo) {
        TCustomerInfo customer = customerModelVo.createCustomerForSave();
        customerInfoDao.save(customer);
        return customer.getId();
    }

    @Override
    public void update(CustomerModelVo customerModelVo) {
        Long id = customerModelVo.getId();
        TCustomerInfo customer = customerModelVo.createCustomerForSave();
        Optional<TCustomerInfo> optional = customerInfoDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TCustomerInfo tCustomerInfo = optional.get();
            customerModelBuilder.copyCustomerInfo(customer, tCustomerInfo);
            customerInfoDao.updateById(tCustomerInfo);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        customerInfoDao.removeByIds(ids);
    }

    @Override
    public Customer getById(Long id) {
        return customerModelBuilder.buildCustomerInfoResult(customerInfoDao.getById(id));
    }

    @Override
    public CustomerDetails getDetailsById(Long id) {
        CustomerDetails details = new CustomerDetails();
        TCustomerInfo customerInfo = customerInfoDao.getById(id);
        Customer customer = customerModelBuilder.buildCustomerInfoResult(customerInfo);
        details.setCustomer(customer);
        return details;
    }

    @Override
    public IPageData<Customer> queryPage(CustomerQuery customerQuery) {
        TCustomerInfoQuery query = customerModelBuilder.buildCustomerInfoQuery(customerQuery);
        IPageData<TCustomerInfo> customerInfo = customerInfoDao.queryPage(query);
        return customerModelBuilder.buildCustomerInfoResult(customerInfo);
    }

    @Override
    public List<Customer> queryList(CustomerQuery customerQuery) {
        TCustomerInfoQuery query = customerModelBuilder.buildCustomerInfoQuery(customerQuery);
        List<TCustomerInfo> customerInfo = customerInfoDao.queryList(query);
        return customerModelBuilder.buildCustomerInfoResult(customerInfo);
    }

    @Override
    public Customer queryOne(CustomerQuery customerQuery) {
        TCustomerInfoQuery query = customerModelBuilder.buildCustomerInfoQuery(customerQuery);
        TCustomerInfo customerInfo = customerInfoDao.queryOne(query);
        return customerModelBuilder.buildCustomerInfoResult(customerInfo);
    }
}