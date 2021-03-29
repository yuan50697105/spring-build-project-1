package org.example.domains.service.impl;

import lombok.AllArgsConstructor;
import org.example.domains.entity.CustomerDetailsResult;
import org.example.domains.entity.CustomerFormVo;
import org.example.domains.service.CustomerService;
import org.example.modules.repository.mysql.entity.vo.CustomerContractVo;
import org.example.modules.repository.mysql.entity.result.CustomerInfo;
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
    public void save(CustomerFormVo vo) {
        CustomerInfoVo customer = vo.getCustomer();
        Long customerId = customerInfoRepository.saveWithId(customer);
        Optional<CustomerInfo> optional = customerInfoRepository.getByIdOpt(customerId);
        if (optional.isPresent()) {
            CustomerInfo customerInfo = optional.get();
            CustomerContractVo contract = vo.getContract();
            contract.setCustomerId(customerInfo.getId());
            contract.setCustomerCode(customerInfo.getCode());
            customerContractRepository.saveWithId(contract);
        }
    }

    @Override
    public CustomerDetailsResult get(Long id) {
        CustomerDetailsResult customerDetailsResult = new CustomerDetailsResult();
        customerDetailsResult.setCustomer(customerInfoRepository.getById(id));
        customerDetailsResult.setContracts(customerContractRepository.getListByCustomerId(id));
        return customerDetailsResult;
    }
}