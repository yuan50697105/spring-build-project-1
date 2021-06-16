package org.example.spring.repositories.clients.customer.oracle.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.customer.api.SellerInfoRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.clients.dubbo.customer.api.SellerInfoDubboRepository;
import org.example.spring.repositories.commons.entity.customer.dto.SellerInfoDTO;
import org.example.spring.repositories.commons.entity.customer.po.SellerInfo;
import org.example.spring.repositories.commons.entity.customer.query.SellerInfoQuery;
import org.example.spring.repositories.commons.entity.customer.vo.SellerInfoVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class SellerInfoDubboRepositoryImpl extends CommonsDubboRepositoryImpl<SellerInfo, SellerInfoVo, SellerInfoDTO, SellerInfoQuery, SellerInfoRepository> implements SellerInfoDubboRepository {
    protected SellerInfoDubboRepositoryImpl(SellerInfoRepository repository) {
        super(repository);
    }
}