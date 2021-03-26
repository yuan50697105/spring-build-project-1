package org.example.domains.service.impl;

import lombok.AllArgsConstructor;
import org.example.domains.entity.CustomerDetailsResult;
import org.example.domains.entity.CustomerFormVo;
import org.example.domains.service.CustomerService;
import org.example.modules.repository.mysql.entity.vo.CustomerContractFormVo;
import org.example.modules.repository.mysql.entity.vo.CustomerContractVo;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoFormVo;
import org.example.modules.repository.mysql.entity.result.CustomerInfoResult;
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
        CustomerInfoFormVo customer = vo.getCustomer();
        Long customerId = customerInfoRepository.saveWithId(customer);
        Optional<CustomerInfoResult> optional = customerInfoRepository.getByIdOpt(customerId);
        if (optional.isPresent()) {
            CustomerInfoResult customerInfoResult = optional.get();
            CustomerContractFormVo voContract = vo.getContract();
            CustomerContractVo contract = voContract.getContract();
            contract.setCustomerId(customerInfoResult.getId());
            contract.setCustomerCode(customerInfoResult.getCode());
            customerContractRepository.saveWithId(voContract);
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