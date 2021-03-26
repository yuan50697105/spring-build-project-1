package org.example.domains.service;

import org.example.modules.repository.mysql.entity.vo.CustomerContractFormVo;

public interface CustomerContractService {
    void save(CustomerContractFormVo customerContractResult);
}
