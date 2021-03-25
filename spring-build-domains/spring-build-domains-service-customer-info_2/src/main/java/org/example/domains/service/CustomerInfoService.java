package org.example.domains.service;

import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;

public interface CustomerInfoService {
    void save(CustomerInfoVo customerInfoVo);
}
