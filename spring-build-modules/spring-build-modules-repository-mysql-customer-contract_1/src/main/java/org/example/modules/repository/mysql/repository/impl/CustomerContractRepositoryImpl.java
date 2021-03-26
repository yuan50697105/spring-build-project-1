package org.example.modules.repository.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.builder.CustomerContractBuilder;
import org.example.modules.repository.mysql.dao.TCustomerContractDao;
import org.example.modules.repository.mysql.entity.vo.CustomerContractVo;
import org.example.modules.repository.mysql.entity.po.TCustomerContract;
import org.example.modules.repository.mysql.entity.query.CustomerContractQuery;
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
public class CustomerContractRepositoryImpl extends IBaseRepositoryImpl<CustomerContractVo, CustomerContractVo, CustomerContractVo, CustomerContractQuery> implements CustomerContractRepository {
    private final CustomerContractBuilder customerContractBuilder;
    private final TCustomerContractDao customerContractDao;

    @Override
    public void save(CustomerContractVo customerContractVo) {
        TCustomerContract contract = customerContractBuilder.createCustomerContract(customerContractVo);
        customerContractDao.save(contract);
    }

    @Override
    public void update(CustomerContractVo customerContractVo) {
        update(customerContractVo.getId(), customerContractVo);
    }

    @Override
    public void update(Long id, CustomerContractVo formVo) {
        Optional<TCustomerContract> optional = customerContractDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TCustomerContract customerContract = optional.get();
            customerContractBuilder.copy(formVo, customerContract);
            customerContractDao.updateById(customerContract);
        }
    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public CustomerContractVo getById(Long id) {
        return null;
    }

    @Override
    public IPageData<CustomerContractVo> queryPage(CustomerContractQuery customerContractQuery) {
        return null;
    }

    @Override
    public List<CustomerContractVo> queryList(CustomerContractQuery customerContractQuery) {
        return null;
    }

    @Override
    public CustomerContractVo queryOne(CustomerContractQuery customerContractQuery) {
        return null;
    }
}