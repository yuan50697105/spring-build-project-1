package org.example.spring.models.clickhouse.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.clickhouse.customer.dao.TCustomerContractDao;
import org.example.spring.daos.clickhouse.customer.table.po.TCustomerContract;
import org.example.spring.daos.clickhouse.customer.table.query.TCustomerContractQuery;
import org.example.spring.models.clickhouse.customer.builder.CustomerModelBuilder;
import org.example.spring.models.clickhouse.customer.entity.query.CustomerContractQuery;
import org.example.spring.models.clickhouse.customer.entity.result.CustomerContract;
import org.example.spring.models.clickhouse.customer.entity.result.CustomerContractDetails;
import org.example.spring.models.clickhouse.customer.entity.vo.CustomerContractModelVo;
import org.example.spring.models.clickhouse.customer.repository.CustomerContractRepository;
import org.example.spring.models.commons.repository.impl.IBaseRepositoryImpl;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
@Transactional
public class CustomerContractRepositoryImpl extends IBaseRepositoryImpl<CustomerContract, CustomerContractModelVo, CustomerContractDetails, CustomerContractQuery> implements CustomerContractRepository {
    private final CustomerModelBuilder customerModelBuilder;
    private final TCustomerContractDao customerContractDao;

    @Override
    public Long saveWithId(CustomerContractModelVo customerContractModelVo) {
        TCustomerContract contract = customerContractModelVo.createContractForSave();
        customerContractDao.save(contract);
        return contract.getId();
    }

    @Override
    public void update(CustomerContractModelVo customerContractModelVo) {
        Long id = customerContractModelVo.getId();
        TCustomerContract contract = customerContractModelVo.createContractForSave();
        Optional<TCustomerContract> optional = customerContractDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TCustomerContract tCustomerContract = optional.get();
            customerModelBuilder.copyCustomerContract(contract, tCustomerContract);
            customerContractDao.updateById(tCustomerContract);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        customerContractDao.removeByIds(ids);
    }

    @Override
    public CustomerContract getById(Long id) {
        return customerModelBuilder.buildCustomerContractResult(customerContractDao.getById(id));
    }

    @Override
    public CustomerContractDetails getDetailsById(Long id) {
        CustomerContractDetails details = new CustomerContractDetails();
        TCustomerContract contract = customerContractDao.getById(id);
        details.setContract(customerModelBuilder.buildCustomerContractResult(contract));
        details.setId(contract.getId());
        return details;
    }

    @Override
    public IPageData<CustomerContract> queryPage(CustomerContractQuery customerContractQuery) {
        TCustomerContractQuery query = customerModelBuilder.buildCustomerContractQuery(customerContractQuery);
        IPageData<TCustomerContract> contract = customerContractDao.queryPage(query);
        return customerModelBuilder.buildCustomerContractResult(contract);
    }

    @Override
    public List<CustomerContract> queryList(CustomerContractQuery customerContractQuery) {
        TCustomerContractQuery query = customerModelBuilder.buildCustomerContractQuery(customerContractQuery);
        List<TCustomerContract> contract = customerContractDao.queryList(query);
        return customerModelBuilder.buildCustomerContractResult(contract);
    }

    @Override
    public CustomerContract queryOne(CustomerContractQuery customerContractQuery) {
        TCustomerContractQuery query = customerModelBuilder.buildCustomerContractQuery(customerContractQuery);
        TCustomerContract contract = customerContractDao.queryOne(query);
        return customerModelBuilder.buildCustomerContractResult(contract);
    }

    @Override
    public void updateFile(Long id, String fileName) {
        customerContractDao.updateFile(id, fileName);
    }
}