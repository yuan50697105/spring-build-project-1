package org.example.domains.service.impl;

import lombok.AllArgsConstructor;
import org.example.domains.entity.vo.CustomerVo;
import org.example.domains.service.CustomerService;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.modules.repository.mysql.repository.CustomerContractRepository;
import org.example.modules.repository.mysql.repository.CustomerInfoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerInfoRepository customerInfoRepository;
    private final CustomerContractRepository customerContractRepository;

    @Override
    public void save(CustomerVo vo) {
        CustomerInfoVo customer = vo.getCustomer();
        customerInfoRepository.save(customer);
    }
}