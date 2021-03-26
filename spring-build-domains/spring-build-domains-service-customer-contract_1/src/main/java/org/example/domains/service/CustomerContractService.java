package org.example.domains.service;

import org.example.modules.repository.mysql.entity.vo.CustomerContractVo;

public interface CustomerContractService {
    void save(CustomerContractVo customerContractVo);
}
