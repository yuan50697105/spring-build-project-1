package org.example.domains.service;

import org.example.domains.entity.CustomerDetailsResult;
import org.example.domains.entity.CustomerFormVo;

public interface CustomerService {
    void save(CustomerFormVo vo);

    CustomerDetailsResult get(Long id);
}
