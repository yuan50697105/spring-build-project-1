package org.example.domains.service.impl;

import org.example.domains.service.CustomerInfoService;
import org.example.modules.repository.mysql.entity.query.CustomerInfoQuery;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoFormVo;
import org.example.modules.repository.mysql.entity.result.CustomerInfoResult;
import org.example.modules.repository.mysql.repository.CustomerInfoRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerInfoServiceImpl implements CustomerInfoService {
    @Autowired
    private CustomerInfoRepository customerInfoRepository;

    @Override
    public IPageData<CustomerInfoResult> page(CustomerInfoQuery query) {
        return customerInfoRepository.queryPage(query);
    }

    @Override
    public List<CustomerInfoResult> list(CustomerInfoQuery query) {
        return customerInfoRepository.queryList(query);
    }

    @Override
    public void save(CustomerInfoFormVo customerInfoFormVo) {
        customerInfoRepository.save(customerInfoFormVo);
    }

    @Override
    public void update(Long id, CustomerInfoFormVo customerInfoFormVo) {
        customerInfoRepository.update(id, customerInfoFormVo);
    }

    @Override
    public void update(CustomerInfoFormVo customerInfoFormVo) {
        customerInfoRepository.update(customerInfoFormVo);
    }

    @Override
    public CustomerInfoResult get(Long id) {
        return customerInfoRepository.getById(id);
    }
}