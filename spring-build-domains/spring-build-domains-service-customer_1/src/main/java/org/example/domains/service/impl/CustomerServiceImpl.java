package org.example.domains.service.impl;

import lombok.AllArgsConstructor;
import org.example.domains.entity.vo.CustomerVo;
import org.example.domains.service.CustomerService;
import org.example.modules.repository.mysql.entity.vo.CustomerContractVo;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.modules.repository.mysql.repository.CustomerContractRepository;
import org.example.modules.repository.mysql.repository.CustomerInfoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerInfoRepository customerInfoRepository;
    private final CustomerContractRepository customerContractRepository;

    @Override
    public void save(CustomerVo vo) {
        CustomerInfoVo customer = vo.getCustomer();
        Long customerId = customerInfoRepository.saveWithId(customer);
        Optional<CustomerInfoVo> optional = customerInfoRepository.getByIdOpt(customerId);
        if (optional.isPresent()) {
            CustomerInfoVo customerInfoVo = optional.get();
            CustomerContractVo contract = vo.getContract();
            contract.setCustomerId(customerInfoVo.getId());
            contract.setCustomerCode(customerInfoVo.getCustomerCode());
            customerContractRepository.saveWithId(contract);
        }
    }
}