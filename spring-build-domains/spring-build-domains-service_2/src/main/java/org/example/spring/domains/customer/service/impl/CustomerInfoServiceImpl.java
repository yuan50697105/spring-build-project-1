package org.example.spring.domains.customer.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.customer.service.CustomerInfoService;
import org.example.spring.infrastructures.mysql.customer.entity.query.CustomerQuery;
import org.example.spring.infrastructures.mysql.customer.entity.result.Customer;
import org.example.spring.infrastructures.mysql.customer.entity.result.CustomerDetails;
import org.example.spring.infrastructures.mysql.customer.entity.vo.CustomerFormVo;
import org.example.spring.infrastructures.mysql.customer.repository.CustomerRepository;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CustomerInfoServiceImpl implements CustomerInfoService {
    private final CustomerRepository customerRepository;

    @Override
    public IPageData<Customer> selectPage(CustomerQuery query) {
        return customerRepository.queryPage(query);
    }

    @Override
    public List<Customer> selectList(CustomerQuery query) {
        return customerRepository.queryList(query);
    }

    @Override
    public List<Customer> selectTop(CustomerQuery query) {
        return customerRepository.queryTop(query, query.getSize());
    }

    @Override
    public Customer queryFirst(CustomerQuery query) {
        return customerRepository.queryFirst(query);
    }

    @Override
    public Customer queryOne(CustomerQuery query) {
        return customerRepository.queryOne(query);
    }

    @Override
    public CustomerDetails get(Long id) {
        return customerRepository.getById(id);
    }

    @Override
    public void save(CustomerFormVo formVo) {
        customerRepository.save(formVo);
    }

    @Override
    public void update(CustomerFormVo formVo) {
        customerRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        customerRepository.delete(ids);
    }
}