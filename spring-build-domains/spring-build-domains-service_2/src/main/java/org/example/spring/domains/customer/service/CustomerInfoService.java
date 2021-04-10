package org.example.spring.domains.customer.service;

import org.example.spring.infrastructures.mysql.customer.entity.query.CustomerQuery;
import org.example.spring.infrastructures.mysql.customer.entity.result.Customer;
import org.example.spring.infrastructures.mysql.customer.entity.result.CustomerDetails;
import org.example.spring.infrastructures.mysql.customer.entity.vo.CustomerFormVo;
import org.example.spring.plugins.mybatis.entity.IPageData;

import java.util.List;
import java.util.Optional;

public interface CustomerInfoService {
    IPageData<Customer> selectPage(CustomerQuery query);

    List<Customer> selectList(CustomerQuery query);

    List<Customer> selectTop(CustomerQuery query);

    Customer queryFirst(CustomerQuery query);

    default Optional<Customer> queryFirtOpt(CustomerQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    Customer queryOne(CustomerQuery query);

    default Optional<Customer> queryOneOpt(CustomerQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    CustomerDetails get(Long id);


    default Optional<CustomerDetails> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    void save(CustomerFormVo formVo);

    void update(CustomerFormVo formVo);

    void delete(List<Long> ids);
}
