package org.example.spring.domains.customer.service;

import org.example.spring.models.customer.entity.query.CustomerQuery;
import org.example.spring.models.customer.entity.result.Customer;
import org.example.spring.models.customer.entity.result.CustomerDetails;
import org.example.spring.models.customer.entity.vo.CustomerFormVo;
import org.example.spring.plugins.mybatis.entity.IPageData;

import java.util.List;
import java.util.Optional;

public interface CustomerInfoService {
    IPageData<Customer> selectPage(CustomerQuery query);

    List<Customer> selectList(CustomerQuery query);

    List<Customer> selectTop(CustomerQuery query);

    Customer selectFirst(CustomerQuery query);

    default Optional<Customer> selectFirstOpt(CustomerQuery query) {
        return Optional.ofNullable(selectFirst(query));
    }

    Customer selectOne(CustomerQuery query);

    default Optional<Customer> selectOneOpt(CustomerQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    CustomerDetails get(Long id);


    default Optional<CustomerDetails> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    void save(CustomerFormVo formVo);

    void update(CustomerFormVo formVo);

    void delete(List<Long> ids);
}
