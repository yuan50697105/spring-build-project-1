package org.example.domains.service;

import org.example.domains.entity.vo.CustomerDetailsVo;
import org.example.domains.entity.vo.CustomerVo;

public interface CustomerService {
    void save(CustomerVo vo);

    CustomerDetailsVo get(Long id);
}
