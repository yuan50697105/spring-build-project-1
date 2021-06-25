package org.example.spring.repositories.clients.bill.postgres.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.api.BillSubInfoRepository;
import org.example.spring.repositories.commons.entity.bill.dto.BillSubInfoDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillSubInfo;
import org.example.spring.repositories.commons.entity.bill.query.BillSubInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillSubInfoVo;
import org.example.spring.repositories.feign.bill.clients.BillSubInfoRepositoryClient;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class BillSubInfoRepositoryController extends CommonsFeignClientImpl<BillSubInfo, BillSubInfoVo, BillSubInfoDTO, BillSubInfoQuery, BillSubInfoRepository> implements BillSubInfoRepositoryClient {
    public BillSubInfoRepositoryController(BillSubInfoRepository repository) {
        super(repository);
    }
}