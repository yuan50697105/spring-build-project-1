package org.example.domains.service;

import org.example.modules.repository.mysql.entity.query.CustomerInfoQuery;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoFormVo;
import org.example.modules.repository.mysql.entity.result.CustomerInfo;
import org.example.plugins.mybatis.entity.IPageData;

import java.util.List;

public interface CustomerInfoService {
    IPageData<CustomerInfo> page(CustomerInfoQuery query);

    List<CustomerInfo> list(CustomerInfoQuery query);

    CustomerInfo one(CustomerInfoQuery query);

    void save(CustomerInfoFormVo customerInfoFormVo);

    void update(Long id, CustomerInfoFormVo customerInfoFormVo);

    void update(CustomerInfoFormVo customerInfoFormVo);

    CustomerInfo get(Long id);
}
