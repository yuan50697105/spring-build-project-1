package org.example.domains.service.impl;

import org.example.domains.service.CustomerInfoService;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.modules.repository.mysql.repository.CustomerInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerInfoServiceImpl implements CustomerInfoService {
    @Autowired
    private CustomerInfoRepository customerInfoRepository;

    @Override
    public void save(CustomerInfoVo customerInfoVo) {
        customerInfoRepository.save(customerInfoVo);
    }
}