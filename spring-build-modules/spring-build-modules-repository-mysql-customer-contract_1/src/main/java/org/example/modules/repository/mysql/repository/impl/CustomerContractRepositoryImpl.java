package org.example.modules.repository.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.builder.CustomerContractBuilder;
import org.example.modules.repository.mysql.dao.TCustomerContractDao;
import org.example.modules.repository.mysql.entity.query.TCustomerContractQuery;
import org.example.modules.repository.mysql.entity.vo.CustomerContractFormVo;
import org.example.modules.repository.mysql.entity.result.CustomerContractResult;
import org.example.modules.repository.mysql.entity.po.TCustomerContract;
import org.example.modules.repository.mysql.entity.query.CustomerContractQuery;
import org.example.modules.repository.mysql.entity.vo.CustomerContractVo;
import org.example.modules.repository.mysql.repository.CustomerContractRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.example.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
@AllArgsConstructor
public class CustomerContractRepositoryImpl extends IBaseRepositoryImpl<CustomerContractResult, CustomerContractFormVo, CustomerContractResult, CustomerContractQuery> implements CustomerContractRepository {
    private final CustomerContractBuilder customerContractBuilder;
    private final TCustomerContractDao customerContractDao;

    @Override
    public void save(CustomerContractFormVo customerContractVo) {
        saveWithId(customerContractVo);
    }

    @Override
    public void save(CustomerContractVo contractVo) {
        saveWithId(contractVo);
    }

    @Override
    public Long saveWithId(CustomerContractVo contractVo) {
        TCustomerContract contract = customerContractBuilder.createCustomerContract(contractVo);
        customerContractDao.save(contract);
        return contract.getId();
    }

    @Override
    public Long saveWithId(CustomerContractFormVo customerContractVo) {
        CustomerContractVo contract1 = customerContractVo.getContract();
        return saveWithId(contract1);
    }

    @Override
    public void update(CustomerContractFormVo customerContractVo) {
        update(customerContractVo.getId(), customerContractVo);
    }

    private void update(Long id, CustomerContractFormVo formVo) {
        Optional<TCustomerContract> optional = customerContractDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TCustomerContract customerContract = optional.get();
            customerContractBuilder.copy(formVo.getContract(), customerContract);
            customerContractDao.updateById(customerContract);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        customerContractDao.removeByIds(ids);
    }

    @Override
    public CustomerContractResult getById(Long id) {
        TCustomerContract customerContract = customerContractDao.getById(id);
        return customerContractBuilder.createCustomerContractVo(customerContract);
    }

    @Override
    public IPageData<CustomerContractResult> queryPage(CustomerContractQuery customerContractQuery) {
        TCustomerContractQuery contractQuery = customerContractBuilder.createCustomerContractQuery(customerContractQuery);
        IPageData<TCustomerContract> data = customerContractDao.queryPage(contractQuery);
        return customerContractBuilder.createCustomerContractVos(data);
    }

    @Override
    public List<CustomerContractResult> queryList(CustomerContractQuery customerContractQuery) {
        TCustomerContractQuery contractQuery = customerContractBuilder.createCustomerContractQuery(customerContractQuery);
        List<TCustomerContract> contracts = customerContractDao.queryList(contractQuery);
        return customerContractBuilder.createCustomerContractVos(contracts);
    }

    @Override
    public CustomerContractResult queryOne(CustomerContractQuery customerContractQuery) {
        TCustomerContractQuery contractQuery = customerContractBuilder.createCustomerContractQuery(customerContractQuery);
        TCustomerContract contract = customerContractDao.queryOne(contractQuery);
        return customerContractBuilder.createCustomerContractVo(contract);
    }

    @Override
    public List<CustomerContractResult> getListByCustomerId(Long id) {
        return customerContractBuilder.createCustomerContractVos(customerContractDao.queryListByCustomerId(id));
    }
}