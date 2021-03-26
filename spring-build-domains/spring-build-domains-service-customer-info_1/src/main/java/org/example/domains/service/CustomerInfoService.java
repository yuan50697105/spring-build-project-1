package org.example.domains.service;

import org.example.modules.repository.mysql.entity.query.CustomerInfoQuery;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoFormVo;
import org.example.modules.repository.mysql.entity.result.CustomerInfoResult;
import org.example.plugins.mybatis.entity.IPageData;

import java.util.List;

public interface CustomerInfoService {
    IPageData<CustomerInfoResult> page(CustomerInfoQuery query);

    List<CustomerInfoResult> list(CustomerInfoQuery query);

    void save(CustomerInfoFormVo customerInfoFormVo);

    void update1(Long id, CustomerInfoFormVo customerInfoFormVo);

    void update2(CustomerInfoFormVo customerInfoFormVo);

    CustomerInfoResult get(Long id);
}
