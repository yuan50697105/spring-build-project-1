package org.example.spring.models.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.models.customer.builder.CustomerBuilder;
import org.example.spring.infrastructures.mysql.customer.dao.TCustomerContractDao;
import org.example.spring.models.customer.entity.query.CustomerContractQuery;
import org.example.spring.models.customer.entity.result.CustomerContract;
import org.example.spring.models.customer.entity.result.CustomerContractDetails;
import org.example.spring.models.customer.entity.vo.CustomerContractFormVo;
import org.example.spring.models.customer.entity.vo.CustomerContractVo;
import org.example.spring.models.customer.repository.CustomerContractRepository;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerContract;
import org.example.spring.infrastructures.mysql.customer.table.query.TCustomerContractQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
@Transactional
public class CustomerContractRepositoryImpl extends IBaseRepositoryImpl<CustomerContract, CustomerContractFormVo, CustomerContractDetails, CustomerContractQuery> implements CustomerContractRepository {
    private final CustomerBuilder customerBuilder;
    private final TCustomerContractDao customerContractDao;

    @Override
    public Long saveWithId(CustomerContractFormVo customerContractFormVo) {
        CustomerContractVo contract = customerContractFormVo.getContract();
        TCustomerContract entity = customerBuilder.buildCustomerContract(contract);
        customerContractDao.save(entity);
        return entity.getId();
    }

    @Override
    public void update(CustomerContractFormVo customerContractFormVo) {
        Long id = customerContractFormVo.getId();
        CustomerContractVo contract = customerContractFormVo.getContract();
        Optional<TCustomerContract> optional = customerContractDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TCustomerContract tCustomerContract = optional.get();
            customerBuilder.copyCustomerContract(contract, tCustomerContract);
            customerContractDao.updateById(tCustomerContract);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        customerContractDao.removeByIds(ids);
    }

    @Override
    public CustomerContract getById(Long id) {
        return customerBuilder.buildCustomerContractResult(customerContractDao.getById(id));
    }

    @Override
    public CustomerContractDetails getDetailsById(Long id) {
        CustomerContractDetails details = new CustomerContractDetails();
        TCustomerContract contract = customerContractDao.getById(id);
        details.setContract(customerBuilder.buildCustomerContractResult(contract));
        details.setId(contract.getId());
        return details;
    }

    @Override
    public IPageData<CustomerContract> queryPage(CustomerContractQuery customerContractQuery) {
        TCustomerContractQuery query = customerBuilder.buildCustomerContractQuery(customerContractQuery);
        IPageData<TCustomerContract> contract = customerContractDao.queryPage(query);
        return customerBuilder.buildCustomerContractResult(contract);
    }

    @Override
    public List<CustomerContract> queryList(CustomerContractQuery customerContractQuery) {
        TCustomerContractQuery query = customerBuilder.buildCustomerContractQuery(customerContractQuery);
        List<TCustomerContract> contract = customerContractDao.queryList(query);
        return customerBuilder.buildCustomerContractResult(contract);
    }

    @Override
    public CustomerContract queryOne(CustomerContractQuery customerContractQuery) {
        TCustomerContractQuery query = customerBuilder.buildCustomerContractQuery(customerContractQuery);
        TCustomerContract contract = customerContractDao.queryOne(query);
        return customerBuilder.buildCustomerContractResult(contract);
    }

    @Override
    public void updateFile(Long id, String fileName) {
        customerContractDao.updateFile(id, fileName);
    }
}