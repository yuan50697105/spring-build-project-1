package org.example.spring.repositories.clients.bill.mysql.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.api.BillItemsInfoRepository;
import org.example.spring.repositories.commons.entity.bill.dto.BillItemsInfoDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillItemsInfo;
import org.example.spring.repositories.commons.entity.bill.query.BillItemsInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillItemsInfoVo;
import org.example.spring.repositories.feign.bill.clients.BillItemsInfoRepositoryClient;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class BillItemsInfoRepositoryController extends CommonsFeignClientImpl<BillItemsInfo, BillItemsInfoVo, BillItemsInfoDTO, BillItemsInfoQuery, BillItemsInfoRepository> implements BillItemsInfoRepositoryClient {
    public BillItemsInfoRepositoryController(BillItemsInfoRepository repository) {
        super(repository);
    }
}