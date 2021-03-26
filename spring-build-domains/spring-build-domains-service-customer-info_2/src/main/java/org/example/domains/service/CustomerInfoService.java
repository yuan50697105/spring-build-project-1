package org.example.domains.service;

import org.example.modules.repository.mysql.entity.query.CustomerInfoQuery;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoFormVo;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.plugins.mybatis.entity.IPageData;

import java.util.List;

public interface CustomerInfoService {
    IPageData<CustomerInfoVo> page(CustomerInfoQuery query);

    List<CustomerInfoVo> list(CustomerInfoQuery query);

    void save(CustomerInfoFormVo customerInfoFormVo);

    void update1(Long id, CustomerInfoFormVo customerInfoFormVo);

    void update2(CustomerInfoFormVo customerInfoFormVo);

    CustomerInfoVo get(Long id);
}
