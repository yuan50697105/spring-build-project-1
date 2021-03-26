package org.example.domains.service.impl;

import lombok.AllArgsConstructor;
import org.example.domains.entity.vo.CustomerVo;
import org.example.domains.service.CustomerService;
import org.example.modules.repository.mysql.entity.vo.CustomerContractVo;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoFormVo;
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
        CustomerInfoFormVo customer = vo.getCustomer();
        Long customerId = customerInfoRepository.saveWithId(customer);
        Optional<CustomerInfoFormVo> optional = customerInfoRepository.getByIdOpt(customerId);
        if (optional.isPresent()) {
            CustomerInfoFormVo customerInfoFormVo = optional.get();
            CustomerContractVo contract = vo.getContract();
            contract.setCustomerId(customerInfoFormVo.getId());
            contract.setCustomerCode(customerInfoFormVo.getCustomerCode());
            customerContractRepository.saveWithId(contract);
        }
    }
}