package org.example.spring.domains.customer.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.customer.service.CustomerContractService;
import org.example.spring.infrastructures.mysql.customer.entity.query.CustomerContractQuery;
import org.example.spring.infrastructures.mysql.customer.entity.result.CustomerContract;
import org.example.spring.infrastructures.mysql.customer.entity.result.CustomerContractDetails;
import org.example.spring.infrastructures.mysql.customer.entity.vo.CustomerContractFormVo;
import org.example.spring.infrastructures.mysql.customer.repository.CustomerContractRepository;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class CustomerContractServiceImpl implements CustomerContractService {
    private final CustomerContractRepository customerContractRepository;

    @Override
    public IPageData<CustomerContract> selectPage(CustomerContractQuery query) {
        return customerContractRepository.queryPage(query);
    }

    @Override
    public List<CustomerContract> selectList(CustomerContractQuery query) {
        return customerContractRepository.queryList(query);
    }

    @Override
    public List<CustomerContract> selectTop(CustomerContractQuery query) {
        return customerContractRepository.queryTop(query, query.getSize());
    }

    @Override
    public CustomerContract selectFirst(CustomerContractQuery query) {
        return customerContractRepository.queryFirst(query);
    }

    @Override
    public CustomerContract selectOne(CustomerContractQuery query) {
        return customerContractRepository.queryOne(query);
    }

    @Override
    public CustomerContractDetails get(Long id) {
        return customerContractRepository.getById(id);
    }

    @Override
    public void save(CustomerContractFormVo formVo) {
        customerContractRepository.save(formVo);
    }

    @Override
    public void update(CustomerContractFormVo formVo) {
        customerContractRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        customerContractRepository.delete(ids);
    }
}