package org.example.domains.service.impl;

import lombok.AllArgsConstructor;
import org.example.domains.service.CustomerContractService;
import org.example.modules.repository.mysql.entity.vo.CustomerContractFormVo;
import org.example.modules.repository.mysql.repository.CustomerContractRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class CustomerContractServiceImpl implements CustomerContractService {
    private final CustomerContractRepository customerContractRepository;

    @Override
    public void save(CustomerContractFormVo customerContractResult) {
        customerContractRepository.saveWithId(customerContractResult);
    }
}