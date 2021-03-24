package org.example.domains.service.impl;

import org.example.domains.service.CustomerInfoService;
import org.example.modules.repository.mysql.repository.TCustomerInfoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerInfoServiceImpl implements CustomerInfoService {
    @Autowired
    private TCustomerInfoRespository customerInfoRespository;

}