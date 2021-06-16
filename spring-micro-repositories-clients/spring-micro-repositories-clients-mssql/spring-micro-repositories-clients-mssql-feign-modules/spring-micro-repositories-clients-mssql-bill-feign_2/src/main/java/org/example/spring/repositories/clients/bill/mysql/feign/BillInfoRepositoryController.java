package org.example.spring.repositories.clients.bill.mssql.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.api.BillInfoRepository;
import org.example.spring.repositories.commons.entity.bill.dto.BillInfoDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillInfo;
import org.example.spring.repositories.commons.entity.bill.query.BillInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillInfoVo;
import org.example.spring.repositories.feign.bill.clients.BillInfoRepositoryClient;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class BillInfoRepositoryController extends CommonsFeignClientImpl<BillInfo, BillInfoVo, BillInfoDTO, BillInfoQuery, BillInfoRepository> implements BillInfoRepositoryClient {
    public BillInfoRepositoryController(BillInfoRepository repository) {
        super(repository);
    }
}