package org.example.spring.repositories.clients.customer.postgres.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.customer.api.SellerInfoRepository;
import org.example.spring.repositories.commons.entity.customer.dto.SellerInfoDTO;
import org.example.spring.repositories.commons.entity.customer.po.SellerInfo;
import org.example.spring.repositories.commons.entity.customer.query.SellerInfoQuery;
import org.example.spring.repositories.commons.entity.customer.vo.SellerInfoVo;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.example.spring.repositories.feign.customer.clients.SellerInfoRepositoryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class SellerInfoRepositoryController extends CommonsFeignClientImpl<SellerInfo, SellerInfoVo, SellerInfoDTO, SellerInfoQuery, SellerInfoRepository> implements SellerInfoRepositoryClient {
    public SellerInfoRepositoryController(SellerInfoRepository repository) {
        super(repository);
    }
}